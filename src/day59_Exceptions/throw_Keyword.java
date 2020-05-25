package day59_Exceptions;

import java.io.IOException;

public class throw_Keyword {
	
/**
 throw: Used for manually throwing an exception.
 
  		Creating an object: new ClassName();
  		throw objectOfException;
  		Or: throw new RunTimeException();
  		
  		After throwing exception, following code will be unreachable.
  		
  		When we throw checked exception, code will  not compile.
  		 
 */
	public static void main(String[] args) {
		
		try {
			RuntimeException e = new RuntimeException();
			throw e;
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		//throw new RuntimeException(); //Runtime error
		System.out.println("Test complete");
		
		//throw new IOException(); //Compile error
		
	}

}
