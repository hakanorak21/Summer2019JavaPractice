package day40_staticKeyword;

public class staticPractice {
	
	static long num1; // static variable
		   long num2; // instance variable
	
	public static void main(String[] args) {
		
		staticPractice.method1();
		
		staticPractice obj = new staticPractice();
		obj.method2();
		obj.method1();
		
		num1 = 10; //num1 and main method are in the same class
		//no need for an object
		
		//num2 = 20 // Compile error: Instance variables belong to the object
		//need an object to call num2
		obj.num2 = 20;
		
		staticPractice obj2 = new staticPractice();
		obj2.num2 = 30; // instance variable
		
		System.out.println(obj.num2); // 20 (object own copy)
		System.out.println(obj2.num2); // 30 (object own copy)
		
	}
	
	// Belongs to the class
	// No need to create an object of the class
	public static void method1() {
		System.out.println("A");
		
	}
	
	// Belongs to the object
	public void method2() {
		System.out.println("B");
	}

}
