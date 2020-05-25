package day37_ClassAndObject;

	public 			class Car {
//	Access-modifier
	
	/**
	Class: car
		attribute: model, brand, year, color, price, mileage, VIN...
		action: start, accelerate, brake, drive...
		
	Object: car1
		attribute: Q7, Audi, 2020, white, 100K, 0, 1231234
		action: car1.start(), car1.accelerate(), car1. brake(), car1.driver()
	
	Object: car2
		attribute: X, Tesla, 2025, red, 60K, 0, 145623241
		action: car2.start()...
		
	car1.start() ==> starts Audi
	car2.start() ==> starts Tesla
	
	Object: instance of the class
	
	class: where the objects come from, determines how the object should behave
		
	Instance variable: aka object variables, MUST be declared in the class
						and outside any method
						
	Local variable: created with the method
	
	Instance methods: methods belong to the object
						doesn't have specifier (static)
						
	Regular method:
		access-modifier specifier return-type methodName (parameters){
		
		}
		
	*/
	
	String model;
	int year;
	String color;
	double price;
	long mileage;
	String brand;
	
	public void drive() {
		System.out.println("Driving " + brand + " " + model);
	}
	
	public void start() {
		System.out.println(brand + " is starting");
	}
	
	// 2020 Toyota Corolla, white, $1000
	public void getInfo() {
		System.out.println(year + " " + brand + " " + model + ", " + 
							color + ", $" + price);
	}
	
}
