package day24_JavaRecap;

public class WarmUp3 {
	
	// Write a program that sorts an array.
	
	public static void main(String[] args) {
		
		int[] array = {70, 500, 150, 90, 40, 300};
		
		int temp;
		   for (int i = 1; i < array.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (array[j] < array [j - 1]) {
		      temp = array[j];
		      array[j] = array[j - 1];
		      array[j - 1] = temp;
		     }
		    }
		   }
		   for (int i = 0; i < array.length; i++) {
		     System.out.print(array[i] + " ");
		   }
		
	}

}
