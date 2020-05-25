package Day33_ArrayList;

public class MethodCalls {
	
	//Methods can call each other
	
	public static void main(String[] args) {
		method3();
		System.out.println(max(1,2,3));
		maximum(1,99,50);
		print(1,2,3);
		System.out.println(max(10,2,300, 50));	
	}
	
	public static void method1() {
		//method2(); method cannot call itself
		System.out.println("A");
	}
	
	public static void method2() {
		method1();
		System.out.println("B");
	}
	
	public static void method3() {
		method2();
		System.out.println("C");
	}
	
	public static int max(int a, int b) {
		return (a > b)? a: b;
	}
	
	
	public static int max(int a, int b, int c) {
		return (max(a, b) > c)? max(a, b): c;
	}
	
	public static int max(int a, int b, int c, int d) {
		//return (max(a, b, c) > d)? max(a, b, c): d;
		return max(max(a,b),max(c,d));
	}
	
	
	public static void maximum(int a, int b, int c) {
		System.out.println(max(a,b,c));
		
	}
	
	//Not recommended
	public static String print(int a, int b, int c) {
		maximum(a,b,c);
		return "";
	}
	
	
}
