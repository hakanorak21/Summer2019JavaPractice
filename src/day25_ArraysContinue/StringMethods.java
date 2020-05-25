package day25_ArraysContinue;

import java.util.Arrays;

public class StringMethods {
	
	/**
	 split(str): Splits the String by the given value and returns it
	 as String array
	 */
	
	public static void main(String[] args) {
		
		String sentence = "Today is great day. Good day to learn Java.";
		
		//Finding total number of the words
		String[] array = sentence.split(" ");
		System.out.println(Arrays.toString(array));
		System.out.println(array.length);
		
		//Email replit
		String email = "FirstName_LastName";
		String[] array2 = email.split("_");
		System.out.println(Arrays.toString(array2));
		
		String str = Arrays.toString(array2);
		System.out.println(str.replace("[",  "").replace("]", ""));
		
		String fullName = "Cybertek School Batch12";
		String[] array1 = fullName.split(" ");
		System.out.println(Arrays.toString(array1));
		
		String sentence1 = "I'm learning Java. Java is fun. I love Java";
		String[] array3 = sentence1.split("Java");
		System.out.println(Arrays.toString(array3));
		System.out.println(array3.length);
		
		String Python = " Python is great. I love Python. Python is life";
		String[] array4 = Python.split("Python");
		System.out.println(array4.length);
		System.out.println(Arrays.toString(array4));
		
		String emailAddress = "Cybertek_School_Batch12@gmail.com";
		String fullName2 = emailAddress.substring(0, emailAddress.indexOf("@"));
		System.out.println(fullName2);
		
		String[] fullName3 = fullName2.split("_");
		
		System.out.println(Arrays.toString(fullName3));
		
		String example = "Period. Period. Period";
		String[] example2 = example.split("\\."); // or ". " or "[.]"
		System.out.println(Arrays.toString(example2));
		
		/**
		 * toCharArray(): returns a char array of a string
		 */
		
		String example3 = "Java";
		char[] ch = example3.toCharArray();
		System.out.println(Arrays.toString(ch));
		
	}

}
