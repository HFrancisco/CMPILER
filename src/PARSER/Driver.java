package PARSER;

import java.io.*;

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
		Lexer lexer = new Lexer("C:\\Users\\Endrey\\Documents\\CMPILER\\src\\PARSER\\test3.txt");

        StringBuilder output = new StringBuilder();

        while (!lexer.isExhausted()) {
            System.out.printf("%-18s %s\n", lexer.currentToken(), lexer.currentLexema());
            output.append(String.format("%-18s %s\n", lexer.currentToken(), lexer.currentLexema()));
            lexer.moveAhead();
        }

        String filename = "C:\\Users\\Endrey\\Documents\\CMPILER\\src\\PARSER\\lexer_output.txt";
        BufferedWriter bw =null ;
        FileWriter fw =null;


        if (lexer.isSuccessful()) {
            System.out.println("Ok! :D");
            output.append("OK! :D");
        } else {
            System.out.println(lexer.errorMessage());
            output.append(lexer.errorMessage());
        }

        try{
            fw = new FileWriter(filename);
            bw = new BufferedWriter(fw);
            bw.write(output.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    bw.close();
            } catch (IOException io){
                io.printStackTrace();
            }
        }


		
	}

}
