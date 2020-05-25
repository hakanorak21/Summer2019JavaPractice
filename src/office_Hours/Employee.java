package office_Hours;

public class Employee {
	
	//Default constructor is invisible
	//Default constructor can be overloaded
	
	//Constructor: created with public and class name
	public Employee() {
		SSN = 0;
		name = "Not assigned yet";
		System.out.println("This is constuctor.");
	}
	
	public Employee (int SSN, String name, int age, double salary) {
		
		this.SSN = SSN;
		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println("Overloaded constructor");
	}
	
	//Instance variables
	private int SSN;
	String name;
	int age;
	double salary;
	
	public int getSSN() {
		return SSN;
	}
	
	public void work() {
		System.out.println("The employee is working");
	}
	
	
	static {
		System.out.println("Welcome to Cybertek!");
	}
	
	
	{
		System.out.println("Hi " + name + ", Good morning");
	}
	
	public static void main(String[] args) { 
	//Running order: static (once) ==> Initializer block, Constructor 
										//For each object
		Employee e1 = new Employee();
		//System.out.println(e1.name);
		
		//e1.name = "Muhtar";
		//System.out.println(e1.name);
		
		Employee e2 = new Employee();
		//e2.name = "Marufjon";
		
		Employee e3 = new Employee(657, "Vasyl", 18, 150000);
		System.out.println(e3.SSN);
		
	}

}
