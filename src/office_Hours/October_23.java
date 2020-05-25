package office_Hours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class October_23 {
	
	public static void main(String[] args) {
		
		// Strings and arrays are immutable!
		int[] numbers = {3,5,76,232}; // Array size is fixed.
		//int numbers [] = {3,5,76,232}; 
		
		//int[] numbers = new int[4];
		//numbers = {3,5,76,232}; // Illegal 
		
		//int[] numbers = new int[4]{3,5,76,232}; // Illegal
		
		//int[] numbers = new int[-3]; // Compiles but
		//System.out.println(Arrays.toString(numbers)); // Negative array size
														// exception
		
		/**
		 How to copy an array?
		 1. For loop
		 2. Arrays.copyOf() method
		 3. clone() method
		 */
		
		//For loop
		int[] n = new int [numbers.length];
		for (int i = 0; i < numbers.length; i++)
			n[i] = numbers[i];
		System.out.println(Arrays.toString(n));
		
		//Sorting an array: Arrays.sort()
		Arrays.parallelSort(n);
		System.out.println(Arrays.toString(n));
		
		int[] num2 = {100, 0, -100, 50, -100};
		Arrays.parallelSort(num2);
		System.out.println(Arrays.toString(num2));
		
		//Second largest
		System.out.println(num2[num2.length-2]);
		
		//Checking equality of two arrays
		int[] array1 = {3,5,80,200};
		int[] array2 = {10,20};
		int[] array3 = {3,5,80,200};
		System.out.println(Arrays.equals(array1, array3));
		
		//Index of a specific element
		System.out.println(Arrays.binarySearch(array1, 80));
		
		//Iterating over an array
		int[] a = new int[] {45,12,78,34,89,21};
		for (int each: a)
			System.out.print(each + " ");
		System.out.println();
		
		//Initializing an ArrayList: add(), asList() methods
		//							 Or another ArrayList
		
		//BinarySearch example
		String[] words = {"yy", "bb", "aa", "cc"};
		System.out.println(Arrays.binarySearch(words, "bb"));
		
		System.out.println(Arrays.binarySearch(words, "zz")); //-5
		
		System.out.println(Arrays.binarySearch(words, "ff"));
		
		System.out.println(Arrays.binarySearch(a, 89));
		
		//Reversing
		String word = "java";
		StringBuilder kk = new StringBuilder();
		kk.append("java");
		kk.reverse();
		System.out.println(kk); //avaj
		
		kk.append("doc");
		kk.reverse();
		System.out.println(kk); //codjava
		
		//How to convert list to array
		List<String> movies = Arrays.asList("Captain America", "Avatar", 
											"Harry Potter");
		String[] arraysOfMovies = new String[movies.size()];
		movies.toArray(arraysOfMovies);
		System.out.println(Arrays.toString(arraysOfMovies));
		
		//Now, array to list
		String[] arr = {"v", "er"};
		ArrayList<String> copyArr = new ArrayList<>(Arrays.asList(arr)); 
		System.out.println(copyArr);
		
	}

}
