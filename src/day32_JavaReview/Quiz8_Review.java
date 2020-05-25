package day32_JavaReview;

import java.util.Arrays;

public class Quiz8_Review {
	
	public static void main(String[] args) {
		
		/**
		// Question 4
		int[] arr = {30, 20, 10, 5, 0};
		Arrays.sort(arr);
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == 30) {
				
				continue;
				//count++; //Unreachable code ==> Compile error
			}
			
			System.out.print(arr[i] + " ");
		}
		
		
		// Question 6
		for (int i = 5; i >= 0; i--) {
			
			System.out.print(i + " ");
			if (i == 3) {
				break;
				//System.out.println("Done"); //Unreachable code ==> Compile error
			}
			
		}
		
		Review:
		//Question 7
		public static int num(int a, int b) {
			return (a+b);
			//System.out.println(a+b); //Unreachable code

		}
		
		
		//Question 8
		int num = 5;
		
		while(isAvailable(num)) {
			System.out.print(num--);
			//num--;
		}
		*/
		
		//Question 16
		int data[] = {  2010,  2013,  2014,  2015,  2014 };
		int key = 2014;

		int count = 0;
		for ( int  e :  data ) {

			if(e != key) {
				count++;
				continue;
				//count++; //Compile error
			}

		}

		System.out.println ( count + " Found ");

	}
	
	
	public static boolean isAvailable(int num) {
		return num-- > 0? true: false;
	}

}
