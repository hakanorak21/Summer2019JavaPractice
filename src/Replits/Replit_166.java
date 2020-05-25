package Replits;

public class Replit_166 {
	
	public static void main(String[] args) {
		
		String s1 = "12345";
		String s2 = "abcdefgh";
		System.out.println(mergeStrings(s1, s2));
		System.out.println(mergeStringsErsin(s1, s2));
	}
	
	public static String mergeStrings(String one, String two) {
	    
		String merged = "";
		
		if (one.length() > two.length()) {
			String temp1 = one.substring(0, two.length());
			for (int i = 0; i < two.length(); i++) 
			merged += temp1.substring(i, i+1) + two.substring(i, i+1);
			merged += one.substring(two.length());
		} 
		
		else if (two.length() > one.length()) {
			String temp2 = two.substring(0, one.length());
			for (int i = 0; i < one.length(); i++) 
			merged += one.substring(i, i+1) + temp2.substring(i, i+1);
			merged += two.substring(one.length());
		}
		
		else {
			for (int i = 0; i < one.length(); i++) 
			merged += one.substring(i, i+1) + two.substring(i, i+1);
		}
	    
	    return merged;
	  }
	
	public static String mergeStringsErsin(String one, String two) {

		int maxSize = one.length()>two.length()?one.length():two.length();
		String str = "";
		for (int i=0; i<maxSize; i++){
			if (i < one.length()) str += one.charAt(i);
			if (i < two.length()) str += two.charAt(i);
		}
		return str;
	}

}
