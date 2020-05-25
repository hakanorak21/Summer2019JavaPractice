package day50_Abstraction;

class Cat extends Animal {
	
	//Compile error due to constructor and abstract methods
	public Cat(char gender, String name, String color, byte age) {
		
		super(gender, name, color, age);
		
	}
	
	@Override
	public void Speak() {
		System.out.println(name + " speaks meow");
	}
	
	@Override
	public void Sleep() {
		System.out.println(name + " sleeps 14 hours");
	}
	
	@Override
	public void Eat(String food) {
		System.out.println(name + " eats " + food);
	}
	
	@Override
	public void Drink() {
		System.out.println(name + " drinks hot chocolate");
	}
		
}
