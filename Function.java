/**
 * A Function class, which takes the string from ,
 * the expression field and then sends it to ArithParser,
 * from the where the final string is returned.
 *
 * @author Harkeerat Singh Sawhney
 * @version 3.06.2021
 */
public class Function
{
    // instance variables to store the final string from the ArithParse
    private String expressionText;

    /**
     * Constructor for objects of class Function.
     * @param expressionText which takes the input from user
     */
    public Function(final String expressionText)
    {
        setExpression(expressionText);
    }

    /**
     * SetExpression method takes the string from the,
     * expressionf field, then sends to ArithParse where,
     * the final string would be returned.
     * 
     * @param expressionText is the input from user
     */
    public final void setExpression(final String expressionText) {
        final Parser parser = new ArithParser();
        if (expressionText != null) {
            final String parsedExpression = parser.parse(expressionText);
            this.expressionText = parsedExpression;
        }
    }
    
    /**
     * getExpression is a method which returns the current state expressionText.
     * Usually called when needs to get the final String.
     * @return String since it returns the current or final string
     */
    public final String getExpression() {
        return expressionText;
    }
        
}
