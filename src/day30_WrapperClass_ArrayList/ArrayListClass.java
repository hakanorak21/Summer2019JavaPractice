package day30_WrapperClass_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
	
	/**
	ArrayList class:
	 			1. In "java.util" package
	 				import java.util.ArrayList;
	 			2. It doesn't support primitives (that's why we need 
	 			wrapper classes)
	 			3. Different than Array, we store objects ONLY
	 			4. ArrayList size is automatically adjusted (dynamic)
	 			
	 Declaration of ArrayList:
	 			ArrayList<ClassType> variableName = new ArrayList<>();
	 			
	 Methods: add, get, size, clear
	 			
	*/  
	public static void main(String[] args) {
		
		int[] array1 = new int[1]; // Array

		ArrayList<Integer>  list = new ArrayList<>(); //ArrayList

		ArrayList<Integer>  list2 = new ArrayList<Integer>();
		list2.add( 10 );  // auto-boxing
		list2.add( 20 );
		list2.add( 30 ); 
		// [10, 20, 30]
		// index:            0   1   2              


		System.out.println( list2 );


		System.out.println( list2.get(1) ); // 20
		//System.out.println( list2.get(9) );   // maximum index number is 2


		System.out.println( list2.size() );  //3

		list2.clear(); // Deletes all elements
		System.out.println( list2 );
		System.out.println( list2.size() );
		
		list2.add(10);
		System.out.println(list2);
		System.out.println(list2.size());
		System.out.println(list2.get(0));
	
	}

}
