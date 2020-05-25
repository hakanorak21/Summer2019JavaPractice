package Replits;

public class Replit_172 {
	
	/**
	at3 gets two strings and returns a string.

	The first string is the one that will be manipulated. at the 3rd char position of target you will insert the word argument.

	Example use:

	at3("longword","foo")
	will return: "lonfoogword"
	
	at3("blabla","a")
	will return: "blaabla"
	*/
	
	public static void main(String[] args) {
		
		System.out.println(at3("longword","foo"));
		System.out.println(at3("blabla","a"));
		
	}
	
	public static String at3(String target,String word){
	    
		return target.substring(0, 3) + word +
						target.substring(3, target.length());
	  }

}
