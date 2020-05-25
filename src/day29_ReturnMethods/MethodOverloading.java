package day29_ReturnMethods;

import java.util.Arrays;

public class MethodOverloading {
	
	/**
	 It is a feature that allows us to have more than one method 
	 with the same name. 
	 The methods MUST have different parameters.
	 Return type doesn't have to be the same.
	 
	 Why overloading?
	 1. Improve re-usability
	 2. Improves readability
	 3. Easier to remember: According to master Muhtar
	 
	 In Java, all methods can be overloaded.
	 */

	public static void main(String[] args) {
		
		int result = sum(10, 20, 30);
		System.out.println(result);
		
		int result2 = sum(10, 20);
		System.out.println(result2);
		
		double result3 = sum(1.5, 2.5);
		System.out.println(result3);
		
		char[] ch = {'a',  'b', 'c'};
		Sort(ch);
		//System.out.println(Arrays.toString(ch));
		
		System.out.println();
		
		String[] str = {"A", "D", "B", "C"};
		Sort(str);
			
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double sum(double a, double b) {
		return a+b;
	}
	
	public static void Sort (char[] arr) {
		
		Arrays.sort(arr);
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void Sort (String[] arr) {
		Arrays.sort(arr);
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	
	}	
	
}
