import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage; 
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu; 
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;





/**
 * The GUI of the program, where all the object are pressent. For instance the,
 * menu, buttons, panel and label.
 *
 * @author Harkeerat Singh Sawhney
 * @version 3.06.2021
 */
public class DrawFrame extends JFrame
{
    //Label object where the final output is shown.
    private JLabel label;
    
    //MenuBar object where the MenuBar is made.
    private final JMenuBar menuBar;
    //Menuobject where the menu's needed are made.
    private final JMenu file;
    private final JMenu edit;
    private final JMenu backgroundColor; 
    private final JMenu fontColor;
    
    //Custom RGB colors.
    private final Color blue = new Color(51,153,255);    //Light Blue Color.
    private final Color yellow = new Color(226,249,80);  //Light Yellow Color.
    private final Color green = new Color(80,249,165);   //Light Green Color.
    private final Color pink = new Color(185,140,238);   //Light Pink Color.
    private final Color red = new Color(255,63,114);     //Light Red Color.
    
    /**
     * Constructor for objects of class DrawFrame.
     * @param draw which is used to get the function
     */
    public DrawFrame(final Draw draw)
    {
        super();
        setTitle("Math Operation Visualizer");                 //Title of the Program.
        setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(800, 500));        //Size of the Resolution.
        final JPanel panel = new JPanel();
        
        //Making new Objects for the MenuBar
        menuBar = new JMenuBar();
        file = new JMenu("File");      
        edit = new JMenu("Edit");
        backgroundColor = new JMenu("Background Color");
        fontColor = new JMenu("Font Color");
        
        //Buttons for the change of color of the background.
        final JButton blueBackground = new JButton("Blue");
        blueBackground.setPreferredSize(new Dimension(90, 20));
        blueBackground.setBackground(Color.WHITE);
        
        final JButton yellowBackground = new JButton("Yellow");
        yellowBackground.setPreferredSize(new Dimension(90, 20));
        yellowBackground.setBackground(Color.WHITE);
        
        final JButton greenBackground = new JButton("Green");
        greenBackground.setPreferredSize(new Dimension(90, 20));
        greenBackground.setBackground(Color.WHITE);
        
        final JButton pinkBackground = new JButton("Pink");
        pinkBackground.setPreferredSize(new Dimension(90, 20));
        pinkBackground.setBackground(Color.WHITE);
        
        final JButton redBackground = new JButton("Red");
        redBackground.setPreferredSize(new Dimension(90, 20));
        redBackground.setBackground(Color.WHITE);     
        
        //Buttons for the change color of the text.
        final JButton blackFont = new JButton("Black");
        blackFont.setPreferredSize(new Dimension(90, 20));
        blackFont.setBackground(Color.WHITE);   
        
        final JButton redFont = new JButton("Red");
        redFont.setPreferredSize(new Dimension(90, 20));
        redFont.setBackground(Color.WHITE);   
        
        final JButton blueFont = new JButton("Blue");
        blueFont.setPreferredSize(new Dimension(90, 20));
        blueFont.setBackground(Color.WHITE);   
        
        final JButton yellowFont = new JButton("Yellow");
        yellowFont.setPreferredSize(new Dimension(90, 20));
        yellowFont.setBackground(Color.WHITE);   
        
        final JButton whiteFont = new JButton("White");
        whiteFont.setPreferredSize(new Dimension(90, 20));
        whiteFont.setBackground(Color.WHITE);   
                
        //Button for the download the lable as PNG
        final JButton download = new JButton("Download Image");  
        download.setPreferredSize(new Dimension(150, 30));
        download.setBackground(Color.WHITE);
        
        final JButton help = new JButton("Help");  
        help.setPreferredSize(new Dimension(150, 30));
        help.setBackground(Color.WHITE);     
        
        //Addiing the object to the menubar
        menuBar.add(file);
        menuBar.add(edit);
        edit.add(backgroundColor);
        edit.add(fontColor);
        file.add(download);
        file.add(help);
        
        //Adding the color's buttons.
        backgroundColor.add(blueBackground);
        backgroundColor.add(yellowBackground);
        backgroundColor.add(greenBackground);
        backgroundColor.add(pinkBackground);
        backgroundColor.add(redBackground);
        
        //Adding the font's buttons.
        fontColor.add(blackFont);
        fontColor.add(redFont);
        fontColor.add(blueFont);
        fontColor.add(yellowFont);
        fontColor.add(whiteFont);
        
        //Adding the menubar to the frame.
        add(menuBar, BorderLayout.NORTH);
        setJMenuBar(menuBar);   
        
        //Making the button, which would evalute the expression in the field.
        final JButton ev = new JButton("Evaluate");
        ev.setPreferredSize(new Dimension(100, 30));
        
        //The text field where user's inputs the expression.
        final JTextField expressionField = new JTextField(draw.getFunction().getExpression(), 15);
        Font bigFont = expressionField.getFont().deriveFont(Font.PLAIN, 30f);
        expressionField.setFont(bigFont);        
        
        panel.add(expressionField);
        panel.add(ev);
        add(panel, BorderLayout.NORTH);
        
        //Label,where the expression is shown to the users.
        label = new JLabel(draw.getFunction().getExpression(), SwingConstants.CENTER);
        label.setBounds(50, 50, 100, 30);
        label.setFont(new Font("Verdana", Font.PLAIN, 50));
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        
        
        add(label, BorderLayout.CENTER);
        
        ev.addActionListener(new ActionListener() { 
            public void actionPerformed(final ActionEvent e) {
                final String text = expressionField.getText();
                draw.getFunction().setExpression(text);
                final String newText = draw.getFunction().getExpression();
                label.setText(newText);
            }
        });
        
        yellowBackground.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                label.setBackground(yellow);
                label.setOpaque(true);
            }
        });
        
        greenBackground.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                label.setBackground(green);
                label.setOpaque(true);
            }
        });
        
        pinkBackground.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                label.setBackground(pink);
                label.setOpaque(true);
            }
        });
        
        redBackground.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                label.setBackground(red);
                label.setOpaque(true);
            }
        });
        
        blueBackground.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                label.setBackground(blue);
                label.setOpaque(true);
            }
        });
        
        
        blackFont.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                label.setForeground(Color.black);
                label.setOpaque(true);
            }
        });
        
        redFont.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                label.setForeground(Color.red);
                label.setOpaque(true);
            }
        });
        
        yellowFont.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                label.setForeground(Color.yellow);
                label.setOpaque(true);
            }
        });
        
        blueFont.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                label.setForeground(Color.blue);
                label.setOpaque(true);
            }
        });
        
        whiteFont.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                label.setForeground(Color.white);
                label.setOpaque(true);
            }
        });
        
        
        download.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                BufferedImage img = new BufferedImage(label.getWidth(), label.getHeight(), BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = img.createGraphics();
                label.printAll(g2d);
                g2d.dispose();
                try {
                    ImageIO.write(img, "png", new File("C:\\Users\\Admin\\Desktop\\Math_Expresion.png"));
                } catch (java.io.IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        });
        
        help.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                HelpPage.main();
            }
        });
        
        pack();
    }

}
