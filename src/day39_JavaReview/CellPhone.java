package day39_JavaReview;

public class CellPhone {
	
	//Instance variables: created outside methods, within the class.
	//They belong to the object.
	//aka fields.
	String brand;
	String model;
	double price;
	String color;
	double screenSize;
	
	//Constructor overloading
	public CellPhone() {
		brand = "iPhone";
		model = "10";
		price = 700;
		color = "White";
		screenSize = 5;
	}
	
	//Constructor overloaded again
	public CellPhone(String brand, String model, double price, String color, double screenSize) {
	
		this.brand = brand; //this. : calls instance variables, used when 
							//local and instance variables have the same names
		this.model = model;
		this.price = price;
		this.color = color;
		this.screenSize = screenSize;
		
	}
	
	//Instance methods: Do not have static specifier, have return type.
	//Local variables: Created within the methods
	//					Not visible to other methods
	
	public void call(long PhoneNumber) {
		System.out.println(brand + " " + model + " is calling " + PhoneNumber);
	}
	
	public void text(long PhoneNumber) {
		System.out.println("Sending text message to " + PhoneNumber);
	}
	
	public void getInfo() {
		System.out.println(brand + " " + model + ", " + color + ", " +
							screenSize + "-inch screen, $" + price);
	}

}
