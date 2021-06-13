import java.awt.EventQueue;


/**
 * Help method GUI, where all the expression are written at.
 *
 * @author Harkeerat Singh Sawhney
 * @version 3.06.2021
 */
public class HelpPage
{
    /**
     * Constructor which is private.
     */
    private HelpPage(){
    }
    
    /**
     * Method which will make the GUI.
     */
    public static void main() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                final HelpFrame frame = new HelpFrame();
                frame.setVisible(true);
            }
        });        
    }
}
