package java_Book_Chapter6;

public class CircleCalculator {
	
	//private static double radius; //No need
	
	public static double getArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	public static double getCircumference(double radius) {
		return 2 * Math.PI * radius;
	}
	
	public static void main(String[] args) {
		
		double radius = 1.5;
		System.out.println("Area = " + getArea(radius));
		System.out.println("Circumference = " + getCircumference(radius));
		
		Integer n = new Integer(42); //Wrapper class
		Integer n2 = 42; //Autoboxing
		int n3 = n2.intValue(); //Unboxing
		int n4 = n2; //Implicit unboxing
		
		Boolean a = true;
		System.out.println(a);
		System.out.println(a.compareTo(true));
		
	}
	
}
