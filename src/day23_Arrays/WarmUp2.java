package day23_Arrays;

import java.util.Scanner;

public class WarmUp2 {
	
	public static void main(String[] args) {
		
		/*
		//My way
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = keyboard.nextLine();
		
		int i = 0;
		while (i < word.length()) {
			
			if (word.substring(i+1).contains(word.substring(i, i+1))) 
				word = word.replace(word.substring(i, i+1), "");
			else
				i++;
		}
		System.out.println(word);
		*/
		
		//Muhtar's way
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word:");
		String str = keyboard.nextLine();
		String unique = "";
		
		for (int j = 0; j < str.length(); j++) {
			
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
                
				if(str.substring(i, i+1).equals(str.substring(j, j+1))) {
                    count++;
                }
                
            }               
            if(count == 1) {
                unique += str.substring(j, j+1);
            }
                
		}
		
		System.out.println("Unique characters are: "+unique);
		
	}

}
