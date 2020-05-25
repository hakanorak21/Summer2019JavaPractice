package day22_NestedLoop;

import java.util.Scanner;

public class RemoveDuplicates {
	
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String str = keyboard.nextLine();
		String unique = "";
		
		/*
		for (int i = 0; i < str.length(); i++) {
			if (!unique.contains(str.substring(i, i+1)))
				unique += str.charAt(i);
		}
		*/
		
		int i = 0;
		while(i < str.length()) {
			if (!unique.contains(str.substring(i, i+1)))
				unique += str.charAt(i);
			i++;	
		}
		
		System.out.println(unique);
		
	}

}
