package day25_ArraysContinue;

import java.util.Arrays;

public class Multi_Dimensional_Array {
	
	/**
	 Multi-dimensional arrays: n dimensional array contains 
	 							(n-1) dimensional arrays
	 */
	
	public static void main(String[] args) {
		
		int[] arr1D = {1, 2, 3};
		
		// 2 dimensional array contains 1 dimensional arrays
		
		int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
		String[] arr = {"A", "B"};
		String[][] str2D = {{"A", "B"}, {"C", "D", "E"}};
		//						0				1
		System.out.println(str2D[0][0]);
		System.out.println(Arrays.toString(str2D[1]));		
		System.out.println(str2D[1][2]);
		
		//Arrays.deepToString(arrayName): Converts multi-dimensional arrays
		//									to string
		System.out.println(Arrays.deepToString(str2D));
		
		int[][] Numbers2D = { {1, 2}, {5, 10, 15}, {5, 6} };
		//						0		   1		 2
		
		// Print 6
		System.out.println(Numbers2D[2][1]);
		
		System.out.println(Arrays.toString(Numbers2D[2]));
		
		System.out.println(Arrays.deepToString(Numbers2D));
		
		// 3 dimensional array contains multiple 2 dimensional arrays
		int[][][] Array3D = { { {1, 2}, {3, 4} } , { {5, 6}, {7, 8} } };
		//							  0					   1
		//						  0		  1			   0		1
		// 						 0  1	 0  1		  0  1	  0  1
		//[index number of 2D array] [index number of 1D array] 
		//[index number of value]
		
		// Print 8
		System.out.println(Array3D[1][1][1]);
		
		// Print {5, 6}
		System.out.println(Arrays.toString(Array3D[1][0]));
		
		// Print { {5, 6}, {7, 8} } }
		System.out.println(Arrays.deepToString(Array3D[1]));
		
		// Print entire 3D array
		System.out.println(Arrays.deepToString(Array3D));
		
		// 4D array contains multiple 3D arrays
		
		
	}

}
