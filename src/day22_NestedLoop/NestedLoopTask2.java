package day22_NestedLoop;

import java.util.Scanner;

public class NestedLoopTask2 {
	
	public static void main(String[] args) {
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter two numbers: ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Multiplication is " + a*b);
		
			System.out.println("Do you wanna continue?");
			String answer = scan.next();
		
			if (answer.equalsIgnoreCase("no"))
				break;
		
			while(!(answer.equalsIgnoreCase("yes") || 
				answer.equalsIgnoreCase("no"))){
				System.out.println("Please make your mind");
				System.out.println("Do you wanna continue?");
				answer = scan.next();
			}
			
			if (answer.equalsIgnoreCase("no"))
				break;
		
		}
		
	}

}
