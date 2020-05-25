package Replits;

public class Replit_171 {
	
	/**
	This method gets a string and an int, it returns a string.

	What it does is limit the input string to a certain number of characters.

	For example:

	limit("abcd",2)
	returns "ab"

	limit("bla bla",3)
	returns "bla" 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(limit("abcd",2));
		System.out.println(limit("bla bla",3));
		
	}
	
	public static String limit(String text, int maxLength){

		return text.substring(0, maxLength);
	}

}
