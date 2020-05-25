package day46_SuperKeyword;

/**
All the rules of the constructor:

Constructor: special method. belongs to the object.    
	1. Every class MUST have constructor. 
    (if there isn't any, compiler will give no-arg constructor by default)
                 
    2. Constructor method cannot have return-types or specifiers
       	return-types: primitives, wrapper class, objects, void...
        specifiers: final, static, abstract
                            
    3. Constructor's name MUST be same with the ClassName
                 
    4. Constructor' execution depends on the creation of the object
                 
    5. Constructor can only be called in another constructor. 
       (methods or blocks cannot call constructor)
                 
    6. Constructor cannot be called by constructor-name, 
    	MUST be called with this or super keyword
        this(): calls the class' constructor
        super(): calls the super class' constructor
                                
    7. Constructor cannot call or contain itself
                 
    8. Constructor cannot call more than one constructor
                 
    9. Constructor call MUST be the first step
                 
    10. Class' object MUST be created with existing 
    	and visible constructor(s)
                 
    11. Super class' default constructor (no-arg) is called 
    	in sub class' constructor(any constructor) by default
    	 
    12. At least one of the super class' constructors 
    	MUST be called in sub class
    	
    13. Constructor can be overloaded.
 */

class B{
//invisible default constructor
	public B(int a) {
		System.out.println("super");
	}
}

public class DefaultConstructor extends B {
	//invisible default constructor
	
	//sub-class default constructor calls
	//super-class default constructor automatically
	
	public DefaultConstructor() {
		//super(); //called automatically
		super(10);
		System.out.println("Sub");
	}
	
	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
		B obj2 = new B(1);
	}
}
