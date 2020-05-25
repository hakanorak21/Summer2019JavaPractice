package day53_InterfaceContinue;

/**
Abstract class VS Interface:
	Both can have abstract methods, used for achieving abstraction.
	Objects cannot be created from both.
	Both of them cannot be final.
	
	  Abstract class: Meant to be extended (extends keyword)
	  		Methods: Abstract and non-abstract 
	  		Variables: Any
	  		Blocks: Both instance and static
	  		Sub-class: Can extend only one abstract class 
	  
	  Interface: Meant to be implemented (implements keyword)
	  		Methods: Abstract, static, and default
	  		Variables: public final static by default
	  		Blocks: None
	  		Sub-class: Can implement multiple interfaces	  		
 */
public interface Interface_VS_AbstractClass {
	
	//Access-modifier className(){ } //No non-abstract methods
	//public Interface_VS_AbstractClass() { } //No constructor
	
	public abstract void method1();
	public abstract int method2();
	
	void method3(); //public abstract by default
	void method4();
	
	//default method
	public default void mm() {
		//predicate
	}
	
	//protected abstract void method5();
	
	
	int a = 10; // Same as public final static int a;
	static int num = 300; //this is final, too.
	//static {  } //No static block
	
	public static void main(String[] args) {
		System.out.println(a); //static only accepts static
		System.out.println(num);
		
		System.out.println(Interface_VS_AbstractClass.a);
		
	}

}

class Test implements Interface_VS_AbstractClass{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}
	
}
