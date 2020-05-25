package day27_CustomMethods;

import java.util.Arrays;

public class WarmUp {
	
	//Printing even numbers from 1 to 100
	
	public static void main(String[] args) {
		
		
		int[] numbers = new int[100];
		
		for (int i = 1; i <= 100; i++) {
	        numbers[i-1]= i;
	        if (i % 2 == 0)
	            System.out.print(numbers[i-1] + " ");
	    }
		
		System.out.println();
		
		for (int i = 0; i < 100; i++) {
	        numbers[i]= i + 1;
	        if ((i + 1) % 2 == 0)
	            System.out.print(numbers[i] + " ");
	    }
		
		System.out.println();
		
		
		int i = 1;
		for (int each: numbers) {
			each = i;
			if (each % 2 == 0)
				System.out.print(each + " ");
			i++;
		}
		
		System.out.println();
		
		
		//With continue
		for(int j = 0; j < 100; j++) {
            numbers[j] = j+1;
		}
		
		for (int each: numbers) {
			
			if (each % 2 == 1)
				continue;
			System.out.print(each + " ");
			
		}
		
	}

}
