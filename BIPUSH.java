/**
 * BIPUSH pushes the given value onto the operand stack.
 * @author Harkeerat Singh Sawhney
 * @version 28/04/2021
 */
public class BIPUSH extends Instruction {
    //variable called value which stores an int.
    private final String value;
    
    /**
     * Constructor.
     * @param value which stores an int
     */
    public BIPUSH(final String value) {
        super();
        this.value = value;
    }
    
    /**
     * Executes the operation.
     * @param storage which is a object of Storage class
     */
    @Override
    public void execute(final Storage storage) {
        storage.getOperandStack().push(value);
    }
    
    /**
     * Returns the expression.
     * @return String, expresses the expression
     */
    @Override
    public String toString() {
        return "BIPUSH " + value;
    }

}
