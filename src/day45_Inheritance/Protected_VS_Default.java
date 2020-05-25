package day45_Inheritance;

/**
 Default vs. Protected:
 	Both not visible outside the package
 	However, protected is inheritable outside package.
 */

public class Protected_VS_Default {
	
	public static void main(String[] args) {
		
	}
	
	protected String name;
	String ID;
	
	protected void printHello() {
		System.out.println("Hello");
	}
	
	void printHola() {
		System.out.println("Hola");
	}
	
}

class Cybertek{
	
	public static void main(String[] args) {
		
		Protected_VS_Default obj = new Protected_VS_Default();
		obj.name = "Nurzat";
		obj.ID = "007";
		obj.printHello();
		System.out.println(obj.name);
		obj.printHola();
		System.out.println(obj.ID);
	}
}
