package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_MethodsWithArrayList_RepeatAL {
	
	public static void main(String[] args)
	{
		ArrayList<Boolean> list = new ArrayList<>();
		list.add(true);
		list.add(false);
		list.add(false);
		//System.out.println(list);
		repeatAL(list);
		System.out.println(list);
		
	}
	//create your method below
	static void repeatAL(ArrayList<Boolean> list){
	  
	/**
	  Boolean[] array = new Boolean[list.size()];
	  for (int i = 0; i < array.length; i++)
	    array[i] = list.get(i);
	  
	  list.addAll(Arrays.asList(array));
	*/
		
		//Using only ArrayList
		int index = list.size();
		for (int i = 0; i < index; i++) {
			list.add(list.get(i));
		}
	}
	
}
