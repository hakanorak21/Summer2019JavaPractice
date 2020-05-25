package day62_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

//import org.apache.poi.hpsf.Array;

public class ListInterface {
	
	public static void main(String[] args) {
		
		//List<Integer> list1 = new List<>();
		//List is an interface ==> Cannot create an object from List
		
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new LinkedList<>();
		List<Integer> list4 = new Vector<>();
		
		ArrayList<Integer> arrayList = new ArrayList<>();
			arrayList.add(10);
			arrayList.add(20);
			arrayList.add(30);
			arrayList.add(40);
//		System.out.println(arrayList.toString());
		System.out.println(arrayList);
		
		LinkedList<Integer> linkedList = new LinkedList<>();
			linkedList.add(10);
			linkedList.add(20);
			linkedList.add(30);
		System.out.println(linkedList);
			linkedList.remove(1);
		System.out.println(linkedList);
		
		System.out.println("===================");
		
		String[] arr = {"A", "B", "B"};
		
		List<String> notLinked = new ArrayList<>(Arrays.asList(arr));
		LinkedList<String> linked = new LinkedList<>(Arrays.asList(arr));
		System.out.println(notLinked); // [A, B, B] 
		System.out.println(linked); // [A, B, B] 
		
		Vector<Integer> vt = new Vector<>();
		
		System.out.println("==================");
		
		Stack<Integer> st = new Stack<Integer>();
			st.add(1);
			st.add(2);
			st.add(3);
			st.add(4);
			System.out.println(st.pop());
			System.out.println(st);
			System.out.println(st.pop());
			System.out.println(st);
			System.out.println(st.pop());
			System.out.println(st);
			System.out.println(st.pop());
			System.out.println(st);
//			System.out.println(st.pop()); // EmptyStackException
		
	}
	
	//ArrayList
	public void add1(int a) {
		
	}
	
	//Vector: synchronized keyword
	public synchronized void add2(int a) {
		
	}

}
