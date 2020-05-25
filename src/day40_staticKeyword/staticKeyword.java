package day40_staticKeyword;

import java.util.Scanner;

public class staticKeyword {
	
	/**
	 Static: We can access the members through the class name
	 		members (variable or method)
	 
	 Static members belong to the class, also called class members.
	 	
	 What can be static in Java:
	 	1. Static variable
	 	2. Static method
	 	3. Static initializer block - to be learned soon
	 	4. Inner class (nested class) - will be learned much later
	 	
	 Instance variables: 	Created in the class outside any method.
	 						Belongs to the object.
	 						Each object has its own copies.
	 						
	 Local variables:	Declared within methods or blocks.
	 					Accessible only within the method.
	 					
	 Static variables:	Also called class variables.
	 					Shared by class and all objects of the class.
	 					One copy!
	 					
	 Static methods: 	Can be called through the class name.
	 					1. Only accepts class members (static)
	 					2. Non-static can only be called through the objects
	 					in the static method
	 					(A static method can call only static instance variables.
	  					Otherwise, we have to create an object in order to
	  					reach non-static instance variable).
	  					
	  Instance vs. Static variable:
	  	Instance belongs to object (fields)
	  	Static belongs to class (class variable)
	  	
	  	Instance: many copies (per object)
	  	Static: one copy (class and objects share)
	  	
	  Summary:
	  	1. Static is shared by class and all other objects
	  	2. There can only be one copy for the static variable
	  	3. Each object has its own copy of instance variables
	  	4. Static members can be called through the class name
        5. Static methods only accepts static members (important)
        6. In order to call non-static in a static method, 
        	we MUST call it through the object				
	 */
	
	int a; //Instance variable
	static int b = 1000; // Static variable
	static Scanner scan = new Scanner(System.in); // ???
	
	public static void main(String[] args) {
		
		staticKeyword obj1 = new staticKeyword();
		obj1.a = 100; // instance variable
		
		staticKeyword obj2 = new staticKeyword();
		obj2.a = 200; // instance variable (different copy)
		
		System.out.println(obj1.a); // 100
		System.out.println(obj2.a); // 200
		
		double num = 100.5; // local variable
		
		System.out.println(staticKeyword.b); // static variable
		System.out.println(obj1.b); // same value
		System.out.println(obj2.b); // same value
		
		System.out.println("========================");

		staticKeyword obj3 = new staticKeyword();
		obj3.a = 300; // instance variable (or fields)
		System.out.println(obj3.a); // 300
		
		staticKeyword obj4 = new staticKeyword();
		System.out.println(obj4.a); // default value
		
		obj3.b = 400; // static variable
		System.out.println(obj3.b); // same
		System.out.println(obj4.b); // same
		System.out.println(obj2.b); // same
		System.out.println(obj1.b); // same
		System.out.println(staticKeyword.b); // can be accessed through class
		
		staticKeyword.printHello();
	}
	
	// static method
	public static void printHello() {
		scan.nextInt(); // enter an int
		System.out.println("Hello Cybertek"); // displays "Hello Cybertek"
		
	}

}
