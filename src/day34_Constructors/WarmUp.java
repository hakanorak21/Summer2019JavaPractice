package day34_Constructors;

import java.util.ArrayList;

public class WarmUp {
	
	/**
	 1. write  a return method that can remove duplicates from a string
		Ex: RemoveDup("abcabc") ==> returns "abc";
		
	 2. write a return method that accepts two parameter Strings a and b, 
	 	and returns the total numbers of appearance of b in String a
		Ex: count("abcaba", "a")  ==> returns 3 ;
		
	 3. use the above two methods to write a new method that can find 
	 	the frequency of characters
		Ex: frequency("aabcabcabc") ==>a4b3c3
		
	 4. write a return method that can find the maximum number from 
	 	an Integer arrayList   
	 	(DO NOT use sort methods of Collections class)
	 
	 5. write a return method that can find the minimum number 
	 	from an Integer arrayList     
	 	(DO NOT use sort methods of Collections class)
	*/
	
	public static void main(String[] args) {
		
		System.out.println( RemoveDup("acbabc") ); //acb
		System.out.println(count("abcaba", "a")); //3
		System.out.println(frequency("aabcabcabc")); //a4b3c3
		
		//Task 4
		ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(100);
			list.add(20);
			list.add(0);
			list.add(30);
		int num = maximum(list);
		System.out.println(num);
		
		//Task 5
		int num2 = minimum(list);
		System.out.println(num2);
		
	}
	
	//Task 1
	public static String RemoveDup(String str) {
		
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if(!result.contains(str.substring(i, i+1)))
				result += str.substring(i, i+1);
		}
		
		return result;
	}
	
	//Task 2
	public static int count(String str1, String str2) {
		
		int count = 0;
		/*
		for (int i = 0; i < str1.length(); i++) {
			if (str1.substring(i, i+str2.length()).equals(str2))
				count++;
		}
		*/
		
		while(str1.contains(str2)) {
			count++;
			str1 = str1.replaceFirst(str2, "");
		}
		
		return count;
	}

	//Task 3
	public static String frequency(String str1) {
		
		String result = "";
		String str2 = RemoveDup(str1);
		
		for (int i = 0; i < str2.length(); i++) {
			int count = count(str1, str2.substring(i, i+1));
			result += str2.substring(i, i+1) + count; 
		}
		
		return result;
	}

	//Task 4
	public static int maximum(ArrayList<Integer> list) {
		
		int max = Integer.MIN_VALUE;
		for (int each: list) {
			if (each > max)
				max = each;
		}
		
		return max;
	}
	
	//Task 5
	public static int minimum(ArrayList<Integer> list) {
		
		int min = Integer.MAX_VALUE;
		for (int each: list) {
			if (each < min)
				min = each;
		}
		
		return min;
	}
	
	
}
