

/**
 * A Parser for our Arith language
 * (a simple language of arithmetic expressions).
 * 
 * @author Harkeerat Singh Sawhney
 * @version 3.06.2021
 */
public final class ArithParser implements Parser {
    
    private LexicalAnalyzer lexer;   
    
    
    /**
     * Parse a program in the Arith language.
     * @param sourceCode The source code of the program in the Arith language
     * @return an AST of the program
     */
    public String parse(final String sourceCode) {
        this.lexer = new LexicalAnalyzer(sourceCode);
        // fetch first token
        lexer.fetchNextToken();        
        // now parse the EXPRESSION
        return parseExpression();        
        
    }
    
    /**
     * Parse an expression.
     * This assumes the lexer already points to the first token of this expression.
     * 
     * <p>EBNF:
     * <code>
     * EXPRESSION ::= ( "(" ("+" | "-") FACTOR  ("+" | "-" | "*" | "\" | "%"), 
     * {  ("+" | "-") FACTOR ")"}
     * </code>
     * 
     * @return String representing the expression
     */
    private String parseExpression() {
        final String FinalString = "<html>" + parseTerm() + "</html>";
        return FinalString;        
        
    }
    
    private String parseTerm() {     
        String string = "";      
        final String left = parseFactor();
        lexer.fetchNextToken();       
        
        
        boolean shouldAdd = false;
        boolean shouldSub = false;
        boolean shouldMul = false;
        boolean shouldDiv = false;
        boolean shouldMod = false;
        boolean shouldGreater = false;
        boolean shouldSmaller = false;
        boolean shouldPower = false;
        
        if (lexer.getCurrentToken().getType() == TokenType.PLUS) {
            shouldAdd = true;
            lexer.fetchNextToken();
        } else if (lexer.getCurrentToken().getType() == TokenType.MINUS) {
            shouldSub = true;
            lexer.fetchNextToken();
        } else if (lexer.getCurrentToken().getType() == TokenType.STAR) {
            shouldMul = true;
            lexer.fetchNextToken();
        } else if (lexer.getCurrentToken().getType() == TokenType.SLASH) {
            shouldDiv = true;
            lexer.fetchNextToken();
        } else if (lexer.getCurrentToken().getType() == TokenType.PERCENT) {
            shouldMod = true;
            lexer.fetchNextToken();
        } else if (lexer.getCurrentToken().getType() == TokenType.GREATER) {
            shouldGreater = true;
            lexer.fetchNextToken();
        } else if (lexer.getCurrentToken().getType() == TokenType.SMALLER) {
            shouldSmaller = true;
            lexer.fetchNextToken();
        } else if (lexer.getCurrentToken().getType() == TokenType.POWER) {
            shouldPower = true;
            lexer.fetchNextToken();
        } else if (lexer.getCurrentToken().getType() == TokenType.OPEN_PAREN) {
            lexer.fetchNextToken();
            return left + "(" + parseTerm();
        } else if (lexer.getCurrentToken().getType() == TokenType.END_OF_FILE) {
            return left;
        } else if (lexer.getCurrentToken().getType() == TokenType.CLOSED_PAREN) {
            lexer.fetchNextToken();
            if (lexer.getCurrentToken().getType() == TokenType.END_OF_FILE) {
                return left + ")";
            }
            return left + ")" + parseTerm();
        }
        
        final String right = parseFactor();
        
        if (shouldAdd) {
            string = left + "&#43;" + right;
        } else if (shouldSub) {
            string = left + "&#8722;" + right;
        } else if (shouldMul) {
            string = left + "&#215;" + right;
        } else if (shouldDiv) {
            string = "<sup>" + left + "</sup>&frasl;<sub>" + right + "</sub>";            
        } else if (shouldMod) {
            string = left + " mod " + right;
        } else if (shouldGreater) {
            string = left + "&#60;" + right;
        } else if (shouldSmaller) {
            string = left + "&#62;" + right;
        } else if (shouldPower) {
            string = left + "<sup>" + right + "</sup>";
        } else {
            string = left;
        }
        
        lexer.fetchNextToken();
        if (lexer.getCurrentToken().getType() == TokenType.CLOSED_PAREN) {
            lexer.fetchNextToken();
            if (lexer.getCurrentToken().getType() != TokenType.END_OF_FILE) {
                return string + ")" + parseTerm(); 
            } else {
                return string + ")";
            }
        } else if (lexer.getCurrentToken().getType() != TokenType.END_OF_FILE) {
            return string + parseTerm();
        }
        
        return string; 
    }
    
    
    
    /**
     * Parse a factor.
     * This assumes the lexer already points to the first token of this factor.
     * 
     * <p>EBNF:
     * <code>
     * FACTOR ::=  
     *          Literal | 
     *          Identifier | 
     *          "(" EXPRESSION ")"
     * </code>
     * 
     * @return a String representing the factor
     */
    private String parseFactor() {        
        if (lexer.getCurrentToken().getType() == TokenType.OPEN_PAREN) {
            lexer.fetchNextToken();
            return "(" + parseTerm();
        }  else if (lexer.getCurrentToken().getType() == TokenType.MINUS) {            
            lexer.fetchNextToken();
            if (lexer.getCurrentToken().getType() == TokenType.LITERAL) {      
                return "-" + lexer.getCurrentToken().getText();
            } else if (lexer.getCurrentToken().getType() == TokenType.OPEN_PAREN) {
                lexer.fetchNextToken();
                return "-" + "(" + parseTerm();
            } else {
                return null;
            }
        } else if (lexer.getCurrentToken().getType() == TokenType.PLUS) {
            lexer.fetchNextToken();            
            if (lexer.getCurrentToken().getType() == TokenType.LITERAL) {
                return "+" + lexer.getCurrentToken().getText();
            } else if (lexer.getCurrentToken().getType() == TokenType.OPEN_PAREN) {
                lexer.fetchNextToken();
                return "+" + "(" + parseTerm();
            } else {
                return null;
            }
        } else if (lexer.getCurrentToken().getType() == TokenType.SLASH) {
            lexer.fetchNextToken();            
            if (lexer.getCurrentToken().getType() == TokenType.LITERAL) {
                return "&#247;" + lexer.getCurrentToken().getText();
            } else if (lexer.getCurrentToken().getType() == TokenType.OPEN_PAREN) {
                lexer.fetchNextToken();
                return "&#247;" + "(" + parseTerm();
            } else {
                return null;
            }
        } else if (lexer.getCurrentToken().getType() == TokenType.STAR) {
            lexer.fetchNextToken();            
            if (lexer.getCurrentToken().getType() == TokenType.LITERAL) {
                return "&#215;" + lexer.getCurrentToken().getText();
            } else if (lexer.getCurrentToken().getType() == TokenType.OPEN_PAREN) {
                lexer.fetchNextToken();
                return "&#215;" + "(" + parseTerm();
            } else {
                return null;
            }
        } else if (lexer.getCurrentToken().getType() == TokenType.POWER) {
            lexer.fetchNextToken();            
            if (lexer.getCurrentToken().getType() == TokenType.LITERAL) {
                return "<sup>" + lexer.getCurrentToken().getText() + "</sup>";
            } else if (lexer.getCurrentToken().getType() == TokenType.OPEN_PAREN) {
                lexer.fetchNextToken();
                return "<sup>" + "(" + parseTerm() + "</sup>";
            } else {
                return null;
            }
        } else {
            return lexer.getCurrentToken().getText();
        }
    }
}
