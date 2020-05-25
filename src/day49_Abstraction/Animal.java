package day49_Abstraction;

public abstract class Animal {
	
	public abstract void eat();
	
	public abstract void sleep();
	
	//abstract class can have non-abstract methods
	public static void main(String[] args) {
		
	}
	
}

//Concrete (not abstract)
class Cat extends Animal{
	
	@Override
	public void eat() { //same or more visible access-modifier
		System.out.println("Cat eats");
	}
	
	@Override
	public void sleep() {
		System.out.println("Cat sleeps");
	}
	
}

class Dog extends Animal{
	
	@Override
	public void eat() { //same or more visible access-modifier
		System.out.println("Dog eats");
	}
	
	@Override
	public void sleep() {
		System.out.println("Dog sleeps");
	}
	
}

class Test{
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.eat();
		dog1.sleep();
		
	}
}
