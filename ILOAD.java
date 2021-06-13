
/**
 * Write a description of class ILOAD here.
 *
 * @author Harkeerat Singh Sawhney
 * @version 28/04/2021
 */
public class ILOAD extends Instruction {
    private final String name;

    /**
     * Constructor.
     * @param name which stores a string
     */
    public ILOAD(final String name) {
        super();
        this.name = name;

    }
    
    /**
     * Returns the expression.
     * @return String, expresses the expression
     */
    @Override
    public String toString() {
        return "ILOAD " + name;
    }
    
    /**
     * Does the execution.
     * @param storage which is a object of Storage
     */
    @Override
    public void execute(final Storage storage) {
        final Number value = storage.getVariableTable().get(name);
        storage.getOperandStack().push(String.valueOf(value));
    }
}
