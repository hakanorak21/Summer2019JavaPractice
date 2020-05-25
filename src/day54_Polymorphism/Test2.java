package day54_Polymorphism;

//Super type of Test2
interface InterFace{
	
	//interface can have only abstract methods
	abstract void get(); 
	
}

//interface can extend an interface, while
//class extends a class
interface InterFace2 extends InterFace{
	
	//interface can have only abstract methods
	abstract void frame();
	
}

abstract class AbsClass{
	
}

public class Test2 extends AbsClass implements InterFace, InterFace2{
	//MUST implement abstract methods
	
	public static void main(String[] args) {
		
		InterFace obj = new Test2();
		obj.get();
		
		InterFace2 obj2 = new Test2();
		obj2.frame();
		obj2.get();
		
		AbsClass obj3 = new Test2();
		
	}

	@Override
	public void get() {
		
		System.out.println("Chrome browser");
		
	}

	@Override
	public void frame() {
		
		System.out.println("frame");
		
	}

}
