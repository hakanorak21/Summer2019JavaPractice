package day47_JavaReview;

class Mehmet{
	
	public Mehmet() {
		System.out.println("Mehmet");
		
	}
	
}
class Resul extends Mehmet {
	
	public Resul() {
		//super(); // called automatically
		System.out.println("Resul");
	}
	
}

class Viktoria extends Resul {
	
	public Viktoria() {
		//super(); //called automatically
		System.out.println("Viktoria");
	}
	
}

public class Constructors extends Viktoria {
	
	public static void main(String[] args) {
		
		Viktoria obj = new Viktoria();
		
	}

}
