package Replits;

import java.util.Arrays;

public class Replit_195_isAnagram {
	
	/**
	Anagram is a word, phrase, or name formed by rearranging 
	the letters of another, such as cinema, formed from iceman.
	
	isAnagram method checks if word1 and word2 are anagram to each other 
	then return a boolean.

	-Each letter in word1 should appear in word2 exact number of times
	-Ignore empty spaces
	-Make your code case insensitive
	*/
	
	
	public static boolean isAnagram(String word1, String word2) {
		
	/**	
		word1 = word1.replaceAll(" ", "").toLowerCase();
		word2 = word2.replaceAll(" ", "").toLowerCase();
		
		if (word1.length() == word2.length()) {
			for (int j = 0; j < word1.length(); j++) {
				for(int i = 0; i < word2.length(); i++) {
					if (word1.substring(j, j+1).equals(word2.substring(i, i+1)))
						word2 = word2.replace(word2.substring(i, i+1), "");	
				}
			}
		}else
			return false;
		
		return word2.length() == 0;
	}
	*/

		String str="";
		String str2 ="";
		word1.replaceAll(" ", "").toLowerCase();
		word2.replaceAll(" ", "").toLowerCase();

		char[] w1 = word1.toCharArray();
		char[] w2 = word2.toCharArray();
		Arrays.sort(w1);
		Arrays.sort(w2);

		if(w1.length==w2.length) {
			for(int i=0; i<w1.length; i++) {
				str += w1[i];
				str2 +=w2[i];
			}


			return str.equals(str2);
		
		}else {

			return false;
		}

	}
	
	
	public static void main(String[] args) {
		
		//boolean result = isAnagram("listen", "silent");
		boolean result = isAnagram("aabbccd", "aaabccd");
		System.out.println(result);
		
	}	

}
