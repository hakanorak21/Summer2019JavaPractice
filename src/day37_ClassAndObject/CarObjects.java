package day37_ClassAndObject;

public class CarObjects {
	
	public static void main(String[] args) {
		
		Car 		car1 		= 	new Car();
	//	Classname	ObjectName		
		car1.brand = "BMW";
		car1.color = "White";
		car1.mileage = 15000;
		car1.model = "X6";
		car1.price = 14999.99;
		car1.year = 2000;
		
		System.out.println(car1.brand); // BMW
		System.out.println(car1.color); // White
		System.out.println(car1.mileage); // 15000
		System.out.println(car1.model); // X6
		System.out.println(car1.price); // 14999.99
		System.out.println(car1.year); // 2000
		System.out.println(car1.toString()); //Hashcode
		System.out.println("=========================");
		
		Car car2 = new Car();
		System.out.println(car2.brand); // null
		
		car2.brand = "Toyota";
		car2.model = "Corolla";
		car2.color = "Black";
		car2.mileage = 150000;
		car2.year = 2002;
		car2.price = car2.year;
		
		System.out.println(car2.brand); // Toyota
		System.out.println(car2.model); // Corolla
		System.out.println(car2.year); // 2002
		System.out.println(car2.mileage); // 150000
		System.out.println(car2.color); // Black
		System.out.println(car2.price); // 2002.0
		System.out.println("=========================");
		
		car1.drive(); // Driving BMW X6
		car2.drive(); // Driving Toyota Corolla
		
		car1.start(); // Starting BMW X6
		car2.start(); // Starting Toyota Corolla
		
		car1.getInfo();
		car2.getInfo();
		
		Car car3 = new Car();
		car3.getInfo(); // default values: null, 0, ...
		
		car3.brand = "Lexus";
		car3.model = "RX350";
		car3.year = 2020;
		car3.mileage = 25000;
		car3.color = "Purple";
		car3.price = 59999.99;
		car3.getInfo();
		
	}

}
