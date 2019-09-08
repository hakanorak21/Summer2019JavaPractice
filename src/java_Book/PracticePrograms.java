package java_Book;

import java.util.Scanner;

public class PracticePrograms 
{
	
	public static final double APR = 7.49;

	public static void main(String[] args) 
	{
		/*
		 // Exercise 1. This program reads three whole numbers and
		 // displays the average of the three numbers. 
		
		double n1, n2, n3;
		System.out.println("Please enter three whole numbers:");
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextDouble();
		n2 = keyboard.nextDouble();
		n3 = keyboard.nextDouble();
		System.out.println("The average of these numbers is:");
		System.out.println((n1 + n2 + n3)/3);
		
		
		// Exercise 2. Reading two strings from the keyboard.
		// Display each string with their lengths.
		// Combine these two strings and display its length.
		String s1, s2, sCombined;
		System.out.println("Please enter two sentences:");
		Scanner keyboard = new Scanner(System.in);
		s1 = keyboard.nextLine();
		s2 = keyboard.nextLine();
		System.out.println(s1 + " " + s1.length());
		System.out.println(s2 + " " + s2.length());
		
		sCombined = s1 + " " + s2;
		System.out.println(sCombined + " " + sCombined.length());
		
		
		// Exercise 3. Mortgage payment: Principal and Interest
		
		double monthlyPayment, outstandingBalance, interest, principal;
		System.out.println("Please enter your monthly mortgage payment:");
		Scanner keyboard = new Scanner(System.in);
		monthlyPayment = keyboard.nextDouble();
		
		System.out.println("Please enter your outstanding balance:");
		outstandingBalance = keyboard.nextDouble();
		
		System.out.println("You entered:");
		System.out.println("Monthly payment: " + monthlyPayment);
		System.out.println("Outstanding balance: " + outstandingBalance);
		
		interest = outstandingBalance * (APR/100/12);
		System.out.print("Your this month's interest payment is: ");
		System.out.printf("%1.2f", interest);
		System.out.println();
		System.out.print("Your this month's principal payment is: ");
		System.out.printf("%1.2f", (monthlyPayment - interest));
		
		
		// Exercise 4. Taking a 4-digit integer and display it one digit per line
		int number;
		System.out.println("Please enter a 4-digit number:");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt();
		System.out.println("You entered " + number);
		System.out.println("Now, let's display one digit per line!");
		
		System.out.println(number/1000);
		number %= 1000;
		System.out.println(number/100);
		number %= 100;
		System.out.println(number/10);
		number %= 10;
		System.out.println(number);
		
		// Exercise 5. This time, treating the 4-digit number as a string. 
		String number;
		System.out.println("Please enter a 4-digit number:");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.next();
		System.out.println("You entered " + number);
		System.out.println("Now, let's display one digit per line!");
		
		System.out.println(number.charAt(0));
		System.out.println(number.charAt(1));
		System.out.println(number.charAt(2));
		System.out.println(number.charAt(3));
		
		// Exercise 5a. Expand the exercise for any whole number.
		String number;
		System.out.println("Please enter a whole number:");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.next();
		System.out.println("You entered " + number);
		System.out.println("Now, let's display one digit per line!");
		
		int index = 0; 
		while(index < number.length())
		{
		System.out.println(number.charAt(index));
		index++;
		}
		*/
		
		Scanner keyboard = new Scanner(System.in);
		int age;
		String name;
		
		System.out.println("Please enter your full name:");
		name = keyboard.nextLine();
		
		System.out.println("Please enter your age:");
		age = keyboard.nextInt();
		
		name.toUpperCase();
		System.out.println("Your name is " + name + " and you are " + age + " years old.");
		
		
		
		
		
	}

}
