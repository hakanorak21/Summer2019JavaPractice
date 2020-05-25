package day31_JavaReview;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUp {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		
		/**
		for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter a number:");
		arr[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted: " + Arrays.toString(arr) );
		System.out.println("Minimum is " + arr[0]);
		System.out.println("Maximum is " + arr[arr.length-1]);
		*/
		
		//Now, user decides how many numbers he/she will enter
		System.out.println("How many numbers would you like to enter?");
		arr = new int[scan.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter your number " + (i+1) + ": ");
		arr[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted: " + Arrays.toString(arr) );
		System.out.println("Minimum is " + arr[0]);
		System.out.println("Maximum is " + arr[arr.length-1]);
			
	}

}
