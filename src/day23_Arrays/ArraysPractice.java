package day23_Arrays;

import java.util.Scanner;

public class ArraysPractice {
	
	public static void main(String[] args) {
		
	// Array is immutable and the size is fixed.
		String[] AllStudents = {"Ibrahim", "Zuleyha", "Elina"};
		AllStudents[0] = "Marufjon";
		System.out.println(AllStudents[0]); //Marufjon
		
	// Array size must be initialized:
	// 1. By giving values
	// 2. By giving the size only
		int[] a = new int[3]; //declared but not assigned
		System.out.println(a[0]);
		
		a[0] = 1;
		System.out.println(a[0]);
		
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i++) {
		
			System.out.println("Enter a number:");
			numbers[i] = scan.nextInt();
			
		}
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print(numbers[i] + " ");
			
		}
		
		
		
		
	}

}
