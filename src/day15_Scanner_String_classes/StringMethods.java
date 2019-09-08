package day15_Scanner_String_classes;

import java.util.Scanner;

public class StringMethods {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = "Cybertek";
		//			  01234567
		// index numbers start from zero.
		// charAt(index)
		System.out.println(str.charAt(4));
		char ch = str.charAt(4);
		System.out.println(ch);
		System.out.println(str.charAt(4));
		
		String str2 = "Mu htar";
		//			   0123456
		System.out.println(str2.charAt(2));
		
		//System.out.println("Enter char value");
		//char ch1 = scan.next().charAt(0);
		//System.out.println(ch1);
		
		// length(): returns the total number of characters in a string
		String name = "Donald J Trump";
		System.out.println(name.length());
		
		// Concatenation
		// concat()
		
		System.out.println(str2.concat(name));
		
		// toUpperCase()
		name = name.toUpperCase();
		System.out.println(name);
		name = name.toLowerCase();
		System.out.println(name);
		
		//toLowerCase()
		String name1 = "ABDURAHMAN";
		name1.toLowerCase();
		name1 = name1.toLowerCase();
		System.out.println(name1);
		
		System.out.println("JAVA IS FUN".toLowerCase());
		
	}

}
