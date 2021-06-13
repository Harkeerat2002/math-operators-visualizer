/**
 * A Literal is an AST node that 
 * corresponds to a literal integer value
 * (a number in the source code).
 * 
 * @author Harkeerat Singh Sawhney
 * @version 28/04/2021
 */
public class Literal extends Node {
    // Value is an int which stores the value which would be stored.
    private final String value;
    
    
    /**
     * Create a new Literal node.
     * @param value the integer value this node evaluates to
     */
    public Literal(final String value) {
        super();
        this.value = value;
    }
    
    /**
     * Returns the type of the node.
     * @return Type, the type of the node which it is
     */
    @Override
    public Type getType() {
        return Type.INT;
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
     * Compiles the whole node, by calling Instruction subclass.
     * @param p which is a program
     */
    @Override
    public void compile(final Program p) {
        p.append(new BIPUSH(value));
    }
    
    /**
     * Returns the expresion in mathematical form.
     * @return the value
     */
    @Override
    public String toString() {
        return "" + value;
    }
    
}
