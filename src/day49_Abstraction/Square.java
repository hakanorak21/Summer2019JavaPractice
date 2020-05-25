package day49_Abstraction;

public class Square extends Shape{
	
	double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public void area() { //Can be protected or public
		double area = side * side;
		System.out.print("Area of the square is ");
		System.out.println(area);
	}
	
	@Override
	public void perimeter() {
		double perimeter = 4 * side;
		System.out.print("Perimeter of the square is ");
		System.out.println(perimeter);
	}

}
