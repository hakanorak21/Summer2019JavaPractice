package day54_Polymorphism;

/**
Topic: Polymorphism
		IS-A relationship VS HAS-A relationship
		(polymorphism)		 (object in a different class)
		
OOP Concepts:
	1. Encapsulation: data hiding, getter & setter 
	2. Inheritance: super&sub relationship, sub-class gets rich
	3. Abstraction: hiding the implementation via abstract class and interface
	4. Polymorphism: multi behavior of an object	

IS-A relation: Inherited relationship between classes
	Tiger is an animal.
	Octopus is an animal.
	
HAS-A relation: Instance of the class (object) is used in another class
	class Car{
		Engine obj = new Engine();
	}
	==> Car has a relationship with engine.
	
	Ex: Zoo has a relationship with tiger.
		Zoo has a relationship with octopus.
		Zoo has a relationship with animal.
		
Polymorhism usually occurs when the super class/interface is reference type,
and object is created from the sub classes that have IS-A relation
with the super class/interface.
Ex: WebDriver driver = new ChromeDriver();
			  driver.get(url); //Overridden method will be executed
	WebDriver driver2 = new FirefoxDriver();

classA 			obj = new ClassA();
reference type			object
(super-class or 		(sub-class)
interface)

2 IMPORTANT RULES:
	1. Reference type decides what is accessible and what can be used.
	2. Reference type can be super class or interface, and objects
	can be any sub class. 

	If we make an "abstract class" as reference type, then the object
	should be created from "a" non-abstract sub class.

	If we make an "interface" as reference type, object MUST be created
	from "a" non-abstract sub-class.  

Method overriding:
	Overridden method cannot be static, final, private
	MUST take place in sub-class
*/

/*
Warmup:
Create a class called Animal (Do not use abstraction for now):
	Actions: Talk()

Create sub classes of Animal class:
    1. Tiger:
    	Actions: Hunt()
    2. Octopus:
       	Actions: Swim()
PS. Override super class' instance method Talk()
    
Create a class called Zoo:
	Create Arrays of Tiger
    Create Arrays of Octopus
 */

class Animal{
	
	public void Talk() {
		System.out.println("Animal talking");
	}
	
}

class Tiger extends Animal{
	
	@Override
	public void Talk() {
		System.out.println("Tiger talking");
	}
	
	//Tiger's own method
	public void Hunt() {
		System.out.println("Tiger hunting");
	}
	
}

class Octopus extends Animal{
	
	@Override
	public void Talk() {
		System.out.println("Octopus talking");
	}
	
	//Octopus' own method
	public void Swim() {
		System.out.println("Octopus swimming");
	}
}

public class Zoo {
	
	public static void main(String[] args) {
		
		Tiger Lili = new Tiger();
		Tiger Keanu = new Tiger();
		Tiger Goldie = new Tiger();
		Tiger[] myTigers = {Lili, Keanu, Goldie, new Tiger()};
		System.out.println("Zoo has " + myTigers.length + " tigers.");
		Lili.Talk();
		myTigers[0].Talk();
		System.out.println();
		
		Octopus[] myOctopi = new Octopus[2];
		Octopus octie1 = new Octopus();
		myOctopi[0] = octie1;
		myOctopi[1] = new Octopus();
		
		Animal animal = new Tiger();
		Animal animal2 = new Octopus();
		
		animal.Talk();
		animal2.Talk();
		//animal2.Swim(); //swim doesn't exist in super class
							//Even though object is octopus, which
							//can swim, the reference type is animal, which
							//doesn't have swim method.
		
	}

}
