package day22_NestedLoop;

import java.util.Scanner;

public class Divide {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter two numbers and I will divide them for you:");
		int dividend = keyboard.nextInt();
		int divisor = keyboard.nextInt();
		
		int remainder = divisor;
		int quotient = 0;
		while(remainder < dividend){
			remainder += divisor;
			quotient++;
		}
		
		System.out.println("The result is " + quotient +
				" with a remainder of " + (dividend - (remainder -divisor)));
			
	}

}
