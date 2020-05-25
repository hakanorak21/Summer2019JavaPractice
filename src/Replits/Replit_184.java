package Replits;

public class Replit_184 {
	
	/**
	Palindrome is a word, phrase, or sequence that reads the same backward 
	as forward, e.g., madam or nurses run.

	So method isPalindrome checks that and returns true if check is 
	palindrome and false if it is not.

	- make your conditions case insensitive.  ex: Civic and civic are both palindromes
	- make your conditions space insensitive.  Race car is a palindrome even though there is space in between.

	Examples:
	isPalindrome("Noon") ==> true
	isPalindrome("I am not palindrome") ==> false
	isPalindrome("wooden") ==> false
	isPalindrome("Nurses Run") ==> true
	*/
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("Noon"));
		System.out.println(isPalindrome("I am not palindrome"));
		System.out.println(isPalindrome("wooden"));
		System.out.println(isPalindrome("Nurses Run"));
		
	}
	
	public static boolean isPalindrome(String check) {
		
		check = check.replaceAll(" ", "");
		check = check.toLowerCase();
		
		String temp = check;
		String output = "";
		
		for (int i = temp.length()-1; i >= 0; i--)
			output += temp.charAt(i);
		
		return output.equals(check);

	}

	
}
