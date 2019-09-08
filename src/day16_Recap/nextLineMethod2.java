package day16_Recap;

import java.util.Scanner;

public class nextLineMethod2 {
	
	public static void main(String[] args) {
		
		int zipCode;
		String city, state, phone;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your zip code: ");
		zipCode = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter city: ");
		city = scan.nextLine();
		
		System.out.println("Enter state: ");
		state = scan.nextLine();
		
		System.out.println("Enter phone: ");
		phone = scan.nextLine();
		
		System.out.println("Zip code is " + zipCode);
		System.out.println("City is " + city);
		System.out.println("State is " + state);
		System.out.println("Phone is " + phone);
		
		
	}

}
