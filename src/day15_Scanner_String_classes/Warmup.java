package day15_Scanner_String_classes;

import java.util.Scanner;

public class Warmup {
	
	public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a number between 0 and 9: ");
	int num = keyboard.nextInt();
	
	/*
	String number = "";
	
	switch (num) {
	case 0:
		number = "zero";
		break;
	case 1:
		number = "one";
		break;
	case 2:
		number = "two";
		break;
	case 3:
		number = "three";
		break;
	case 4:
		number = "four";
		break;
	case 5:
		number = "five";
		break;
	case 6:
		number = "six";
		break;
	case 7:
		number = "seven";
		break;
	case 8:
		number = "eight";
		break;
	case 9:
		number = "nine";
		break;
		
	default:
		System.out.println("Invalid entry");
	}
	*/
	
	String number = (num == 0)? "zero" :(num == 1)? "one" :(num == 2)? "two" 
					:(num == 3)? "three" :(num == 4)? "four" :(num == 5)? "five" 
					:(num == 6)? "six" :(num == 7)? "seven" :(num == 8)? "eight" 
					:(num == 9)? "nine" :"invalid entry";
	System.out.println("You entered " + number + "." );

	}
}
