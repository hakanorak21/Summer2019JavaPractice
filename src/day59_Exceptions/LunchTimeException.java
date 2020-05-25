package day59_Exceptions;

public class LunchTimeException extends Exception{
	
	public LunchTimeException(String e) {
		super(e);
		System.err.println("KFC");
	}

}
