package java_Book;

import java.util.Scanner;

public class ArithmeticExpressions 
{
	public static void main(String[] args) 
	{
		int homeNumber;
		double homeCharge = 200.0;
		double squareFootOfFloor;
		double costPerSqft = 1.25;
		double homeRevenue;
		double floorRevenue;
		double totalRevenue;
		
		System.out.println("Please enter the number of homes worked on:");
		
		Scanner keyboard = new Scanner (System.in);
		homeNumber = keyboard.nextInt();
		
		System.out.println("Please enter the square foot of floor sanded:");
		squareFootOfFloor = keyboard.nextInt();
		
		homeRevenue = homeNumber * homeCharge;
		System.out.print("Revenue from home visits is: $");
		System.out.println(homeRevenue);
		
		floorRevenue = squareFootOfFloor * costPerSqft;
		System.out.print("Revenue from floor sanding is: $");
		System.out.println(floorRevenue);
		
		totalRevenue = homeRevenue + floorRevenue;
		System.out.print("Total revenue is: $");
		System.out.println(totalRevenue);
		
	}

}
