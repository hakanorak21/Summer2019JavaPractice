package Day33_ArrayList;

import java.util.Arrays;

public class Practice {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[3];
		
		arr2 = arr1;
		System.out.println(Arrays.toString(arr2));
	}

}
