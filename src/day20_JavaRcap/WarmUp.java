package day20_JavaRcap;

import java.util.Scanner;

public class WarmUp {
	
	public static void main(String[] args) {
		
		// Task 01
		int sum = 0;
		for ( int i = 1; i <= 1000; i++)
			sum += i; 
		System.out.println("The sum of the numbers between 1 and 1000 is " + sum);
		
		// Task 02
		int sum2 = 0;
		for (int i = 1; i <= 1000; i++) 
			if (i % 2 == 0)
				sum2 += i; 
		System.out.println("The sum of the even numbers between 1 and 1000 is " + sum2);
		
		// Solution 2
		int Sum2 = 0;
		for (int i = 2; i <= 1000; i += 2) {
			Sum2 += i;
		}
		System.out.println("The sum of the even numbers between 1 and 1000 is " + Sum2);
		
		// Task 03
		int sum3 = 0;
		for ( int i = 1; i <= 1000; i++) 
			if (i %2 == 1)sum3 += i; 
		System.out.println("The sum of the odd numbers between 1 and 1000 is "+ sum3);
		
		// Solution 02
		int Sum3 = 0;
		for ( int i = 1; i <= 1000; i += 2) 
			Sum3 += i; 
		System.out.println("The sum of the odd numbers between 1 and 1000 is "+ sum3);
				
	}


}
