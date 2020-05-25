package office_Hours;

public class checkStatic { //JVM first checks class
	
	
	//JVM then checks the main method
	public static void main(String[] args) {
		checkStatic obj = new checkStatic();
	}
	
	//Static block
	static {
		System.out.println("Static block");
	}
	
	//Initializer block
	//Execution depends on object creation
	{
		System.out.println("Initializer block");
	}

}
