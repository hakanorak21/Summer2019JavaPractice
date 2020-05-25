package day22_NestedLoop;

import java.util.Scanner;

public class HW {
	
	/*
	 
    calculator program:
   	write a program that asks user user if he/she wants to: *, / , %, - , +
    
    then ask user to enter two numbers
    
    then return the result to the console
    
    and then ask the user if they wanna continue to do another math
    if yes ==> repeat the previous steps,
    if no ==> exit the system
    other wise ==> ask the user to re enter 
    
    */
	
	public static void main(String[] args) {
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			int a, b;
			
			System.out.println("Calculator: +? -? *? /? or %?  ");
			String math = scan.next();
			
			switch(math) {
			
			case "+":
				System.out.println("Now enter two numbers: ");
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println("Addition is " + (a+b));
				break;
			
			case "-":
				System.out.println("Now enter two numbers: ");
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println("Subtraction is " + (a-b));
				break;
			
			case "*":
				System.out.println("Now enter two numbers: ");
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println("Multiplication is " + (a*b));
				break;
			
			case "/":
				System.out.println("Now enter two numbers: ");
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println("Division is " + (a/b));
				break;
			
			case "%":
				System.out.println("Now enter two numbers: ");
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println("Remainder is " + (a%b));
				break;
			
			default:
				System.out.println("Invalid entry!");
					
			}
			
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
