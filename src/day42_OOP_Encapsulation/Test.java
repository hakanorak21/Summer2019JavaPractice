package day42_OOP_Encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		TestData obj = new TestData();
		//System.out.println(obj.Name); //compile error because Name is private
		String name = obj.getName(); // read only
		System.out.println(name);
		
		//System.out.println(obj.ID); //compile error becaude ID is private
		System.out.println(obj.getID()); // read only
		int a = obj.getID();
		System.out.println(a);
		
		//obj.Name = "Nurzat"; //compile error because Name is private
		obj.setName("Nurzat");
		System.out.println(obj.getName());
		
		obj.setID(400);
		System.out.println(obj.getID());
		
	}

}
