import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


/**
 * The GUI of the program, where all the object are pressent. For instance the,
 * menu, buttons, panel and label.
 *
 * @author Harkeerat Singh Sawhney
 * @version 3.06.2021
 */
public class HelpFrame extends JFrame
{
    final Function function = new Function(null);
    
    /**
     * Constructor for objects of class DrawFrame.
     */
    public HelpFrame()
    {
        super();
        setTitle("Help");                                      //Title of the Program.
        setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(500, 300));        //Size of the Resolution.        
        
        final JPanel Left = new JPanel();
        final JPanel Right = new JPanel();        
        Left.setLayout(new BoxLayout(Left, BoxLayout.PAGE_AXIS));
        Right.setLayout(new BoxLayout(Right, BoxLayout.PAGE_AXIS));
        
        //Helping Method for Addition.        
        final JLabel additionInput = new JLabel("Input: 1+1  ", SwingConstants.LEFT);
        function.setExpression("1+1");
        final JLabel additionOutput = new JLabel(function.getExpression());
        
        additionInput.setBounds(50, 50, 100, 30);
        additionInput.setFont(new Font("Verdana", Font.BOLD, 20));
        additionInput.setOpaque(true);
        additionOutput.setBounds(50, 50, 100, 30);
        additionOutput.setFont(new Font("Verdana", Font.BOLD, 20));
        additionOutput.setOpaque(true);
        
        Left.add(additionInput);
        Right.add(additionOutput);
        
        //Helping Method for Subtraction.   
        final JLabel subtractionInput = new JLabel("Input: 1-1  ", SwingConstants.LEFT);
        function.setExpression("1-1");
        final JLabel subtractionOutput = new JLabel(function.getExpression());
        
        subtractionInput.setBounds(50, 50, 100, 30);
        subtractionInput.setFont(new Font("Verdana", Font.BOLD, 20));
        subtractionInput.setOpaque(true);
        subtractionOutput.setBounds(50, 50, 100, 30);
        subtractionOutput.setFont(new Font("Verdana", Font.BOLD, 20));
        subtractionOutput.setOpaque(true);
        
        Left.add(subtractionInput);
        Right.add(subtractionOutput);
        
        //Helping Method for Mutliplication.  
        final JLabel multiplicationInput = new JLabel("Input: 1*1  ", SwingConstants.LEFT);
        function.setExpression("1*1");
        final JLabel multiplicationOutput = new JLabel(function.getExpression());
        
        multiplicationInput.setBounds(50, 50, 100, 30);
        multiplicationInput.setFont(new Font("Verdana", Font.BOLD, 20));
        multiplicationInput.setOpaque(true);
        multiplicationOutput.setBounds(50, 50, 100, 30);
        multiplicationOutput.setFont(new Font("Verdana", Font.BOLD, 20));
        multiplicationOutput.setOpaque(true);
        
        Left.add(multiplicationInput);
        Right.add(multiplicationOutput);
        
        //Helping Method for Division.  
        final JLabel divisionInput = new JLabel("Input: 1/1  ", SwingConstants.LEFT);
        function.setExpression("1/1");
        final JLabel divisionOutput = new JLabel(function.getExpression());
        
        divisionInput.setBounds(50, 50, 100, 30);
        divisionInput.setFont(new Font("Verdana", Font.BOLD, 20));
        divisionInput.setOpaque(true);
        divisionOutput.setBounds(50, 50, 100, 30);
        divisionOutput.setFont(new Font("Verdana", Font.BOLD, 20));
        divisionOutput.setOpaque(true);
        
        final JLabel temp = new JLabel("   ");
        final JLabel temp4 = new JLabel("   ");
        Left.add(divisionInput);
        Left.add(temp);
        Left.add(temp4);
        Right.add(divisionOutput);
        
        //Helping Method for Power.  
        final JLabel powerInput = new JLabel("Input: 1^2  ", SwingConstants.LEFT);
        function.setExpression("1^2");
        final JLabel powerOutput = new JLabel(function.getExpression());
        
        powerInput.setBounds(50, 50, 100, 30);
        powerInput.setFont(new Font("Verdana", Font.BOLD, 20));
        powerInput.setOpaque(true);
        powerOutput.setBounds(50, 50, 100, 30);
        powerOutput.setFont(new Font("Verdana", Font.BOLD, 20));
        powerOutput.setOpaque(true);
        
        final JLabel temp1 = new JLabel("   ");
        Left.add(powerInput);
        Right.add(powerOutput);
        
        //Helping Method for Greater.  
        final JLabel greaterInput = new JLabel("Input: 1%1 ", SwingConstants.LEFT);
        function.setExpression("1%1");
        final JLabel greaterOutput = new JLabel(function.getExpression());
        
        greaterInput.setBounds(50, 50, 100, 30);
        greaterInput.setFont(new Font("Verdana", Font.BOLD, 20));
        greaterInput.setOpaque(true);
        greaterOutput.setBounds(50, 50, 100, 30);
        greaterOutput.setFont(new Font("Verdana", Font.BOLD, 20));
        greaterOutput.setOpaque(true);
        
        Left.add(greaterInput);
        Right.add(greaterOutput);
        
        //Helping Method for leser. 
        final JLabel leserInput = new JLabel("Input: 1<1  ", SwingConstants.LEFT);
        function.setExpression("1<1");
        final JLabel leserOutput = new JLabel(function.getExpression());
        
        leserInput.setBounds(50, 50, 100, 30);
        leserInput.setFont(new Font("Verdana", Font.BOLD, 20));
        leserInput.setOpaque(true);
        leserOutput.setBounds(50, 50, 100, 30);
        leserOutput.setFont(new Font("Verdana", Font.BOLD, 20));
        leserOutput.setOpaque(true);
        
        Left.add(leserInput);
        Right.add(leserOutput);
        
        //Helping Method for Modulus.
        final JLabel modInput = new JLabel("Input: 1>1  ", SwingConstants.LEFT);
        function.setExpression("1>1");
        final JLabel modOutput = new JLabel(function.getExpression());
        
        modInput.setBounds(50, 50, 100, 30);
        modInput.setFont(new Font("Verdana", Font.BOLD, 20));
        modInput.setOpaque(true);
        modOutput.setBounds(50, 50, 100, 30);
        modOutput.setFont(new Font("Verdana", Font.BOLD, 20));
        modOutput.setOpaque(true);
        
        Left.add(modInput);
        Right.add(modOutput);
        
        //Helping Method for Variable. 
        final JLabel variablesInput = new JLabel("Input: sin(2)  ", SwingConstants.LEFT);
        function.setExpression("sin(2)");
        final JLabel variablesOutput = new JLabel(function.getExpression());
        
        variablesInput.setBounds(50, 50, 100, 30);
        variablesInput.setFont(new Font("Verdana", Font.BOLD, 20));
        variablesInput.setOpaque(true);
        variablesOutput.setBounds(50, 50, 100, 30);
        variablesOutput.setFont(new Font("Verdana", Font.BOLD, 20));
        variablesOutput.setOpaque(true);
        
        final JLabel temp2 = new JLabel("  ");
        Left.add(variablesInput);
        Right.add(variablesOutput);
        Left.add(temp2);
        //Helping Method for Complex1  
        final JLabel complexInput = new JLabel("Input: sin^-1(2)  ", SwingConstants.LEFT);
        function.setExpression("sin^-1(2)");
        final JLabel complesOutput = new JLabel(function.getExpression());
        
        complexInput.setBounds(50, 50, 100, 30);
        complexInput.setFont(new Font("Verdana", Font.BOLD, 20));
        complexInput.setOpaque(true);
        complesOutput.setBounds(50, 50, 100, 30);
        complesOutput.setFont(new Font("Verdana", Font.BOLD, 20));
        complesOutput.setOpaque(true);
        
        Left.add(complexInput);
        Right.add(complesOutput);
        
        //Adds the Panel to the Frame.
        add(Right, BorderLayout.EAST);
        add(Left, BorderLayout.WEST);
        pack();
    }

}
