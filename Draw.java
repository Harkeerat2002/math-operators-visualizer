
/**
 * This class actually isnt needed, however for the future scope,
 * of the program this class could be used as the extension.
 *
 * @author Harkeerat Singh Sawhney
 * @version 3.06.2021
 */
public class Draw
{
    // instance variables for function.
    private final Function function;

    /**
     * Constructor for objects of class Draw.
     * @param function which takes in a function
     */
    public Draw(final Function function) {
        this.function = function;
    }
        

    /**
     * Returns function.
     * @return Function 
     */
    public final Function getFunction() {
        return function;
    }
}
