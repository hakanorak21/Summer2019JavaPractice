package day39_JavaReview;

public class Constructors {
	
	public Constructors() {
		this(1);
		System.out.print("Erhan ");
	}
	
	public Constructors(int a) {
		System.out.print("Holly ");
	}
	
	public Constructors(double b) {
		this();
		System.out.print("Shawkrat ");
	}
	
	public Constructors(boolean c) {
		this(2.5);
		System.out.print("Dinara ");
	}
	
	public Constructors(String str) {
		this(100);
		System.out.print("Seyfo ");
	}
	
	public static void main(String[] args) {
	
		Constructors obj = new Constructors("");
		System.out.println();
		Constructors obj2 = new Constructors(true);
		System.out.println();
		Constructors obj3 = new Constructors(1.0);
		System.out.println();
		Constructors obj4 = new Constructors(1);
		System.out.println();
		Constructors obj5 = new Constructors();
		
	}
	
}