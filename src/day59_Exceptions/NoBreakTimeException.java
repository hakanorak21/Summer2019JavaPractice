package day59_Exceptions;

public class NoBreakTimeException extends RuntimeException {
	
/**
 Custom exception: 	We can create a class that extends exceptions
 					to make it a custom exception class.
 					(checked or unchecked)
 					MUST extend a predefined exception class.
 					
 How to create unchecked exception?
 Extend RuntimeException class
 
 How to create checked exception?
 Extend Exception class					
 */
	
	public NoBreakTimeException() {
		super("Too much break!!!");
		System.err.println("No break until the freaking offer letter");
	}

}
