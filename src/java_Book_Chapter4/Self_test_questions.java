package java_Book_Chapter4;

import java.util.Scanner;

public class Self_test_questions {
	
	enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES};
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		/**
		//Question 6
		System.out.println("Enter the population of the city: ");
		int population = keyboard.nextInt();

		while (population <= 0) {
			System.out.println("Enter a nonnegative number: ");
			population = keyboard.nextInt();
		}
		
		System.out.println("Population is " + population);
		
		
		//Question 10
		int n;
		for (n =4; n > 0; n--);
			System.out.println(n);
		
		
		//Question 12
		for (int i = 2; i <= 10; i += 2)
			System.out.println(i);
		
		//Or
		for (int i = 1; i <= 5; i++)
			System.out.println(i*2);
		
		
		//Question 13
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j < i; j++)
				System.out.println(j);
		}
		*/
		
		//For-each loop
		for (Suit nextSuit: Suit.values())
			System.out.print(nextSuit + " ");
		
			
	}

}
