package day26_ForEach;

import java.util.Arrays;
import java.util.TreeSet;

public class WarmUp {
	
	/**
	Write a program that can check if two Strings are build out of same letters
    Ex: 
        if str1 = "aabbbc";  str2 ="cab";
        output: true
        if str1 ="abcd";  str2 ="abc";
        output: false
	 */
	
	public static void main(String[] args) {
	
		// First, with string methods
		String a = "aabbbcdd";
		String b = "cabbbccaa";
		
		// Removing duplicates of String a
		String a1 = "";
		
		for (int j = 0; j < a.length(); j++) {
			
			//for (int i = 0; i < a.length(); i++) {
				if(!a1.contains(a.substring(j, j+1))) {
					a1 += a.substring(j, j+1);
			//	}
				
			}
			
		}
		System.out.println(a1);
		
		
		// Removing duplicates of String b
		String b1 = "";
		
		for (int j = 0; j < b.length(); j++) {
					
			//for (int i = 0; i < b.length(); i++) {
				
				if(!b1.contains(b.substring(j, j+1))) {
					
					b1 += b.substring(j, j+1);
				//}
					
			}
					
		}
		
		System.out.println(b1);	
		System.out.println();
		
		
		// Comparing a1 and b1
		// 		   "abcd"  "cab"
		char[] ch1 = a1.toCharArray();
		System.out.println(Arrays.toString(ch1));
		
		char[] ch2 = b1.toCharArray();
		System.out.println(Arrays.toString(ch2));
		System.out.println();
		
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		//System.out.println("=========================");
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		System.out.println();
		
		
		String str1 = Arrays.toString(ch1);
		String str2 = Arrays.toString(ch2);
		
		if (str1.equals(str2))
			System.out.println(true);
		else
			System.out.println(false);
		System.out.println();
		
		
		// Short solution with methods
		String Str1 = "aabbbcdd";
		String Str2 = "cabbbccaa";
		
		Str1 =  new TreeSet<String>(Arrays.asList(Str1.split(""))).toString();
		Str2 =  new TreeSet<String>(Arrays.asList(Str2.split(""))).toString();
		System.out.println(Str1.equals(Str2));	
			
		
	}

}
