package PARSER;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
	        ANTLRInputStream input = new ANTLRInputStream(
	            new FileInputStream("C:/Users/Harry/eclipse-workspace/CMPILER/src/PARSER/test.txt"));

	        HENLexer lexer = new HENLexer(input);
	        HENParser parser = new HENParser(new CommonTokenStream(lexer));
	        parser.addParseListener(new MyListener());

	        // Start parsing
	        parser.program(); 
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
	}

}
