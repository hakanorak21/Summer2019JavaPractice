package day20_JavaRcap;

import java.util.Scanner;

/*
 Write a program that asks user to enter number 10 times:
 1. Find the sum of those 10 inputs
 2. find the maximum and minimum number
 */

public class WarmUp2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter a number:");
			int inputNum = input.nextInt();
			sum += inputNum ;
		}
		
		System.out.println("The total is " + sum);
		
	}

}
