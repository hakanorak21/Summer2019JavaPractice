package day15_Scanner_String_classes;

public class StringClass {
	
	/*
	 1. String is an object not a (primitive) data type.
	 
	 There are two ways to create object from String class:
	 a) String literals
	 b) By using "new" keyword
	 
	 2. String object represents the sequences of characters
	 - Each character has its own index
	 - Index starts from zero.
	 
	 3. String is immutable:
	 Once you declare it, you cannot modify it. 
	 
	 */

		public static void main(String[] args) {
			
			String str = "Cybertek";
			String str2 = "Cybertek";
			boolean test = (str == str2);
			System.out.println(test);
			
			str.charAt(7);
			System.out.println(str.charAt(7));
			
		}
}
