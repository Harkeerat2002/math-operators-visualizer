
/**
 * A value is a AST node which,
 * stores the value "string".
 *
 * @author Harkeerat Singh Sawhney
 * @version 28/04/2021
 */
public class Variable extends Node {
    //String with name.
    private final String variable;    
    
    /**
     * Creating a Variable Node.
     * @param variable is a string
     */
    public Variable(String variable) {
        super();
        this.variable = variable;
    }
    
    /**
     * Returns the type of the node.
     * @return Type, the type of the node which it is
     */
    @Override
    public Type getType() {
        return Type.INVALID;
    }
    
    /**
     * Return true, or false if the node is constant.
     * @return boolean, it checks if it is constant or not
     */
    @Override
    public boolean isConstant() {
        return true;
    }
    
    /**
     * Returns the expresion in mathematical form.
     * @return String which is a expression itself
     */
    @Override
    public String toString() {
        return "" + variable;
    }
    
    /**
     * Computes the expression.
     * @param p which is a program
     */
    @Override
    public void compile(final Program p) {
        p.append(new ILOAD(variable));
    }
}
