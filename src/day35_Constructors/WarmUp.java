package day35_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {
	
	/**  
	1. write a return method that accepts an int array and 
	returns it as an ArrayList
	
	2. write a return method that accepts an Integer array and 
	returns the maximum number
	DO NOT USE SORT METHOD
	
	3. write a return method that accepts an Integer arrayList and 
	returns the second maximum number
	DO NOT USE SORT METHOD
			            
	4. write a return method that accepts an Integer array and 
	returns the minimum number
	DO NOT USE SORT METHOD
			            
	5. write a return method that accepts an Integer arrayList and 
	returns the second minimum number
	DO NOT USE SORT METHOD				                		    		
	*/
	
	public static void main(String[] args) {
		
		//Task 1
		int[] a = {1,2,-3,4,5,99,0,50,99};
		ArrayList<Integer> list = ArrayToArrayList(a);
		System.out.println(list);
		
		//Task 1 - Overloaded
		double[] b = {1.5,2.5, 3.3};
		System.out.println(ArrayToArrayList(b));
		System.out.println(ArrayToArrayList(a));
		
		//Task 2
		System.out.println(Max(list));
		
		//Task 3
		System.out.println(SecondMax(list));
		
		//Task 4
		System.out.println(Min(list));
		int[] Numbers = {1,2,3,4,5,6,7,8};
		ArrayList<Integer> list5 = ArrayToArrayList(Numbers);
		int min = Min(list5);
		System.out.println(min);
		list5.add(-100);
		min = Min(list5);
		System.out.println(min);
		
		//Task 5
		System.out.println(SecondMin(list5));
		
		//Another array
		int[] Numbers2 = {100, 9, 8, 700, 18, 9, 0, 0, 0};
		ArrayList<Integer> list6 = ArrayToArrayList(Numbers2);
		System.out.println(SecondMin(list6));
		
	}
	
	//Task 1
	public static ArrayList<Integer> ArrayToArrayList(int[] arr){
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int each: arr)
			list.add(each);
		return list; 
	}
	
	//Task 1 - Overloaded
	public static ArrayList<Double> ArrayToArrayList(double[] arr){
		
		ArrayList<Double> list = new ArrayList<>();
		for (double each: arr)
			list.add(each);
		return list; 
	}
	
	//Task 2
	public static int Max(ArrayList<Integer> list) {
		
		int max = Integer.MIN_VALUE;
		for (int each: list) //Unboxing
			if (each > max)
				max = each;
		return max;
	}
	
	//Task 3
	public static int SecondMax(ArrayList<Integer> list) {
		
		Integer Max = Max(list);
		list.removeAll(Arrays.asList(Max)); //In case there are two max numbers
		int secondMax = Max(list);
		
		return secondMax;
		
	}
	
	//Task 4
	public static int Min(ArrayList<Integer> list) {
		
		int min = Integer.MAX_VALUE;
		for (int each: list) //Unboxing
			if (each < min)
				min = each;
		
		return min;
	}
	
	//Task 5
	public static int SecondMin(ArrayList<Integer> list) {
		
		Integer Min = Min(list);
		list.removeAll(Arrays.asList(Min)); //In case, we have more than one min 
		int secondMin = Min(list);
		
		return secondMin;
		
	}
}
