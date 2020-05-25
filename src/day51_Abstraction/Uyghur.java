package day51_Abstraction;

public class Uyghur {
	
	String name;
	int age;
	double weight;
	
	/*
	public Uyghur(String name) {
		this.name = name;
	}
	
	public Uyghur() {
		name = "No name assigned yet";
		
	}
	*/
	
	public Uyghur(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public Uyghur(String name) {
		this.name = name;
	}
	
	//Default constructor
	public Uyghur() {
	
	}
	
	public void Wants(String message) {
		System.out.println("I want freedom for " + message );
	}
	
}
