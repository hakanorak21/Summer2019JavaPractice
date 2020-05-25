package day22_NestedLoop;

import java.util.Scanner;

public class FrequencyOfCharacters {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = keyboard.nextLine();
		String result_word = "";
		String result = "";
		int frequency = 0;
		
		while(word.length()!=0) {
			
			result_word = word.replace(word.substring(0,1), "");

			frequency = word.length() - result_word.length();
			
			result += word.substring(0,1) + frequency ;
			
			word = result_word;
		}
			
		System.out.println(result);
		
	}

}
