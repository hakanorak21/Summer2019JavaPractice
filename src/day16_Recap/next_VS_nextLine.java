package day16_Recap;

import java.util.Scanner;

public class next_VS_nextLine {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first name");
		String first = scan.nextLine();
		
		System.out.println("Enter last name");
		String last = scan.nextLine();
		
		System.out.println(first + " " + last);
		
	}

}
