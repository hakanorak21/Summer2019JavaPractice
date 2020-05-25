package day24_JavaRecap;

import java.util.Scanner;

public class ArrayReview {
	
	public static void main(String[] args) {
		
		/**
		//combining two arrays
		int[] array1 = {1, 2, 3};
		int[] array2 = {4, 5, 6, 7};
		int[] array3 = new int [array1.length + array2.length];
		
		int i = 0;
		while (i < array1.length) {
			array3[i] = array1[i];
			i++;
		}
		i = 0;
		while (i < array2.length) {
			array3[i + array1.length] = array2[i];
			i++;
		}
		i = 0;
		for (i = 0; i < array3.length; i++)
			System.out.print(array3[i] + " ");
		
		
		//Ask user to enter 5 numbers and add them using arrays
		int[] numbers = new int[5];
		Scanner scan = new Scanner (System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter a number:");
			numbers[i] = scan.nextInt();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("\nTotal is " + sum);
		*/
		
		//Ask 5 names and return the longest one
		String[] names = {"Seyfo", "Asiya", "Myra", "Kateryna", "Daulet"};
		
		int max = 0;
		String longestName = "";
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() > max) {
				max = names[i].length();
				longestName = names[i];
			}
		}
		
		System.out.println(longestName + " is the longest name with "
							+ max + " characters.");
		
	}

}
