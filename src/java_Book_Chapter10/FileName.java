package java_Book_Chapter10;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileName {
	
	public static void main(String[] args) {
		String fileName = "out.txt";
		PrintWriter outputStream = null; 
		try {
			outputStream = new PrintWriter(fileName);
		}catch(FileNotFoundException e) {
			System.out.println("Error opening " + fileName);
			System.exit(0);
			
		}
		
		outputStream.println("Line 1");
		outputStream.println("Line 2");
		outputStream.close();
	}
	
}
