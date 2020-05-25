package day30_WrapperClass_ArrayList;

import java.util.Scanner;

public class OfficeHour {
	
	public static void main(String[] args) {
		
		String word = "Java";
		System.out.println(word.length());
		
		System.out.println(word.isEmpty());
		System.out.println(word.isBlank());
		
		System.out.println(word.charAt(0));
		
		char firstChar = word.charAt(0);
		char ch = 'J';
		
		System.out.println(firstChar == ch);
		
		hi();
		
		sum(1,2);
		
		sum(100, 200);
		
		Hi(); //Doesn't print anything.
		System.out.println( Hi() );
		
		System.out.println(playGame(40));
		
		boolean playOrNot = playGame(25);
		System.out.println(playOrNot);
		
		Scanner input = new Scanner (System.in);
		System.out.println("How long does it take to play the game?");
		
		int answer = input.nextInt();
		
		System.out.println(playGame(answer));
		
		boolean yesOrNo = playGame(answer);
		System.out.println(yesOrNo);
		
	}
	
	public static void hi() {
		System.out.println("Hi, how are you?");
	}
	
	public static String Hi() {
		return "Hi, how are you?";
	}
	
	public static void sum(int a, int b) {
		System.out.println(a+ " plus " + b + " is equal to " + (a+b) + ".");
	}
	
	// playGame(): Provides length of the game.
	public static boolean playGame(int minutes) {
		if (minutes <= 30)
			return true;
		else
			return false;
		
	}	

}
