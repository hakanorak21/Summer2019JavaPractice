package day45_Inheritance;


class Data {
	
	public String name;
	private String age;
	String ID; //default access-modifier
	static String ID2;
	protected String DOB;
	
	public void Hello() { //public
		//Hola();
		System.out.println("Hello");
	}
	
	private void Hola() { //private
		System.out.println("Hola");
	}
	
	void Aloha() { //default
		//Hola();
		System.out.println("Aloha");
	}
	
}


public class MultiClassPractice {
	
	public static void main(String[] args) {
	
		Data obj = new Data();
		System.out.println(obj.name); //instance variable
		//System.out.println(obj.age); //private
		System.out.println(obj.ID);
		System.out.println(Data.ID2);
		
		//If two classes were located in different packages, then
		//ID would not accessible
		
		obj.Hello();
		//obj.Hola(); //private
		obj.Aloha();
		
	}

}
