package day28_JavaRecap;

import java.util.Arrays;

public class Kahoot {
	
	public static void main(String[] args) {
		
		// Question 3
		char[] ch = {'a', 'b', 'c'};
		
		int count = 0;
		while (count < ch.length-1) {
			count++;
		}
		System.out.println(count);
		
		// Question 5
		String[] arr = {"Maral", "Nurullah"};
		arr[0] = arr[1];
		System.out.println(Arrays.toString(arr));
		arr[1] = arr[0];
		System.out.println(Arrays.toString(arr));
		
		// Question 6
		int[] nums = {5, 4, 3, 2, 1};
		for (int each: nums) {
			if (each == 3)
				continue;
			System.out.print(each + " ");
			break;
			
		}
		System.out.println();
		
		// Question 10
		long[] Arr = new long[2];
		Arr[0] = 5L;
		Arr[1] = 10L;
		
		Arr = new long[4];
		Arr[2] = 15L;
		Arr[3] = 20L;
		System.out.println(Arrays.toString(Arr));
		
	}

}
