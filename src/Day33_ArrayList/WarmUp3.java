package Day33_ArrayList;

import java.util.ArrayList;

public class WarmUp3 {
	
	/**
	1. Write a return method that accepts an Integer ArrayList and 
	returns the maximum number from the ArrayList
	        DO NOT use sort method of the collections class
	        
	2. use the method 1 to Write a return method that accepts 
	an integer ArrayList and returns the second maximum number
	        DO NOT use sort method of the collections class
	        
	3. Write a return method that accespts an Integer ArrayList and returns the minimum number 
	        DO NOT use sort method of the collections class
	        
	4. use the method 1 to write a return method that accepts an integer ArrayList and returns the second minimum number
	        DO NOT use sort method of the collections class
	*/
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-9871);
        numbers.add(9);
        numbers.add(6);
        numbers.add(8542);
        numbers.add(22);
        numbers.add(19);
        
        System.out.println(Max(numbers));
        System.out.println(SecondMax(numbers));
		
	}
	
	public static int Max(ArrayList<Integer> numbers) {
		
		Integer max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.size(); i++) {
			if(numbers.get(i) > max)
				max = numbers.get(i);
		}
		
		return max;
	}
	
	public static int SecondMax(ArrayList<Integer> numbers) {
		
		numbers.remove(numbers.indexOf(Max(numbers)));
		return Max(numbers);
	}
	

}
