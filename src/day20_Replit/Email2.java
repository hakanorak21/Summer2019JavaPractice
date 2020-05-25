package day20_Replit;

import java.util.Scanner;

public class Email2 {
	
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    System.out.println("First name: " + email.substring(0, 1).toUpperCase() +
	    					email.substring(1, email.indexOf("_")));
	    
	    
	    
	  }

}
