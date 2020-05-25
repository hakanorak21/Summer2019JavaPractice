package day26_ForEach;

public class Continue {
	
	/**
	 Break: Exits the loop
	 Continue: Skips the current iteration
	 */
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			if (i == 2)
				continue;
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] %2 == 0)
				continue;
			System.out.print(numbers[i] + " ");
		}
		System.out.println("====================");
		String sandwich = "breadjambread";
		System.out.println(sandwich.indexOf("bread"));
		System.out.println(sandwich.lastIndexOf("bread"));
		
		
	}

}
