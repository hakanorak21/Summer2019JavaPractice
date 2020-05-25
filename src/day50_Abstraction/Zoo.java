package day50_Abstraction;

public class Zoo{
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog('M', "Lassie", "brown", (byte)5);
		Cat cat1 = new Cat('M', "Goldie", "orange", (byte)1);
		Cow cow1 = new Cow('F', "Sarikiz", "yellow", (byte)10);
		
		cat1.getInfo();
		cat1.Speak();
		cat1.Sleep();
		cat1.Eat("meat");
		cat1.Drink();
		System.out.println("===============================");
		
		dog1.getInfo();
		dog1.Speak();
		dog1.Sleep();
		dog1.Eat("bone");
		dog1.Drink();
		System.out.println("================================");
		
		cow1.getInfo();
		cow1.Speak();
		cow1.Sleep();
		cow1.Eat("grass");
		cow1.Drink();
		
		Animal[] animal = {cat1, dog1, cow1};
		animal[0].getInfo();
		cat1.Speak();
		
	}
}
