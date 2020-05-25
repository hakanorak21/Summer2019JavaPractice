package day21_WhileLoops;

import java.util.Scanner;

public class practice {
	
	public static void main(String[] args) {
		
		String answer = "";
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Enter first number: ");
			int a = scan.nextInt();
			
			System.out.println("Enter second number: ");
			int b = scan.nextInt();
			
			System.out.println("Total is " + (a+b));
			
			System.out.println("Do you want to continue?");
			answer = scan.next();
			
			if (answer.equalsIgnoreCase("no"))
				break;
				
			} while (answer.equalsIgnoreCase("yes"));
			
	}	

}
