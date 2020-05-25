package day20_Replit;

import java.util.Scanner;

public class CountHi {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    str.equalsIgnoreCase("Alan");
	    int numHi = 0;
	    
	    while (str.contains("hi")){
	      str = str.substring(str.indexOf("hi")+1);
	      numHi++;  
	    } 
	    
	      System.out.println(numHi);
	    
	 
	}

}
