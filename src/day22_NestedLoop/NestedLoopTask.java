package day22_NestedLoop;

import java.util.Scanner;

public class NestedLoopTask {
	
	public static void main(String[] args) {
		
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Addition is " + (a + b));
		
		System.out.println("Do you wanna continue?");
		String answer = scan.next();
		
			while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
				System.out.println("Invalid entry. Please re-enter:");
				System.out.println("Do you wanna continue?");
				answer = scan.next();
			}
					
			if (answer.equalsIgnoreCase("no")){
				break;
			} 
		
		}
		
		
	}

}
