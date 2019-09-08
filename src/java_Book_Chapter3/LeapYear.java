package java_Book_Chapter3;

import java.util.Scanner;

public class LeapYear 

{
	public static void main(String[] args) 
	{
		System.out.println("This program determines if a given year is a leap year or not.");
		System.out.print("Enter a year:");
        Scanner keyboard =  new Scanner(System.in);
        int year = keyboard.nextInt();
        // System.out.println("You entered year " + year + ".");
        
        if ((year % 400) == 0)
        	System.out.println(year + " is a leap year.");
        else if ((year % 100) == 0)
        	System.out.println(year + " is not a leap year.");
        else if ((year % 4) == 0)
        	System.out.println(year + " is a leap year.");
        else 
        	System.out.println(year + " is not a leap year.");
        
	}

}
