package Replits;

import java.util.Arrays;

public class Replit_Arrays_CopyCertainValues {

	public static void main(String[] args) {
		System.out.println("-----EXAMPLE RUN ---------");
		String[] numbers = {"zero", "one", "two","three","four"};
		System.out.println(Arrays.toString(getWithE(numbers)));

	}

	public static String[] getWithE(String[] arr) {

		//TODO : YOUR CODE GOES HERE ----------------------
		int count = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i].contains("e"))
				count++;
		}
		
		String[] fewValues = new String[count];
		int j = 0;
		for (int i = 0; i < arr.length; i++){
			
			if (arr[i].contains("e")) {
				fewValues[j] = arr[i];
				j++;
			}
		}
		//YOUR CODE ENDS HERE -----------------------

		return fewValues;
	}

}
