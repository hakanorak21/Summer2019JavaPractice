package day25_ArraysContinue;

public class Warmup1 {
	
	/**
    1. Write a program that can print out the unique values from an int Array
       Ex: 
           if arr -> {1,1,2,3,3}
           output: 2
           if arr -> {1,2,2,3,4,4}
           output:  1  3
    */
	
public static void main(String[] args) {
		
		int[] array = {1,2,2,3,4,4};
		
		for (int j = 0; j < array.length; j++) {
		
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				if(array[i] == array[j]) 
					count++;
			}
		
			if (count == 1)
				System.out.print(array[j] + " ");
		}
		
	}

}
