package day37_ClassAndObject;

public class Dog {
	
	/**
	 Class: Dog
		Attributes: Breed, size, age, color, name...
		Action: Eat, sleep, bark, play...
		
	Object: Dog1
		Attributes: Husky, XXL, 5, white, Lassie
	
	Object: Dog2
		Attributes: German Shepherd, Small, 10, brown, Kiko
		
	Dog1.eat() ==> Lassie eats
	Dog2.eat() ==> Kiko eats
	*/
	
	String breed;
	String size;
	byte age;
	String color;
	String name;
	char gender;
	String food;
	
	public void getBasicInfo() {
		System.out.println(breed + ", " + size + " in size, is " + age + " years old");
	}
	
	public void getInfo() {
        System.out.println(breed +" " + size + ", " 
                    + age+" years old, "+color+", Gender is "+gender+", Name is "+name);
            
    }
        
    
    public void eat() {
        
		System.out.println(name +" is eating "+food);
    }
    
    
    public void play() {
        System.out.println(breed+" is playing");
    }
    
	

}
