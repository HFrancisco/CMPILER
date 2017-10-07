package PARSER;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Tokens {
    GETS_KEYWORD ("gets"),
    
    IF_KEYWORD ("if"),
    ELSE_KEYWORD ("else"),
    
    WHILE_KEYWORD ("while"),
    FOR_KEYWORD ("for"),
    DO_KEYWORD ("do"),

    SEMICOLON (";"),
    COMMA (","),

    OPEN_BRACKET ("\\{"),
    CLOSE_BRACKET ("\\}"),
    OPEN_PARENTHESIS ("\\("),
    CLOSE_PARENTHESIS ("\\)"),

    ADDITION ("\\+"),
    SUBTRACTION ("-"),
    MULTIPLICATION ("\\*"),
    DIVISION ("/"),
    
    EQUAL ("=="),
    GREATER_THAN_EQUAL (">="),
    LESS_THAN_EQUAL ("<="),
    GREATER_THAN (">"),
    LESS_THAN ("<"),


    STRING ("\"[^\"]+\""),
    NUMBER ("\\d+(\\.\\d+)?"),
    IDENTIFIER ("\\w+");    

    private final Pattern pattern;

    Tokens(String regex) {
        pattern = Pattern.compile("^" + regex);
    }

    int endOfMatch(String s) {
        Matcher m = pattern.matcher(s);

        if (m.find()) {
            return m.end();
        }

        return -1;
    }
}