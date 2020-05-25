package day49_Abstraction;

	/**
	OOP Concept (besides encapsulation, inheritance)
	
	Abstraction: 	Concentrating on essentials
					Not worrying about the details/implementation
					Hiding the implementation details
					
	Car: start(){
	
	 	 		}
	 	 		
	Abstract method: 	A method without body/implementation
	 					public abstract start(); ==>
	 					It's a method that's meant to be overridden.
	 					Cannot be final, private, static. 
	 					Can be declared ONLY in abstract class or interface.
	 					
	 				Ex:	
	 					Old car:
	 					 start(){
	 					 	call the mechanic
	 					 	put the key in
	 					 	start the engine
	 					 	jump start
	 					 	drive
	 					 }
	 					 
	 					 Tesla:
	 					 	start(){
	 					 		say "start"
	 					 		drive
	 					 	}
	 					 	
	 Abstract class: 	Abstract is something not concrete.
	  					We cannot create object from.
	  					A class meant to be extended (cannot be final).
	  					If the sub class is regular, it MUST override 
	  						abstract methods.
	  					If the sub class is abstract, no need to override.					
	 */
public abstract class Abstraction {//Abstract is a reserve word

	public abstract void startTheCar();

}

class Toyota extends Abstraction{
	//regular class MUST implement the abstract methods
	//from the abstract class

	@Override
	public void startTheCar() {
		System.out.println("Brake");
		System.out.println("Push the start button");
		System.out.println("Release the brake");
	}

	public static void main(String[] args) {

		//Abstraction obj = new Abstraction(); //We cannot create an object
		//of an abstract class
		Toyota obj = new Toyota();
		obj.startTheCar();
		System.out.println();
		
		//Due to polymorphism, also possible as:
		Abstraction obj2 = new Toyota();
		obj2.startTheCar();

	}
}

class Tesla extends Abstraction{

	@Override
	public void startTheCar() {
		System.out.println("Say \"start\"");
		System.out.println("Drive");
	}
	
	public static void main(String[] args) {
		
		Tesla obj = new Tesla();
		obj.startTheCar();
	}
	
}
