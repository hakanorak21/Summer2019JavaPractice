package day35_Constructors;

import java.util.ArrayList;
import java.util.Collections;

public class WarmUp2 {
	
	/**
	1. write a return method that can combine two Integer ArrayLists
	2. write a return method that can remove the duplicates 
	from a String ArrayList
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers1 = new ArrayList<>();
		numbers1.add(1);
		numbers1.add(2);
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(3);
		numbers2.add(4);
		
		//System.out.println(CombineArrayLists(numbers1, numbers2));
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers = CombineArrayLists(numbers1, numbers2);
		System.out.println(numbers);
		
		ArrayList<Integer> numbers3 = new ArrayList<>();
		numbers3 = CombineArrayLists(numbers, numbers2);
		
		System.out.println(numbers3);
		
		System.out.println(RemoveDuplicates(numbers3));
				
	}
	
	public static ArrayList<Integer> CombineArrayLists(ArrayList<Integer> a, ArrayList<Integer> b){
		
		a.addAll(b);
		return a;
		
	}
	
	public static ArrayList<Integer> RemoveDuplicates(ArrayList<Integer> a){
		
		ArrayList<Integer> unique = new ArrayList<>();
		
		for (Integer each: a) {
			if(!unique.contains(each))
				unique.add(each);
		}
		
		return unique;
	}

}
