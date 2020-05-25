package day21_WhileLoops;

import java.util.Scanner;

/*
 For loop: initialization, condition, iteration
 While loop: condition (is executed as long as condition is true)
 Break statement: We can exit the loop using the break statement. 
 */

public class WhileLoop {
	
	public static void main(String[] args) {
		/*
		int a = 9;
		while (a > 8) {
			System.out.println("Hello");
			a--;
		}
		
		
		// Write a a java program that can count how many times the word
		// book is appeared in a string.
		String sentence = "I like book, I read book";
		int count = 0;
		while (sentence.contains("book")) {
			count++;
			sentence = sentence.replaceFirst("book", "");
		}
		
		System.out.println(count);
		
		
		while(true) {
			System.out.println("Hello");
			break;
		}
		
		
		int i = 0;
		
		while(true) {
			
			i++;
			System.out.println("Hello: " + i);
			if (i == 5)
				break;
			
		}
		
		
		for (int z = 1; z <= 100; z++) {
			if (z %2 == 0)
				System.out.print(z + " ");
		}
		System.out.println();
		
		int z = 1;
		while (z <= 100) {
			if (z %2 == 0)
				System.out.print(z + " ");
			z++;	
		}
		
		
		//Using scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Starting number:");
		int start = scan.nextInt();
		
		System.out.println("Ending number:");
		int stop = scan.nextInt();
		
		for (int i = start; i <= stop; i++) {
			if (i %2 == 0)
				System.out.print(i + " ");
			
		}
		*/
		
	
		//Using scanner 2 - with while
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Starting number:");
		int start = scan.nextInt();
				
		System.out.println("Ending number:");
		int stop = scan.nextInt();
		
		while (start <= stop) {
			if (start %2 == 0)
				System.out.print(start + " ");
			start++;
		}
		
	}

}
