package day29_ReturnMethods;

public class SystemExit {
	
	public static void main(String[] args) {
		
		System.out.println(number());
		method1();
		
	}
	
	public static int number() {
		
		if (8 > 9) {
			System.exit(0); //Exits all the Java execution
		}
		
		return 5;
	}
	
	public static void method1() {
		System.out.println("Hello World");
		System.exit(0);
	}

}
