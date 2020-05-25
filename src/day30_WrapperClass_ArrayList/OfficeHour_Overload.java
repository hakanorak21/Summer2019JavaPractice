package day30_WrapperClass_ArrayList;

public class OfficeHour_Overload {
	
	public static void hi() {
		System.out.println("Hi, how are you?");
	}
	
	public static void hi(String name) {
		System.out.println("Hello, hello");
	}
	
	public static String hi (String name, String day) {
		return "Hi " + name + ", Have a good " + day;
	}
	
	// Interview question: Can you overload main method? YES
	// Change parameters or return type
	
	public static void main() {
		System.out.println("Fake main method");
	}
	
	public static String main(int num) {
		return "Your number is " + num;
	}
	
	public static void main(String[] args) {
		
		hi();
		hi("Asiya");
		System.out.println( hi("Asiya", "Wednesday") );
		main();
		System.out.println( main(1) );
		
		
	}
	
	

}
