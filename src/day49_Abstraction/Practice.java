package day49_Abstraction;

abstract class Shapes{
	
	public abstract void Area();
	
}

abstract class T extends Shapes{
	
}

//Concrete
class Triangle extends Shapes{
	
	double base;
	double height;
	
	@Override
	public void Area() {
		System.out.println("The area of triangle is: " + base*height/2);
		
	}
	
}
public class Practice {
	
	
	static {
		System.out.println("Static block");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main method");
	}
	
}
