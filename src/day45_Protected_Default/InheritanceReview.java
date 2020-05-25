package day45_Protected_Default;


class A{
	
	public static void methodA() {
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		
		methodA();
	}
}


class B extends A{
	
	public static void methodB() {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		
		methodA();
		methodB();
	}
	
}


public class InheritanceReview extends B{
	
	public static void methodC() {
		System.out.println("C");
	}
	
	public static void main(String[] args) {
		
		methodA();
		methodB();
		methodC();
		
	}

}
