package day21_WhileLoops;

import java.util.Scanner;

public class WarmUp3 {
	
	public static void main(String[] args) {
	  
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		word = word.toLowerCase();
		    
		if (word.startsWith("x"))
			word = word.substring(1);
		
		if (word.endsWith("x"))
			word = word.substring(0, word.length()-1);
		
		System.out.println(word);
		    
		  
	}

}
