package day51_Abstraction;

/**
 Abstract method: 	Can only be declared in abstract class and interface.
 					Does not have body (hiding the implementation details).
 					Meant to be overridden in sub class (non-abstract class).
 					Cannot be final, private, or static.
 
 Abstract class vs. Non-abstract class:
 
 		Abstract class: Can have abstract and non-abstract methods.
 						Meant to be inherited (extended).
 						Cannot be final.
 						Cannot create object (object is concrete, 
 						abstraction is not concrete).
 						
 		Non-abstract class:	Cannot have abstract methods.
 							Can create object.
 							Can be final (immutable).
 							
 Final keyword: Applicable only to variables, methods, and classes.
 
 	Final variable: constant
 	Final methods: 	cannot be overridden
 	Final class: 	immutable (cannot be super class)
 	
 */


abstract class Test{
	
	abstract void m();
	
	protected abstract void m (int a); //Any method can be overloaded.
	
}


public class Practice extends Test {
	
	@Override
	public void m() { //default, protected, or public (same or more visible)
		System.out.println("M&M");
	}
	
	@Override
	public void m(int a) { //protected or public
		System.out.println("M&M " + a);
	}
	
	final int num2 = 30;	//Final instance and static variable 
							//MUST be initialized when declared. 
	
	public static void main(String[] args) {
		
		final int num; //Constant
				  num = 10; //Must be assigned before usage.
		//num = 20; //Constant cannot be changed.
		System.out.println(num);
		
		Practice obj = new Practice();
		obj.m();
		obj.m(1);
		
	}

}
