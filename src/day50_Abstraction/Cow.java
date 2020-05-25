package day50_Abstraction;

public class Cow extends Animal {

	//Compile error due to constructor and abstract methods
	public Cow(char gender, String name, String color, byte age) {
		super(gender, name, color, age);
	}
	
	@Override
	public void Speak() {
		System.out.println("moo");
	}
	
	@Override
	public void Sleep() {
		System.out.println("5 hours");
	}
	
	@Override
	public void Eat(String food) {
		System.out.println("Eats " + food);
	}
	
	@Override
	public void Drink() {
		System.out.println("Coffee with sugar");
	}
		
}
