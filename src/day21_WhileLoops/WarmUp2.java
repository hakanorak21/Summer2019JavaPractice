package day21_WhileLoops;

import java.util.Scanner;

public class WarmUp2 {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int numBooks = 0;
		
		for (int i = 0; i < str.length()-3; i++) {
			
			if (str.contains("book")) {
			numBooks++;
			str = str.replaceFirst("book", "");
			}
			
		}
		
		/*
		for (int i = 0; i < str.length() - 3; i++) {
		
			if (str.substring(i, i+4).equals("book"))
				numBooks++;
			
		}
		*/
		System.out.println(numBooks);
			
	}


}
