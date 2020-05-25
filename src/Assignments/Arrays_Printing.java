package Assignments;

public class Arrays_Printing {
	
	public static void main(String[] args) {
		
		String[] arr = {"apple", "banana", "orange", "grape", "avocado"};
		
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i].substring(0, 3));
	}

}
