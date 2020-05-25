package day19_ForLoop;

public class Tasks {
	
	public static void main(String[] args) {
		
		
		// Task 1. Write a program that displays each even/odd number 
		// in popup between 1 and 32
		
		System.out.print("Even numbers: ");
		for (int i = 1; i <= 32; i++) {

			if (i %2 == 0)
				System.out.print(i + " ");			
		}
		
		System.out.print("\nOdd numbers: ");
		for (int i = 1; i <= 32; i++) {

			if (i %2 != 0)
				System.out.print(i + " ");			
		}
		
		// Interview question: Write a string in reverse order
		System.out.println();
		String str = "Cybertek";
		String reversed = "";
		for (int i = str.length() -1; i >= 0; i--)
			reversed += str.charAt(i);

		System.out.println(reversed);
		
	}
	
	

}
