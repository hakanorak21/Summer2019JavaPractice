package day22_NestedLoop;

import java.util.Scanner;

public class UniqueCharacters {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String str = keyboard.nextLine();
		
		int i = 0;
		while(i < str.length()) { 
		
			if (str.substring(i+1).contains(str.substring(i, i+1)))
				str = str.replace(str.substring(i, i+1), "");
			else
				i++;
		}
		
		System.out.println(str);
		
	}

}