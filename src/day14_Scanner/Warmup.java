package day14_Scanner;

import java.util.Scanner;

public class Warmup {
	
public static void main(String[] args) {
		
		
		String day = "Monday";
		
		switch (day) {
		
		case "Monday": 
		case "Tuesday":
			System.out.println("Java class day");
		break;
		
		case "Thursday": 
		case "Friday":
			System.out.println("Selenium class day");
		break;
		
		case "Wednesday": 
		case "Saturday":
			System.out.println("SQL class day");
		break;
		
		case "Sunday":
			System.out.println("Day off");
		break;
		
		default:
			System.out.println("Invalid entry");
			
		}
	
	}	

}
