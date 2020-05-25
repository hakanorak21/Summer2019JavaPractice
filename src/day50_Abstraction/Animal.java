package day50_Abstraction;

/**
WarmUp:
		Create an abstract Animal class
            data/attributes: gender, age, color, name
            create one constructor that can set the gender, name, color and age
            Actions: Speak(), Eat(), Sleep(), Drink();
    	
    	Create sub classes of the Animal and override those actions:
                    dog: Speak()    ==> woof
                         Sleep()    ==> 8 hours
                         Eat()      ==> KFC
                         Drinks()   ==> Milk Shake
                    Cat: Speak()    ==> meow
                         Sleep()    ==> 14 hours
                         Eat()      ==> m&m
                         Drinks()   ==> Hot chocolate
                    cow: Speak()    ==> moo
                         Sleep()    ==> 5 hours
                         Eat()      ==> grace
                         Drinks()   ==> Coffee with sugar
        create  zoo class and store some of those animals' objects
 */

public abstract class Animal {
	
	/**
	 * Abstraction: Concentrating on essentials
	 * 
	 * Abstract keyword: Applicable only to classes and methods
	 * 
	 * Abstract class: 	We cannot create object of
	 * 					Meant to be extended
	 * 					Cannot be final
	 * 					Access-modifiers can only be public or default
	 * 
	 * Abstract method:	Meant to be overridden
	 * 					Without body/implementation
	 * 					Cannot be static, private, or final
	 * 					Only instance methods can be overridden
	 * 
	 * Declaration of abstract method:
	 * 		Access-modifier abstract return-type name(parameter);
	 * 		Access-modifiers: public, protected, default
	 * 		Return type: void, primitive, non-primitives(object)
	 * 		Name: any
	 * 		Parameter: any data type (primitive and non-primitives)
	 * 
	 * Overriding: 	Same method name, same parameter, same return-type
	 * 				Access-modifier: same or more visible
	 * 				MUST override in the sub class
	 * 				@Override must be applicable 
	 * 	
	 */
	
	//Data/attributes: gender, age, color, name
	public char gender;
	public byte age;
	public String color;
	public String name;
	
	//Constructor that can set the gender, name, color and age
	public Animal(char gender, String name, String color, byte age) {
		
		this.gender = gender;
		this.name = name;
		this.color = color;
		this.age = age;
		
	}
	
	//Actions: Speak(), Eat(), Sleep(), Drink();
	public abstract void Speak();
	public abstract void Eat(String food);
	public abstract void Sleep();
	public abstract void Drink();
	
	//Get info method
	public void getInfo() {
		
		System.out.println("Name: " + name + ", Gender: " + gender +
							", Color: " + color + ", Age: " + age);
	}
	
}
