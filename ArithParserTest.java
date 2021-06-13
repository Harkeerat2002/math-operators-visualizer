import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * This test class will test some aspects of the rules
 * of the Arith language.
 * 
 * <code>
 * EXPRESSION   ::= [ "+" | "-" ] TERM { ( "+" | "-" ) TERM }
 * TERM         ::= FACTOR { ( "*" | "/" ) FACTOR }
 * FACTOR       ::= Literal | 
 *                  Identifier| 
 *                  "(" EXPRESSION ")"
 * </code>
 */
public class ArithParserTest {
    
    @Test
    public void testLiteral() {
        // setup
        final Parser parser = new ArithParser();
        // test input
        final String sourceCode = "1";
        // code under test
        final String actualRoot = "<html>1</html>";
        // assertio
        assertEquals(parser.parse(sourceCode), actualRoot);
    }
    
    @Test
    public void testNegation() {
        // setup
        final Parser parser = new ArithParser();
        // test input
        final String sourceCode = "-1";
        // code under test
        final String actualRoot = "<html>-1</html>";
        // assertio
        assertEquals(parser.parse(sourceCode), actualRoot);
    }
    
    @Test
    public void testVariable() {
        // setup
        final Parser parser = new ArithParser();
        // test input
        final String sourceCode = "a";
        // code under test
        final String actualRoot = "<html>a</html>";
        // assertio
        assertEquals(parser.parse(sourceCode), actualRoot);
    }
    
    @Test
    public void testAddition() {
        // setup
        final Parser parser = new ArithParser();
        // test input
        final String sourceCode = "(1+1)";
        // code under test
        final String actualRoot = "<html>(1&#43;1)</html>";
        // assertio
        assertEquals(parser.parse(sourceCode), actualRoot);
    }
    
    @Test
    public void testAdditionMore() {
        // setup
        final Parser parser = new ArithParser();
        // test input
        final String sourceCode = "(1+1)+1";
        // code under test
        final String actualRoot = "<html>(1&#43;1)+1</html>";
        // assertio
        assertEquals(parser.parse(sourceCode), actualRoot);
    }
    
    @Test
    public void testSubtraction() {
        // setup
        final Parser parser = new ArithParser();
        // test input
        final String sourceCode = "(1-1)";
        // code under test
        final String actualRoot = "<html>(1&#8722;1)</html>";
        // assertio
        assertEquals(parser.parse(sourceCode), actualRoot);
    }
    
    @Test
    public void testSubtractionMore() {
        // setup
        final Parser parser = new ArithParser();
        // test input
        final String sourceCode = "(1-1)-1";
        // code under test
        final String actualRoot = "<html>(1&#8722;1)-1</html>";
        // assertio
        assertEquals(parser.parse(sourceCode), actualRoot);
    }
    
    @Test
    public void testMultiplication() {
        // setup
        final Parser parser = new ArithParser();
        // test input
        final String sourceCode = "(1*1)";
        // code under test
        final String actualRoot = "<html>(1&#215;1)</html>";
        // assertio
        assertEquals(parser.parse(sourceCode), actualRoot);
    }
    
    @Test
    public void testMutliplicationMore() {
        // setup
        final Parser parser = new ArithParser();
        // test input
        final String sourceCode = "(1*1)*1";
        // code under test
        final String actualRoot = "<html>(1&#215;1)&#215;1</html>";
        // assertio
        assertEquals(parser.parse(sourceCode), actualRoot);
    }
    
    @Test
    public void testDivision() {
        // setup
        final Parser parser = new ArithParser();
        // test input
        final String sourceCode = "(1/1)";
        // code under test
        final String actualRoot = "<html>(<sup>1</sup>&frasl;<sub>1</sub>)</html>";
        // assertio
        assertEquals(parser.parse(sourceCode), actualRoot);
    }
    
    @Test
    public void testDivisionMore() {
        // setup
        final Parser parser = new ArithParser();
        // test input
        final String sourceCode = "(1/1)/1";
        // code under test
        final String actualRoot = "<html>(<sup>1</sup>&frasl;<sub>1</sub>)&#247;1</html>";
        // assertio
        assertEquals(parser.parse(sourceCode), actualRoot);
    }
        
}
