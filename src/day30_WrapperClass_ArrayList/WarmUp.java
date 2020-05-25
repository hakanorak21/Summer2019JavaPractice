package day30_WrapperClass_ArrayList;

public class WarmUp {
	
	/**
    1. write a return method that accepts a String and removes duplicate values from the String
   	Ex:
       RemoveDuplicate("aaabbbccc") ==> "abc"
   	2. write a return method that accepts String and returns the unique values from the String
   	Ex: 
       Unique("AABBCDEEE")  ==> "CD"
    
    GitHub: MuhtarMahmut
    For repl.it solutions
    */

	public static void main(String[] args) {

		String original = "aaaaabbbbccccdee";
		String nonDuplicates = RemoveDuplicates(original);
		System.out.println(nonDuplicates);

		System.out.println(UniqueCharacters(original));

	}

	public static String RemoveDuplicates(String a) {

		String result = ""; // For storing non-duplicated values
		
		for (int i = 0; i < a.length(); i++) {
			if (!result.contains(a.substring(i, i+1)))
				result += a.substring(i, i+1);

		}
		
		return result;
		
	}

	public static String UniqueCharacters(String str) {

		int i = 0;
		while (i < str.length()) {

			if (str.substring(i+1).contains(str.substring(i, i+1)))
				str = str.replaceAll(str.substring(i, i+1), "");
			else
				i++;

		}

		return str;
	
		
		/**
		//Muhtar
		String unique = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			int count = 0; //To count number of appearance
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == str.charAt(i)) {
				count++;
				}
			}
			
			if (count == 1)
				unique += "" + str.charAt(i);

		}
		
		return unique;
		 */
	}



}
