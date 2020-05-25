package java_Book_Chapter5;

public class DogDemo {
	
	public static void main(String[] args)
	{
		Dog balto = new Dog();
		balto.name = "Balto";
		balto.age = 8;
		balto.breed = "Siberian Husky";
		balto.writeOutput();

		Dog scooby = new Dog();
		scooby.name = "Scooby";
		scooby.age = 42;
		scooby.breed = "Great Dane";
		System.out.println(scooby.name + " is a " + scooby.breed + ".");
		System.out.print("He is " + scooby.age + " years old, or ");
		int humanYears = scooby.getAgeInHumanYears();
		System.out.println(humanYears + " in human years.");
		
		System.out.println();
		
		Dog kangal = new Dog();
		kangal.name = "Basho";
		kangal.age = 10;
		kangal.breed = "Sivas kangal";
		kangal.writeOutput();
		
		System.out.println(kangal.name + " is a " + kangal.breed + ".");
		System.out.print("He is " + kangal.age + " years old, or ");
		humanYears = kangal.getAgeInHumanYears();
		System.out.println(humanYears + " in human years.");
		
		System.out.println();
		
		Dog dummy = new Dog();
		dummy.writeOutput();
		
		
		
	}

}
