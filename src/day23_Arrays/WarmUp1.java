package day23_Arrays;

import java.util.Scanner;

public class WarmUp1 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int a, b;
		
		System.out.println("Enter two numbers and I will divide them for you:");
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		
		if (b != 0) {
			
			if (a < 0 && b > 0)
				a = -a; 
			if (b < 0 && a > 0)
				b = -a; 
			
			
			if (a < 0 && b < 0) {
				a = -a; 
				b = -b;
			}
			
			
			
			// What if:
			// Both negative?
			// If a negative?
			// If b negative?
			// a smaller than b?
			
		int i = 0;
		while (a >= b) {
			a -= b;
			i++;
		}
		
		System.out.println(i + " with a remainder of " + a);
		
		}else {
			
			System.out.println("I cannot divide a number by zero!");
		
		}
		
	}

}
