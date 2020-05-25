package day40_staticKeyword;

public class staticVariables {
	
	int num1;
	static String name;
	
	public static void main(String[] args) {
		
		//System.out.println(num1); // We cannot call a non-static instance
		 							// variable in a static method.
		staticVariables objectA = new staticVariables();
		System.out.println(objectA.num1);
		
		staticVariables obj1 = new staticVariables();
			obj1.name = "Omer"; // static variable
			System.out.println(obj1.name); // Omer	
		staticVariables obj2 = new staticVariables();
		System.out.println(obj2.name); // Omer (static variable)
		obj2.name = "Khurshed"; // one copy!
		System.out.println(obj2.name); // Khurshed
		System.out.println(obj1.name); // Khurshed
		
		staticKeyword.printHello(); //called static method from another class
		
	}

}