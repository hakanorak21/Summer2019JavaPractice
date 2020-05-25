package day29_ReturnMethods;

public class OverloadPractice {
	
	public static void main(String[] kfc) {
		System.out.println("String Array");
		boolean[] array1 = {true, false};
		main(array1);
	}
	
	public static void main(int[] args) {
		System.out.println("Int Array");
	}
	
	public static void main(double[] args) {
		System.out.println("Double array");
	}
	
	public static int main(boolean[] args) {
		System.out.println("Boolean array");
		return 3;
	}
	
	
}
