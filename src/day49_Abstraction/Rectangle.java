package day49_Abstraction;

public class Rectangle extends Shape{
	
	double width;
	double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	public void area() { //Can be protected or public
		double area = width * length; 
		System.out.print("Area of the rectangle is ");
		System.out.println(area);
	}
	
	@Override
	public void perimeter() {
		double perimeter = 2 * (width + length); 
		System.out.print("Perimeter of the rectangle is ");
		System.out.println(perimeter);
	}

}
