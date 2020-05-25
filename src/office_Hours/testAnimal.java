package office_Hours;

public class testAnimal { //When run, first will check for static block
	
	public static void main(String[] args) {
		
		//static String word = "Java"; //Local variable cannot be static
		
		//somebody donates lion
		Animal a201 = new Animal();
		System.out.println(a201.name); //no name yet
		a201.name = "Simba";
		System.out.println(a201.name); //Simba
		a201.age = 3;
		a201.color = "Brown";
		
		a201.eat("zebra");
		a201.sleep();
		
		//somebody donates penguin
		Animal a202 = new Animal();
		a202.name = "Lulu";
		a202.age = 1;
		a202.color = "gray";
		
		System.out.println(a202.name); // Lulu
		System.out.println(a202.breed); // null
		System.out.println(a202.gender); // true
		
		//Variables: local, instance, static
		//Local: inside method
		//Instance: outside method
		//Static variable: 	no need to create object
		//					it shares value
		
		//String example;
		//System.out.println(example); //Compile error: Not initialized
		
		Animal a203 = new Animal("Keanu", 1, "Colico", 7.5, "Brown", false);
		System.out.println(a203.name);
		
		//Example for static variable
		System.out.println(a201.zooName);
		System.out.println(Animal.zooName);
		Animal.zooName = "Cybertek Zoo";
		System.out.println(Animal.zooName);
		System.out.println(a201.zooName); //Now, Simba is in Cybertek Zoo
		
	}

}
