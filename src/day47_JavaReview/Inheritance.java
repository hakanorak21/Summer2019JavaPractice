package day47_JavaReview;

/**
super: refers to the object instance

	super. : calls instance variables and instance methods
				MUST be used in the sub class
				cannot be used in static method
				
	super(): calls the constructor from the super class
	
				
this: refers to the object instances

	this. : calls instance variables for the class itself
	cannot be used in static methods or blocks
	
	this(): calls the constructor from the class itself
	
	SUPER AND THIS SHOULD ONLY BE USED TO CALL OBJECT INSTANCES,
	NOT THE STATICS
	
Constructor: super class constructor MUST be called  in the sub class
				super class 				
 */


class A {
	
	public String name1 = "Ayaz";
	
}

class B extends A {
	
	public String name2 = "Sukran";
	public String name3 = "Erhan";
	
	public void method1() {
		super.name1 = "Feride"; //super class' instance variable
		this.name1 = "Filiz"; //sub class' instance variable
	}
	
}

public class Inheritance extends B {
	
	public String name4 = "Mehmet";
	public String name5 = "Mahribana";
	
	public static void main(String[] args) {
		
		//Object of class Inheritance
		Inheritance obj = new Inheritance();
		System.out.println(obj.name1);
		System.out.println(obj.name2);
		System.out.println(obj.name3);
		System.out.println(obj.name4);
		System.out.println(obj.name5);
		
		//Object of class B
		B obj2 = new B();
		System.out.println(obj2.name1);
		System.out.println(obj2.name2);
		System.out.println(obj2.name3);
		//System.out.println(obj2.name4); //sub class
		//System.out.println(obj2.name5); //sub class
		
		//Object of class B
		A obj3 = new A();
		System.out.println(obj3.name1);
		//System.out.println(obj3.name2); //sub class
		//System.out.println(obj3.name3); //sub class
		//System.out.println(obj3.name4); //sub class
		//System.out.println(obj3.name5); //sub class

	}

}
