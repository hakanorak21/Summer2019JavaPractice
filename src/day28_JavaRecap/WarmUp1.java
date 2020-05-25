package day28_JavaRecap;

import java.util.Arrays;

public class WarmUp1 {
	
public static void main(String[] args) {
		
		kmTomiles(1000);
		gallonsToliters(3);
		int[] arr = {0, -1, 1000, 2000, 5000};
		descendArray(arr);
		
	}
	
	public static void kmTomiles(double km) {
		
		System.out.println(km + " kilometers is equal to " + km * 0.621 + " miles.");
		
	}
	
	public static void gallonsToliters(double gallons) {
		
		System.out.println(gallons + " gallons is equal to " + gallons*3.78 + " liters.");
		
	}
	
	public static void descendArray (int[] array) {
		
		Arrays.sort(array);
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]+ " ");
		}
		
	}

}
