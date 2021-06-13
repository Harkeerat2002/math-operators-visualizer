import java.awt.EventQueue;


/**
 * Main method where the whole GUI is called
 *
 * @author Harkeerat Singh Sawhney
 * @version 3.06.2021
 */
public class Main
{
    /**
     * Constructor which is private.
     */
    private Main(){
    }
    
    /**
     * Method which will make the GUI.
     * @param args which is the method to call the GUI
     */
    public static void main(final String[] args) {
        final Draw draw = new Draw(new Function(null));
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                final DrawFrame frame = new DrawFrame(draw);
                frame.setVisible(true);
            }
        });
        
    }
}
