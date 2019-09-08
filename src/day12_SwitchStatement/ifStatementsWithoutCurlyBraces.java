package day12_SwitchStatement;

public class ifStatementsWithoutCurlyBraces {
	
	public static void main(String[] args) {
		
		if (true) 
			System.out.println("Hello");
		else
			System.out.println(" World");
		
		int grade = 80;
		if (grade >= 0 && grade <= 100)
		if (grade >= 90) System.out.println("A");
		else if (grade >= 80) System.out.println("B");
		else if (grade >= 70) System.out.println("C");
		else System.out.println();
		else System.out.println("Invalid");
		
		

	}

}
