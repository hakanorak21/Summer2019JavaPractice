package day31_JavaReview;

import java.util.Arrays;

public class Quiz8_Question4 {
	
	public static void main(String[] args) {
		
		int[] arr = {30, 20, 10, 5, 0};
		Arrays.parallelSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 30) {
				continue;
				//count++;
			}
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
