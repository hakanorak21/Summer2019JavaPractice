package office_Hours;

import java.util.Scanner;

public class September18 {
	
	public static void main(String[] args) {
		
		/*
		String word = "java";
		
		System.out.println(word.charAt(0) + word.charAt(1)); // Adding their ASCII values
		
		char ch = 'j';
		char ch2 = word.charAt(0);
		System.out.println(ch == ch2);
		
		int i = word.length();
		System.out.println(i);
		
		String word2 = "java is fun!";
		System.out.println(word2.charAt(word2.length() - 1));
		
		
		//How to get 2nd character
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = scan.next();
	
		System.out.print("The second character is: ");
		System.out.println(word.charAt(1));
		
		//Now last 2nd character
		System.out.print("The last 2nd character is: ");
		System.out.println(word.charAt(word.length()-2));
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your email:");
		String word = scan.next();
		
		String emailID = word.substring(0, word.indexOf("@"));
		System.out.println(emailID);
		
	}

}
