package day28_JavaRecap;

import java.util.Arrays;

public class ArraysReview {
	
	/**
	 Single-dimensional arrays: Ordered collection of arrays 
	 
	 */
	
	public static void main(String[] args) {
		
		int [] arr1D = {1, 2, 3, 4};
		int arr1Da []= {1, 2, 3, 4};
		int[] arr1Db = new int [4];
		int[] arr1Dc = new int[] {1, 2, 3, 4}; 
		
		int[] arr1Dd = new int [4];
		arr1Dd[0] = 1;
		System.out.println(Arrays.toString(arr1Dd));
		
		String[] arr1De = new String[3];
		System.out.println(Arrays.toString(arr1De));
		
		int[] numbers = {10, 20, 30, 40};
		
		for (int each: numbers) {
			if(each == 20)
				continue;
			System.out.print(each + " ");
			break;
		}
		
	}

}
