package day12_SwitchStatement;

public class Warmup {
	
	public static void main(String[] args) {
		
		int n1 = 2;
		int n2 = 2;
		int n3 = 3;
		
		if ((n1 == n2) && (n1 != n3))
				System.out.println("n1 and n2 are equal.");
		else if ((n1 == n3) && (n1 != n2))
			System.out.println("n1 and n3 are equal.");
		else if ((n2 == n3) && (n2 != n1))
			System.out.println("n2 and n3 are equal.");
		else if ((n1 == n2) && (n2 == n3))
			System.out.println("All are equal.");
		else
			System.out.println("None of them are equal.");
		
		int A = 10, B = 20, C = 30;
		
			
	}

}
