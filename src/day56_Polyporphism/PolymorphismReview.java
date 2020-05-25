package day56_Polyporphism;

/**
 IS-A relationship: inheritance
 
 Polymporphism: Occurs when a super class/interface is reference type and
 				object is created from child class
 				
 	A extends B
 	sub		  super
 	
 	B 			obj 	= new A()
 	ref-type	ref-name	object
 	
 1. Reference type decides what is accessible.
 2. Child class cannot be reference type for a parent class' object.
 3. If we make the abstract class as reference, object MUST be created
 from sub class (non-abstract)
 4. If we make the interface as reference, object MUST be created 
 from implementation class (non-abstract)
 
  IS-A: Inherited/implemented relationship between class
  		
  		Example:
  			Dog extends Animal
  			Dog is an animal
  		
  			Pitbull extends Dog
  			Pitbull is a dog. Also, pitbull is an animal.
  			
  			Bird extends Animal.
  			
  HAS-A: Object in another class.
  		
  		 Example:
  			class Car{
  				Engine obj = new Engine();
  			}
  			==> Car has a relationship with engine.
  		
  			class Zoo{
  				Lion obj = new Lion();
  				Tiger obj2 = new Tiger();
 			}
 			
 Method overriding:
 	1. Acess-modifier should be same or more visible.
 	2. Same return type, same name, and same parameters
 	3. @Override should be applicable
 	4. Only instance methods can be overridden.
 	5. Has to be overridden in sub class.
 	6. Overridden method cannot private, static, final 
 */
class A{
	
	protected void methodA() {
		System.out.println("method A");
	}
	
	public static void methodC() {
		System.out.println("method C from A class");
		
	}
	
}

class B extends A{
	
	public void methodB() {
		System.out.println("method B");
	}
	
	@Override
	public void methodA() {
		System.out.println("method A from B class");
	}
	
	public static void methodC() {
		System.out.println("method C from B class");
		
	} 
	
}

abstract class C{
	
}

class D extends C implements E{
	
}

interface E{
	
}

abstract class F implements E{
	
}

public class PolymorphismReview {

	public static void main(String[] args) {
		A obj = new A();
		A obj2 = new B();
		obj2.methodA();
		//obj2.methodB(); //methodB() doesn't exist in reference type.
		
		//B obj3 = new A(); //child class cannot be reference type 
							//for a parent class' object
		//C obj4 = new C(); //C is an abstract class
		
		C obj5 = new D();
		
		E obj6 = new D();
		
		//D obj7 = new E(); //Cannot create object from interface
		
		//E obj8 = new C(); //Cannot cretae object from abstract class
		
		A obj11 = new B(); //Can call only methodA()
		obj11.methodA(); //method A from B class
		obj11.methodC(); //method C from A class (because it is not overridden)
						 //reference type method is being executed.
		
	}
}

