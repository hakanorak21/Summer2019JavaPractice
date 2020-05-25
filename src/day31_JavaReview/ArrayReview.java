package day31_JavaReview;

import java.util.Arrays;

public class ArrayReview {
	
public static void main(String[] args) {
		
		int num = 10;
		
		//Declaration of array
		int[] arr = {10};
		
		// arr[1] = 20; // Array size is fixed
		// System.out.println(arr[1]);
		
		// Initializing the array's size:
		int[] arr2 = new int[2];
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		//System.out.println(arr2[2]); // Out of bounds
		
		String[] cars = new String[5];
		// {Tesla, Audi, Toyota, Jeep, Subaru}
		//cars = {"Tesla", "Audi", "Toyota", "Jeep", "Subaru"};
		cars[4] = "Subaru";
		cars[3] = "Jeep";
		cars[2] = "Toyota";
		cars[1] = "Audi";
		cars[0] = "Tesla";
		
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();
		
		cars = new String[10];
			//{Ford, Honda, BMW, Volvo, Volkswagen}
		cars[5] = "Ford";
		
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(cars));
		
		boolean[] bool = { 10 > 9, "Mikrays".equals("Seyfo")};
		System.out.println(bool); //Hash code
		System.out.println(Arrays.toString(bool));
		
		boolean b1 = bool[0];
		System.out.println(b1);
		
		boolean b2 = bool[1];
		System.out.println(b2);
		
		//boolean b3 = bool[2]; //Out of bounds
		
		// Arrays.sort(): sorts in ascending order
		double[] doubleArray = {1000, 900, 800, 700, 600};
		System.out.println(Arrays.toString(doubleArray));
		
		Arrays.sort(doubleArray);
		System.out.println(Arrays.toString(doubleArray));
		
		int[] numbers = {200, 300, 20, 7890, 40, -9, -100};
		Arrays.sort(numbers);
		
		int[] descending = new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			descending[i] = numbers[numbers.length-1-i];
		}
		System.out.println(Arrays.toString(descending));
		
		//Muhtar's way: Just printing without creating a new array
		for (int i = numbers.length-1; i >= 0; i--) {
			System.out.print(numbers[i] + ", ");
		}
		
		//In order to remove the last comma
		String result = "";
		for (int i = numbers.length-1; i >= 0; i--) {
			result += numbers[i] + ", ";
		}
		System.out.println();
		
		result = result.trim();
		result = result.substring(0, result.lastIndexOf(","));
		System.out.println(result);
		
		result = result.substring(0, result.length());
		System.out.println(result);
		
	}

}
