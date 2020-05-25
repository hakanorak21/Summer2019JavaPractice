package day51_Abstraction;

/**
 Resource: Tutorialspoint.com
 
 Encapsulation is one of the four fundamental OOP concepts. 
 The other three are inheritance, polymorphism, and abstraction.
 
 Encapsulation (aka data hiding):
  	Mechanism of wrapping the data (variables) and code acting on the data (methods) together 
  	as a single unit. 
 	The variables of a class will be hidden from other classes, and can be accessed only 
 	through the methods of their current class.
 	
 To achieve encapsulation in Java:
	1. Declare the variables of a class as private.
	2. Provide public setter and getter methods to modify and view the variables values.
 */
public class EncapTest {
	private String name;
	private String idNum;
	private int age;
	
	//Getters (accessors)
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return idNum;
	}

	//Setters (mutators)
	public void setAge( int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setIdNum( String newId) {
		idNum = newId;
	}
}