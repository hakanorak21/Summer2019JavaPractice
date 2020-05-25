package day53_InterfaceContinue;

/**
Extends vs Implements keyword:

		extends keyword: a class can be extended by multiple classes
						 a class can extend only one class
						 
						 class extends class
						 interface extends interface
						 
		implements keyword: used only for interface to be implemented
							to the class
							can implement as many interfaces as we want
							class implements interface
							
		We can use extends and implements keywords at the same time.
		(first extends, then implements) 

 */

interface B{
	void method3(); //default, protected, or public
	
}

public interface extends_VS_implements extends B {
				// sub type					// super type
	
	void method1();
	void method2();
	//void method3(); //inherited
	
	//public void method3() { } //Cannot be overridden in interface
								//Interface cannot have instance methods

}

class A implements extends_VS_implements{

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
			
}

class C extends A implements B, extends_VS_implements{
	
	//Abstract methods already overridden in class A
	
}
