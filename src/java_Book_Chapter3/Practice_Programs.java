package java_Book_Chapter3;

import java.util.Scanner;

public class Practice_Programs 
{
	public static void main(String[] args) 
	{
		/*
		// Program 1. Testing whether a number is divisible by another number.
		
		int dividend, divisor;
		System.out.println("Enter two number and I will tell you if they are divisible:");
        Scanner keyboard = new Scanner(System.in);
        dividend = keyboard.nextInt();
        divisor = keyboard.nextInt();
        
        if (divisor == 0) {
        	System.out.println("I cannot divide any number by zero!");
        	System.exit(0);
        }
        
        if ((dividend % divisor) == 0){
        	System.out.println(dividend + " can be divided by " + divisor +
        						" with no remainder.");
        }
        else 
        	System.out.println(dividend + " cannot be divided by " + divisor +
        						" with no remainder.");
		*/
		
		// Program 2. Displaying integers in increasing order.
		int a, b, c;
		int num1 = 0, num2 = 0, num3 = 0;
		
		System.out.println("Enter 3 nonnegative integers: ");
        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        
        if (a == b || a == c || b == c) {
        	System.out.println("Please rerun and enter distinct numbers!");
        	System.exit(0);
        }
        
        if (a < b && a < c) {
        	num1 = a;
        	if (b < c) {
        		num2 = b;
        		num3 = c;
        	}
        	else {
        		num2 = c;
        		num3 = b;
        	}
        }
        
        else if (b < a && b < c) {
        	num1 = b;
        	if (a < c) {
        		num2 = a;
        		num3 = c;
        	}
        	else {
        		num2 = c;
        		num3 = a;
        	}
        }
        
        else if (c < a && c < b) {
        	num1 = c;
        	if (a < b) {
        		num2 = a;
        		num3 = b;
        	}
        	else {
        		num2 = b;
        		num3 = a;
        	}
        }
        
        else
        	System.out.println("Something wrong!");
        
        System.out.println("Three numbers in increasing order:");
        System.out.println(num1 + " " + num2 + " " + num3);
        		
        	
		
	}

}
