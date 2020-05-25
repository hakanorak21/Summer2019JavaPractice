package day52_Interface;
//Assessment quiz 13
/**
//Question 1
class A{
	public A() {
		System.out.print("A ");
	}
}

class B extends A{
	public B() {
		System.out.print("B ");
	}
	
}

public class Quiz extends B {
	public Quiz() {
		System.out.print("C ");
	}
	
	public static void main(String[] args) {
		B obj = new B();
		
	}

}


//Question 3
public class Quiz{
	public static void main(String[] args) {
		final int i;
		i = 20;
		//i = 30; //Constant variables cannot be re-assigned
		System.out.println(i);
	}
}

//Question 4
public class Quiz{
	int a = 10;
	public static void main(String[] args) {
		Quiz obj = new Quiz();
		obj.a = 20;
		System.out.println(obj.a); //20
		
		Quiz obj2 = new Quiz();
		System.out.println(obj2.a); //10
	}
}
*/

//Question 8
abstract class Data{
	protected abstract int add (int a, int b);
}
public class Quiz extends Data{
	@Override
	public int add(int a, int b) {
		return a + b;
	}
		
	public static void main(String[] args) {
		//Data obj = new Data(); //Cannot create an object from abstract class
		Boolean a = new Boolean(Boolean.parseBoolean("true"));
		System.out.println(a);
		
		int[] arr = {2, 1, 0};
		for (int i: arr)
			System.out.print(arr[i] + " ");
	}
	
}

