package day26_ForEach;

import java.util.Arrays;

public class ForEach_MultiD {
	
	public static void main(String[] args) {
		
		int[] arr1D = {1,2,3,4};
		int[][] arr2D = { {1,2,3,4}, {5,6,7,8} };
		//					  0			 1
		
		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[i].length; j++) {
				System.out.print(arr2D[i][j] + " ");
			}	
		}
		
		System.out.println();
		
		
		// Now with for each
		for (int[] each: arr2D)
			for (int each2: each)
			System.out.print(each2 + " ");
		
		System.out.println();
		
		
		String[][] str2D = { {"Bibish", "Seyfo"}, {"Seyfoo", "Julia"}};
		for (String[] each1: str2D) {
			// System.out.println(Arrays.toString(each1));
			for (String each2: each1) {
				System.out.print(each2 + " ");
			}
				
		}
		System.out.println();
		
		
		int[][] num2D = { {1,2} , {3,4} };
		int[][][] num3D = { { {1,2} , {3,4} } , { {5,6} , {7,8} } };
		for (int[][] each2DArray: num3D) {
			for (int[] each1DArray: each2DArray) {
				for (int eachValue: each1DArray) {
					System.out.print(eachValue + " ");
				}
			}
		}
		
			
	}

}
