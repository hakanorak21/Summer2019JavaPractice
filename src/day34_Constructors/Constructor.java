package day34_Constructors;

public class Constructor {
	
	/**
	 Constructor: very special method
	 
	 3 types of methods:
	 	1. Void
	 	2. Return
	 	3. Constructor
	 	
	 Regular methods:
	 	access-modifier specifier return-type methodName(parameter)
	 	
	 Constructor declaration:
	 	access-modifier className(parameter)
	 	
	 Every class MUST have a constructor, if we don't give any, then default
	 	default: without parameter
	 	
	 Constructor calls:
	 	Only a constructor can call another constructor
	 	
	 Creating an object from a class:
	 	className refName = new existingConstructor
	 */
	
	public Constructor(){
		
		System.out.println("Hello World");
		System.out.println("Default constructor");
		
	}
	
	public Constructor(String str){
		
		System.out.println("Not Default constructor anymore");
		
	}
	
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor();
		System.out.println();
		Constructor obj1 = new Constructor("");
		
	}

}
