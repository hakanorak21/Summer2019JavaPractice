package day25_ArraysContinue;

import java.util.Arrays;

public class Practice_2D_Array {
	
	public static void main(String[] args) {
		
		int[][] array2D = { {1,2} , {3,4,5,6,7} , {8,9} };
		
		// length method
		int length = array2D.length;
		System.out.println(length); // 2
		
		// Print all arrays
		for (int i = 0; i < array2D.length; i++) {
			System.out.println(Arrays.toString(array2D[i]));
		}
		
		// Print each element
		for (int i = 0; i < array2D.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < array2D[i].length; j++)
				System.out.print(array2D[i][j] + " ");
			System.out.print("]");
		}
		System.out.println();
		
		char[][] ch2D = { {'A','B', 'G'} , {'C','D','E'} };
		
		for (int i = 0; i < ch2D.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < ch2D[i].length; j++)
				System.out.print(ch2D[i][j] + " ");
			System.out.print("]");	
		}
			
		
	}

}
