package OCA_Exam;

public class OCA_Exam_Part3 {

	public static void main(String[] args) {
		

	}

}

/*
//Question 29
class Employee{
	private String name;
	private int age, salary;
	
	public Employee(String name, int age) {
		setName(name);
		setAge(age);
		setSalary(2000);
	}
	
	public Employee(String name, int age, int salary) {
		this(name, age);
		setSalary(2000);
		//this(name, age); //should be first line
	}
	
	//Setter methods
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printDetails() {
		System.out.println(name+" : "+age+" : "+salary);
	}
}

class Test{
	public static void main(String[] args) {
		//Employee e1 = new Employee(); //No default constructor
		Employee e2 = new Employee("Jack", 50);
		Employee e3 = new Employee("Chloe", 40, 5000);
		
		e2.printDetails();
		e3.printDetails();
	}
}


//Question 28
class Test{
	public static int stVar = 100;
	public int var = 200;
	
	public String toString() {
		return var+" : "+stVar;
	}
}

class X{
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.var = 300;
		System.out.println(t1);
		
		Test t2 = new Test();
		t2.stVar = 300;
		//System.out.println(t1);
		System.out.println(t2);
		
	}
	
}


//Question 26
class A4{
	//protected static final int i; //final field should be initialized
	private void doStuff() {
		
	}
	
}

//final abstract class A5{ //Should be either final or abstract
//	
//}

abstract class A3{
	private static int i;
	public void doStuff() { };
	public A3() { };
}


//Question 19
abstract class Planet{
	
	protected void resolve() { }
	abstract void rotate();
	
}

class Earth extends Planet{
	
	//void resolve() { } //Should be protected or public
	
	@Override
	protected void rotate() { }
	
}
*/

class Person {
	
	String name;
	int age = 25;
	
	public Person(String name){
		//this(); //No default constructor
		setName(name);
	}
	
	public Person(String name, int age) {
		//Person(name); //Cannot call a constructor like this. It should be:
		this(name);
		setAge(age);
		
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
}