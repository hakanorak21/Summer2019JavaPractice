package day29_ReturnMethods;

import java.util.Arrays;

public class WarmUp {
	
	/**
	 Write a method that can find the frequency of characters in String.
    	Ex: 
        FrequencyTest("XXXYYYZZZ")
        output: X3Y3Z3
        FrequencyTest("AAABBBBBCCCC")
        output: A3B5C4
	 */

	public static void main(String[] args) {

		
		String chars = "cccabb";
		char[] array = chars.toCharArray();
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		//for (int i = 0; i < array.length; i++ ) {
			int count = 1;
			for (int i = 0; i < array.length - 1;) {
				
				while (array[i] == array[i+1]) {
					count++;
					i++;
				}
				System.out.print("" + array[i+1] + count);
				i = i + count - 1;	
				count = 1;
				
			}
		//}
			
		/**
		// My first solution
		String chars = "aabbaaaabbcccccbadddaa"; // a9b5c5d3
		do {
			int count = 1;
			for (int i = 1; i < chars.length(); i++) {

				if (chars.substring(0,1).equals(chars.substring(i, i+1)))
					count++;

			}
			System.out.print(chars.substring(0,1) + count);
			chars = chars.replaceAll(chars.substring(0,1), "");
		} while (chars.length() > 0);
		
		
		
		// Muhtar
		String str = "aabbaaaabbcccccbadddaa";
		String RemoveDup = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (!RemoveDup.contains(str.substring(i, i+1))) {
				RemoveDup += str.substring(i, i+1);
			}
		}
		System.out.println(RemoveDup); // abcd
		
		String result = "";
		for (int j = 0; j < RemoveDup.length(); j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.substring(i, i+1).equals(RemoveDup.substring(j, j+1)))
					count++;		
			}
			result += RemoveDup.substring(j, j+1) + count;
		}
		System.out.println(result); // a9b5c5d3
		*/
	}

}
