package Replits;

public class Replit_179 {
	
	/**
	reverse method reverse a string.
	It gets a string and returns it in reverse.
	
	For example:
	reverse("foo") ==> "oof"
	reverse("student") ==> "tnedust"
	*/
	
	public static void main(String[] args) {
		
		System.out.println(reverse("foo"));
		System.out.println(reverse("student"));
		
	}
	
	public static String reverse(String input){
		
		String temp = input;
		String output = "";
		
		for (int i = temp.length()-1; i >= 0; i--)
			output += temp.charAt(i);
		
		return output;
		
	}

}
