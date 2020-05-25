package day26_ForEach;

public class ForEach {
	
	/**
	For each loop: 
	1. Used to access the value in a collection of values.
	2. Already been iterated.
	3. Never becomes an infinite loop.
	
	Syntax:
	for(DataType VariableName: VariableNameOfCollection){
				(usually, each)
		Statement;
	}
	*/
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		//Old way
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("========================");
		
		//For each
		for (int each: arr) {
			System.out.print(each + " ");
		}
		System.out.println();
		System.out.println("========================");
		
		
		String[] str1 = {"A", "B", "C"};
		for(String each: str1) {
			System.out.print(each + " ");
		}
			
	}

}
