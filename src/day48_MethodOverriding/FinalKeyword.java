package day48_MethodOverriding;

class Credentials{
	
	private final String username = "cybertek";
	private final String password = "Batch12";
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	public void setUsername (String username) {
		//this.username = username; //constant variable cannot be re-assigned
	}
	
}

class Holly{
	
	public final void printName() {
		System.out.println("Erhan");
	}
	
}

public class FinalKeyword extends Holly{
	
	/**
	 Final keyword: Constant, cannot be modified
	 				Used with variables, methods, and classes
	 				
	 	Constant variable:
	 				We cannot re-assign it.
	 				Instance and static variables MUST be assigned.
	 				Local variables need to be assigned before use.
	 				If the private data is final, we can only generate 
	 				getters; cannot have setters.
	 				
	 	Final method:
	 	 			The implementation of the method cannot be changed.
	 	 			Cannot be overridden.
	 	 			Can be overloaded.
	 	 			Main method can be final.
	 	 			
	 	 Immutable class:
	 	 			Final class cannot be super class, but can be sub class.
	 	 			Any class, except abstract, can be final.			
	 */
	
	int age;
	
	/*
	//final method cannot be overridden
	public void printName() {
		System.out.println("Madina");
	}
	*/
	
	public static void main(String[] args) {
		
		final String SSN = "123456";
		//SSN = "654321"; //Cannot be reassigned
		final String DOB = "010176";
		System.out.println(SSN);
		System.out.println(DOB);
		
		FinalKeyword obj = new FinalKeyword();
		System.out.println(obj.age); //0 because it is not assigned
		
		
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	//Overloaded
	public static double add(double a, double b) {
		return a + b;
	}

}
