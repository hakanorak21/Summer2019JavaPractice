package java_Book_Chapter3;

import java.util.Scanner;

public class Switch_Example 
{
	public static void main(String[] args) 
	{
		System.out.println("Which US state has only one syllable in its name?");
		Scanner keyboard = new Scanner(System.in);
		String answer = keyboard.next();
		switch (answer.toLowerCase()) 
		{
		case "maine":
			System.out.println("Correct!");
			break;
		default:
			System.out.println("Incorrect, the answer is Maine.");
			break;
			
		}
		
		
		
	}

}
