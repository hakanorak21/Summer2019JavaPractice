package Replits;

public class Replit_170 {
	
	/**
	This method gets two strings (text and badWord)  and returns a string.

	Basically what it does is taking out all the occurrences of badWord in text.

	For example:

	clean ("one two three","two")
	returns "one three"

	clean ("foo bar","foo")
	returns "bar"

	clean ("he said bla bla bla","bla")
	returns "he said "
	*/
	
	public static void main(String[] args) {
		
		System.out.println(clean("one two three","two"));
		
	}
	
	public static String clean (String text ,String badWord) {
		
		return text.replaceAll(badWord, "");
	      
	  }
	
	

}
