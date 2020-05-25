package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_MethodsWithArrayList {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,3,7));
		System.out.println(twoTimes(list));
	}
	
	//create your method below
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> list){
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			result.add(list.get(i));
			result.add(list.get(i));
		}
		
		return result;
	}

}
