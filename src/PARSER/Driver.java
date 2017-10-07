package PARSER;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*try {
	        ANTLRInputStream input = new ANTLRInputStream(
	            new FileInputStream("C:/Users/Harry/eclipse-workspace/CMPILER_2/src/PARSER/test2.txt"));

	        HENLexer lexer = new HENLexer(input);
	        HENParser parser = new HENParser(new CommonTokenStream(lexer));
	        parser.addParseListener(new MyListener());

	        // Start parsing
	        parser.program(); 
	    } catch (IOException e) {
	        e.printStackTrace();
	    }*/
		Lexer lexer = new Lexer("/Users/neilsongardose/Projects/JavaProjects/src/PARSER/test3.txt");

        while (!lexer.isExhausted()) {
            System.out.printf("%-18s %s\n", lexer.currentToken(), lexer.currentLexema());
            lexer.moveAhead();
        }

        if (lexer.isSuccessful()) {
            System.out.println("Ok! :D");
        } else {
            System.out.println(lexer.errorMessage());
        }
		
	}

}
