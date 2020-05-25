package day47_JavaReview;

class Cinthya{
	
	public Cinthya(int a) {
		
		System.out.println("Cinthya " + a);
	}
	
	public Cinthya() {
		System.out.println("Cinthya");
	}
	
	public Cinthya(String a) {
		System.out.println("Cinthya " + a);
	}
}

public class Constructors2 extends Cinthya{
	
	
	public Constructors2() {
		super("A");
	}
	
	
	public static void main(String[] args) {
		
		Constructors2 obj = new Constructors2();
	}

}
