package day21_WhileLoops;

/*
 do-while: 
 do {
 		Statements;
 	} while (condition);
 Difference from while: Compiler executes the block first, and then
 checks the condition, if the condition is true, it keeps execution, 
 otherwise stops
 */

public class do_While {
	
	public static void main(String[] args) {
		
		
		boolean A = false;
		
		do {
			System.out.println("Hello");
		}
		while(A); 
		
		
		int x = 1;
		
		do {
			if (x %2 == 0) {
				System.out.print(x + " ");
			}
			x++;
		} while (x <= 100);
		System.out.println();
		
		
		do {
			System.out.println("Hello World");
			break;
		} while(true);
		
	}

}
