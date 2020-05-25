package Day33_ArrayList;

import java.util.Arrays;

public class WarmUp {
	
	/**
	Write a return method that accepts an int array and sorts it in descending order
    Write a return method that accepts a double array and sorts it in descending order
    Write a return method that accepts a char array and sorts it in descending order
    Write a return method that accepts a String array and sorts it in descending order
    
    Hint: method overloading is preferred here
	 */
	
	public static void main(String[] args) {
		
		int[] arr = {3, 10, 1, 99};
		double[] arr2 = {2.5, 9.9, 0.3, 15.7, -0.6};
		char[] arr3 = {'a', 'A', 'B', 'c', '#'};
		String[] arr4 = {"Monday", "Tuesday", "Wednesday", "Thursday"};
		
		arr = SortDescending(arr);
		System.out.println(Arrays.toString(arr));
		
		arr2 = SortDescending(arr2);
		System.out.println(Arrays.toString(arr2));
		
		arr3 = SortDescending(arr3);
		System.out.println(Arrays.toString(arr3));
		
		arr4 = SortDescending(arr4);
		System.out.println(Arrays.toString(arr4));
		
	}
	
	public static int[] SortDescending(int[] a) {
		
		Arrays.sort(a); //Ascending order
		int[] result = new int[a.length];
		for (int i = a.length-1; i >= 0; i--) {
			result[a.length-1-i] = a[i];
		}
		return result;
		
	}
	
	public static double[] SortDescending(double[] a) {
		
		Arrays.sort(a); //Ascending order
		double[] result = new double[a.length];
		for (int i = a.length-1; i >= 0; i--) {
			result[a.length-1-i] = a[i];
		}
		return result;
		
	}
	
	public static char[] SortDescending(char[] a) {
		
		Arrays.sort(a); //Ascending order
		char[] result = new char[a.length];
		for (int i = a.length-1; i >= 0; i--) {
			result[a.length-1-i] = a[i];
		}
		return result;
		
	}
	
	public static String[] SortDescending(String[] a) {
		
		Arrays.sort(a); //Ascending order
		String[] result = new String[a.length];
		for (int i = a.length-1; i >= 0; i--) {
			result[a.length-1-i] = a[i];
		}
		return result;
		
	}	

}
