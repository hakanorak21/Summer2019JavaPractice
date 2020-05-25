package office_Hours;

public class Animal {
	
	//information --> variable
	static String zooName = "Houston Zoo";
	String name;
	int age;
	String breed;
	double weight;
	String color;
	boolean gender;
	
	//Constructor
	public Animal() {
		name = "No name yet";
		age = 0;
		color = "Unknown";
		weight = 0.0;
		gender = true;
	}
	
	
	public Animal(String name, int age, String breed, 
			double weight, String color, boolean gender) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.weight = weight;
		this.color = color;
		this.gender = gender;
	}

	// 3 methods: void, return, constructor
	// overload: same class, same name, different parameters,
	//			 method type can be different
	
	//action --> method
	public void eat(String foodName) {
		System.out.println("the animal is eating");
	}
	
	public void sleep() {
		System.out.println("the animal is sleeping");
	}
	
	public void sleep(int minute) {
		System.out.println("This animal sleeps " + minute + " minutes.");
	}
	
	static {
		System.out.println("This is static block.");
	}
	
}
