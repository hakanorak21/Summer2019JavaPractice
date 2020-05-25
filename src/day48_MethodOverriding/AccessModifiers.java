package day48_MethodOverriding;

class Mahribana{
	protected void methodA() {
		System.out.println("Method A");	
	}
	
	public String methodB() {
		return "B";
	}
	
	protected double salary (double bonus) {
		return bonus + 100000;
	}
	
}

public class AccessModifiers extends Mahribana{
	
	/**
	@Override
	void methodA() {
		System.out.println("Method A");
	}
	
	@Override
	protected void methodA() {
		System.out.println("Method A");
	}
	*/
	
	@Override
	public void methodA() {
		System.out.println("Method A");
	}
	//We can use same or more visible access-modifiers
	
	@Override
	public String methodB() {
		return "sub B";
	}
	
	//@Override //Not overridden because different parameter
	//This is just overloading
	protected double salary(int bonus) {
		return bonus + 20000;
	}
	
}
