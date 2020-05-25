package day49_Abstraction;

/**
WarmUp: 
    1. create a class called Shape
            Actions: Area(), perimeter(), capacity()
    2. create sub classes of Shape:
                        Circle
                        rectangle
                        square
                        cylinder
        and give the instance variables that are needed to calculate 
        the Area, Perimeter, and Volume of those shapes
    3. override super class' Area(), perimeter(), 
    capacity() methods to the sub classes

Formulas:
    Area of the circle:     3.14 * radius * radius
    Area of the rectangle:  width * length
    Area of the square:     side * side
    Area of the cylinder: (2 * 3.14 * radius * radius) + height(2*3.14*radius)
    
    Perimeter of circle:    3.14 * 2 * radius
    Perimeter of rectangle: (width + length) * 2
    Perimeter of Square: 4 * side
    
    volume of cylinder: 3.14 * radius * radius * height .  
 */

public class Shape {
	
	protected void area() { //Can be public, protected, or default
		System.out.println("Area is 0");
	}
	
	protected void perimeter() {
		System.out.println("Perimeter is 0");
	}
	
	protected void volume() {
		System.out.println("Volume is 0");
	}
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		rectangle.area();
		rectangle.perimeter();
		rectangle.volume(); // 0
		
		Square square = new Square(10);
		square.area();
		square.perimeter();
		
		Circle circle = new Circle(5);
		circle.area();
		circle.perimeter();
		
		Cylinder cylinder = new Cylinder(2, 5);
		cylinder.area();
		cylinder.perimeter();
		cylinder.volume();
			
	}
	
}
