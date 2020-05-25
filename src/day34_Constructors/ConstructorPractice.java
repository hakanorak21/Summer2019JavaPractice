package day34_Constructors;

public class ConstructorPractice {
	
	// We have default constructor when no other constructor is created
	
	public ConstructorPractice(int a) {
		
		System.out.println("I'm a constructor with argument " + a);
		
	}
	
	public static void main(String[] args) {
		
		//ConstructorPractice obj = new ConstructorPractice();
			//Compile error after creating the above constructor
		
		//ConstructorPractice obj2 = new ConstructorPractice("Hello");
			//Compile error because we don't have a constructor with parameter 
		
		method1();
		
		//ConstructorPractice(1); //First, need to create an object
		ConstructorPractice obj3 = new ConstructorPractice(1);
		
		method2();
		
	}
	
	public static void method1() {
		System.out.println("Regular method");
	}
	
	public static void method2() {
		ConstructorPractice obj4 = new ConstructorPractice(10);
	}
	
	

}
