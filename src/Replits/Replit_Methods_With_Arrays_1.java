package Replits;

import java.util.Arrays;

public class Replit_Methods_With_Arrays_1 {
	
	/**
	 Method addElements accepts 2 int arrays and adds each element value of two arrays 
	 and returns a new array. You can assume that each array has 5 elements
	 */
	public static int[] addElements(int[] ints1, int[] ints2) {

		int[] sum = new int[5];
		for (int i = 0; i < sum.length; i++)
			sum[i] = ints1[i] + ints2[i];
		return sum;

	}
	
	/**
	deleteR gets an int array, and an int. It returns an int array.
	It removes element int from the array.  
	*/
	public static int[] deleteR(int[] arr,int element) {
		
		int[] result = new int[arr.length-1];
		int i = 0;
		for (int each: arr)
			if (each != element)
				result[i++] = each;
		return result;

	}//end deleteR
	
	public static void main(String[] args) {
		
		int[] ints1 = {10, 40, 50, 3, 1};
		int[] ints2 = {11, 0, 500, 44, 1101};
		System.out.println(Arrays.toString(addElements(ints1, ints2)));
		
		int[] ints3 = {1,2,3};
		int[] ints4 = new int[2];
		ints4 = deleteR(ints3,2);
		System.out.println(Arrays.toString(ints4));
		
	}
	
}
