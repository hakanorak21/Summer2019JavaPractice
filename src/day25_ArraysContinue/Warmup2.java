package day25_ArraysContinue;

public class Warmup2 {
	
	// Printing unique values from String array
	
	public static void main(String[] args) {
		
		String [] array = {"A", "A", "B", "C", "C"};
		
		for (int j = 0; j < array.length; j++) {
			
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i].equals(array[j]))
				count++;
			}
		
			if (count == 1)
			System.out.print(array[j] + " ");
		
		}
		
	}

}
