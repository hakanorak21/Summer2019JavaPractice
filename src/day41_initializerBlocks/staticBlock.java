package day41_initializerBlocks;

public class staticBlock {
	
	/**
	Static members:	1. Static variables
	 				2. Static methods
	 				3. Static initializer blocks
	 				4. Inner class (nested class)
	 				
	Static variable: 	Declared in the class, outside any method, 
						WITH static keyword, class variables, 
						shared by class and all objects of the class
						
	Static method: Called using class name, belongs to the class
	 	
	Static initializer block: Used for initializing static variables
	
		static{
			statements;
		}
		
		Executed as soon as a class is created.
		Execution does not depend on the object.
		We can have multiple static blocks.
		
	In order to call non-static in a static feature, we need to call it
	through object.
	
	Instance initializer block: Used for initializing instance variable
								belongs to the object
	
		{
			statements;
		}
		
		Execution depends on the creation of object.
		Instance block runs before constructor.
		
	Instance variables:
			Declared in the class, outside methods
			Each object has its own copy of instance variables
			
	Static block vs. Instance block vs. Constructor
	 
	 */
	
	public staticBlock() {
		System.out.println("Constructor");
	}
	
	//Class
	static {
		System.out.println("Static block");
	}
	
	//Class
	static {
		System.out.println("Static block2");
	}
	
	//Object: executes each time we create an object
	{
		System.out.println("Instance block");
	}
	
	public static void main(String[] args) {
		
		staticBlock obj1 = new staticBlock();
		System.out.println("===============");
		
		staticBlock obj2 = new staticBlock();
		System.out.println("===============");
		
		System.out.println("Main method");
	}

}
