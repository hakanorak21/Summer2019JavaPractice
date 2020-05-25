package day37_ClassAndObject;

public class DogObjects {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		System.out.println(dog1.name); // null
		//System.out.println();
		
		dog1.breed = "Husky";
		dog1.size = "small";
		dog1.color = "gray";
		dog1.name = "Holly";
		dog1.gender = 'F';
		dog1.age = 25;
		dog1.food = "chicken";
		System.err.println(dog1.name); // Holly in red
		dog1.getBasicInfo();
		dog1.getInfo();
		
		Dog dog2 = new Dog();
        dog2.breed = "Pitbull";
        dog2.name = "lyka";
        dog2.color = "gray";
        dog2.age = 3;
        dog2.size = "large";
        dog2.gender = 'M';
        dog2.food = "sushi";
        dog2.getInfo();
        
        dog2.eat();
        
        dog1.eat();
        
        dog1.play();  
        dog2.play();
    
        
        String str = new String("Hello");
        str.toLowerCase();
        System.out.println(str); // String is immutable!
        str = str.toLowerCase();
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
		
	}

}
