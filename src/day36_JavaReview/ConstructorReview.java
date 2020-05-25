package day36_JavaReview;

public class ConstructorReview {
	
	/**
	 Constructor: Special method, creates object of a class
	 	1. Every class has a constructor
	 	2. If we don't create one, class creates a default constructor
	 	3. Constructor name MUST be the same as class name
	 	4. Constructor call MUST be the first step in a constructor
	 	5. one constructor can only call one constructor 
	 	(cannot call more than 1)
	 	6. Constructor cannot call itself
	 	7. Constructor cannot contain itself
	 	
	 	
	 Creating object:
	 	ClassName obj = new ExistingConstructor;
	 	
	 */
	
	public ConstructorReview() {
        
        System.out.println("default constructor");
    }
    
    public ConstructorReview(int a) {
        
        System.out.println("Constructor with argument int: " + a);
        
    }
    
   
    public static void main(String[] args) {
        
    	ConstructorReview obj = new ConstructorReview(); 
        
    	//ConstructorReview obj2 = new ConstructorReview("Batch 12"); 
                       // the constructor with arg of String does not exist
        
    	ConstructorReview obj2 = new ConstructorReview(10); 
        
    }
}
