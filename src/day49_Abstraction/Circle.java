package day49_Abstraction;

public class Circle extends Shape{
	
	double radius = 2;
	final double PI = 3.14;
	
	public Circle (double radius) {
		this.radius = radius;
	}
	
	@Override
	public void area() {
		double area = PI * radius * radius;
		System.out.print("Area of the circle is ");
		System.out.println(area);
	}
	
	@Override
	public void perimeter() {
		double perimeter = 2 * PI * radius;
		System.out.print("Perimeter of the circle is ");
		System.out.println(perimeter);
	}

}
