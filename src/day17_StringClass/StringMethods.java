package day17_StringClass;

/*
 Two ways to create String class object:
 1. String literals
 String stringName = ""; ==> String pool (in Java heap memory)
 
 2. Using "new" keyword
 String stringName = new String(""); ==> Java heap (outside String pool)
 
 Java heap: a memory location where all objects are saved
 String pool: Located in Java heap memory, a special memory location for String literals
  
 */

public class StringMethods {
	
	public static void main(String[] args) {
		
		String str1 = "Hello Javengers";
		String str2 = "Hello Javengers";
		boolean result1 = (str1 == str2); // true (string pool)
		System.out.println(result1);
		
		String str3 = new String("Hello Javengers");
		String str4 = new String("Hello Javengers");
		boolean result2 = (str3 == str4); // false
		System.out.println(result2);
		
		// String class methods:
		String longName = "ABCDEFGHIJKLMN";
		System.out.println(longName.length());
		
		String fullName = "Cybertek School Batch12";
		System.out.println(fullName.indexOf(' '));
		System.out.println(fullName.substring(fullName.indexOf(' ')+1, 
		 15));
		String fullName2 = fullName.substring(fullName.indexOf(' ')+1);
		
		System.out.println(fullName.substring(fullName.indexOf(' ')+1).substring(0, 
				fullName.substring(fullName.indexOf(' ')+1).indexOf(' ')+1));
		
		String s2 = "Java is a programming language, Java is Java";
		s2 = s2.replaceFirst("Java is J", "C# is j");
		System.out.println(s2);
	}

}
