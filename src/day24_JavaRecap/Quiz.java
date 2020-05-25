package day24_JavaRecap;

public class Quiz {
	
	// Kahoot
	
	public static void main(String[] args) {
		
		/**
		// Question 1
		boolean A = true, B = false;
		
		// Question 2
		int i = 5;
		do {
			i--;
			System.out.println(i + "");
			++i;
		}while(i>0);
		
		
		// Question 3
		int x;
		int y = 5;
		for (x = 0; x < y; x++) { // x = 3, 6
			System.out.println((x += 2) + " ");
			//						2
			//						5						
		}
		
		// Question 4
		int[] arr = {1, 2, 3, 4, 5};
		
		
		int x = 10; 
		for (int i = 0; i <= 5; i++) { // j: 0 1 2 3 4 5
			x += i;
		}
		
		System.out.println(x);
		
		// Question 6
		// Compilation error for the statement after the break in the for loop 
		
		// Question 9
		String str = "Java";
		String str2 = new String(str);
		System.out.println(str == str2); // false
		System.out.println(str.contentEquals(str2)); // true
		*/
		
		// Question 10
		String str = "   ";
		str.trim(); //String is immutable!!!
		
		int n1 = 0;
		System.out.println(str.isEmpty()); // false
		System.out.println(str.isBlank()); // true
		
		
	}

}
