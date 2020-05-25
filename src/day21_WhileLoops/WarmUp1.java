package day21_WhileLoops;

/*
 input: aabbcc
 output: abc
 */

import java.util.Scanner;

public class WarmUp1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String output = "";
		
		
		for (int i = 0; i < str.length(); i++) {
			
			if (!output.contains(str.substring(i, i+1)))
			//Or				(""+str.charAt(i))
				output += str.substring(i, i+1);	
			
		}
		
		
		System.out.println(output);
		
	}

}
