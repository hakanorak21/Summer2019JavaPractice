package java_Book;

import java.util.Scanner;

public class Exercise16 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a whole number greater than 1:");
		
		int n1, k;
		
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		k = (int) (Math.log(n1)/Math.log(2));
		
		System.out.println("The largest integer k such that 2^k is less than or equal to your number is:");
		System.out.println((int)(Math.pow(2, k)));
		
	}
	

}
