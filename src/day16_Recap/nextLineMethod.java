package day16_Recap;

import java.util.Scanner;

public class nextLineMethod {
	
	public static void main(String[] args) {
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your phone number: ");
		int phone = scan.nextInt();
		scan.nextLine(); // Extra nextLine() after a next and before nextLine
		
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		
		System.out.println(phone);
		System.out.println(name);
		*/
		
		Scanner scan = new Scanner(System.in);
		int phone = scan.nextInt();
		scan.nextLine();
		
		String name = scan.nextLine();
		System.out.println(name);
		System.out.println(phone);
		
		
	}

}
