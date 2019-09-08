package day15_Scanner_String_classes;

public class Quiz {
	
	public static void main(String[] args) {
		
		
		boolean opt = 12_345.1 > 123_45.0;	
		
		if (12_345.1 > 123_45.0)
			System.out.println("True");
		else
			System.out.println("False");
		
		float f1 = 12_456;
		float f2 = f1 + 1024;
		System.out.println(f2);
		
		short z = 10;
		
		switch (z) {
		case 10: System.out.println("Monday");
		case 11: System.out.println("Tuesday");
		//case 12: System.out.println("Wednesday");
		default: System.out.println("Friday");
		}
		
	}

}
