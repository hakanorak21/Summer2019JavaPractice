package day35_Constructors;

public class ConstructorMethod {
	
	/**
	Constructor: 
		1. Every class MUST have a constructor.
		2. If we don't create a constructor, class will create a default one.
		3. Execution depends on the creation of the object
		4. Constructor name MUST be the same as class name
		5. No return type
		6. No specifier
	
	Creating object from a class:
		ClassName objectName = new ExistingConstructor;
		
	Constructor Name: Should be the same as class name.
	
	Constructor: Access-modifier className ();
	
	Constructor call:
		1. Only a constructor can call another constructor
		2. We MUST use this() to call a constructor
		3. Constructor call has to be the first statement in the constructor
		4. Constructor can only call one constructor
		5. A constructor cannot call itself
		6. Constructor cannot contain itself
		
	*/
	
	public ConstructorMethod(int a) {
		
		System.out.println("Not default constructor " + 100);
		
	}
	
	public ConstructorMethod(boolean a) {
		
		this(100);
		//this(true); //Constructor cannor call itself
		//this(50); //A constructor can call a constructor only once
					//Even if it is overloaded
		System.out.println("Constructor with argument of: " + a);
		
	}
	
	public static void main(String[] args) {
		
		ConstructorMethod obj2 = new ConstructorMethod(100);
		ConstructorMethod obj3 = new ConstructorMethod(10>9);
		
		
		method1();
		
		
	}
	
	public static void method1() {
		
	}
}
