package day34_Constructors;

public class AddingLetters {
	
	public static void main(String[] args) {
		
		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				if ((2*a + b)%10 == b && (a+b+1)%10 == a)
					System.out.println("a= " + a + " b= " + b);
			}
		}
		
		
		
		
	}

}
