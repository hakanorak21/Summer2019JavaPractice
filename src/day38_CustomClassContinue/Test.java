package day38_CustomClassContinue;

public class Test {
	
	//this(): calls constructors
	
	public Test() {
		System.out.print("A ");
		//this(10);
	}
	
	public Test(int a) {
		this(2.5);
		System.out.print("B ");
	}
	
	
	public Test(double c) {
		this();
		System.out.print("C ");
	}
	
	/*
	public Test(String str) {
		this();
		//this();
		System.out.println(str);
	}
	*/
	
	public static void main(String[] args) {
		
		Test obj = new Test(100);
		
	}
	
}
