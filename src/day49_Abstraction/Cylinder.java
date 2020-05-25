package day49_Abstraction;

public class Cylinder extends Shape{
	
	double radius;
	double height;
	final double PI = 3.14;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public void area() {
		double area = 2 * PI * radius * radius + 
				height * 2 * PI * radius; 
		System.out.print("Area of the cylinder is ");
		System.out.println(area);	
	}
	
	@Override
	public void perimeter() {
		double perimeter = 2 * (2 * PI * radius + height); 
		System.out.print("Perimeter of the cylinder is ");
		System.out.println(perimeter);	
	}
	
	@Override
	public void volume() {
		double volume = PI * radius * radius * height; 
		System.out.print("Volume of the cylinder is ");
		System.out.println(volume);	 
	}	

}
