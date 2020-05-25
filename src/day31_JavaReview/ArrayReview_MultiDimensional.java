package day31_JavaReview;

import java.util.Arrays;
import java.util.Scanner;

// As user to enter 3 numbers and find the maximum and minimum

public class ArrayReview_MultiDimensional {

	/**
	 n dimensional array: contains (n-1) dimensional arrays
	 */
	
	public static void main(String[] args) {
		
		int[] arr1D = {1,2,3};
		
		// 				   0 1 2	 0 1 2
		int[][] arr2D = { {1,2,3} , {4,5,6} };
		// index: 			 0		   1
		
		// Print 1D arrays
		System.out.println(Arrays.toString(arr2D[0]));
		System.out.println(Arrays.toString(arr2D[1]));
		
		// Print 2
		System.out.println(arr2D[0][1]);
		
		// Print entire arr2D
		System.out.println(arr2D); // Hash code
		System.out.println(Arrays.deepToString(arr2D));
		
		String str = Arrays.deepToString(arr2D);
		System.out.println(str);
		
		System.out.println(Arrays.toString(arr2D[1]));
		
		//Arrays.deepToString(arr2D[0]); // Doesn't work with one-dimensional
									     // arrays with primitive elements
		
		char[] ch = {'a', 'b', 'c', 'd'};
		
		for (char each: ch) {
			if(each == 'c') {
				continue;
			 //System.out.print(each + " "); // Won't be executed after continue
			}
			System.out.println(each + " ");
		}
		System.out.println();
		
		String[][] names = { {"Erhan", "Holy", "Denis"} , {"Muhtar", "Mike", "Asiya"} };
		
		for (String[] each1D: names) {
			for (String eachValue: each1D) {
				if(eachValue.equals("Holy") || eachValue.equals("Mike"))
					continue;
				System.out.print(eachValue + " ");
			}
		}
		
		
		
		
		
		
	}

}
