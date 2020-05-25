package day23_Arrays;

public class ArraysClass {
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3};
		
		for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		}
		
		System.out.println(a.toString());
		
		String[] names = {"Nigar", "Sumeyye", "Madina", "Juline"};
		// 					0			1		2			3
		System.out.println(names[0]);
		System.out.println(names[1]);
		
		String str1 = names[0];
		String str2 = names[names.length-1];
		System.out.println(str1);
		System.out.println(str2);
		
		double[] myArray = {1, 2, 3, 4, 5, 8, 0, 2};
		//					0  1  2  3  4  5  6  7
		
		for (int i = 0; i < myArray.length; i++)
			System.out.print(myArray[i] + " ");
		
	}
	
}
