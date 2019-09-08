package day14_Scanner;

/* 
Scanner:
It is a class that provides methods to get user inputs.
Scanner class presented in package "java.util" package.
So, we need to import Scanner.
import java.util.Scanner;
Import statement should be between package and ClassName.
Declaration of Scanner:
	Scanner VariableName = new Scanner(System.in);
	VariableName is a Scanner object declared as new Scanner(System.in).
	
*/

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a byte value: ");
		byte byteNum = keyboard.nextByte();
		System.out.println("You have entered " + byteNum);
		
		System.out.println();
		System.out.println("Enter another byte value: ");
		byte byteNum2 = keyboard.nextByte();
		System.out.println("You have entered " + byteNum2);
		
		System.out.println("Total= " + (byteNum + byteNum2));
		
		
		
	}
	
	

}
