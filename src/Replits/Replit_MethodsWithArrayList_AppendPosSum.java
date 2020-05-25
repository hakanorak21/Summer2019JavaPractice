package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_MethodsWithArrayList_AppendPosSum {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
		//System.out.println(list);
		System.out.println(appendPosSum(list));
		
	}
	//create your method below
	static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
		
		ArrayList<Integer> result = new ArrayList<>();
		int total = 0;
		for (Integer each: list) {
			
			if(each > 0){ 
				result.add(each);
				total += each;
			}
			
		}
		result.add(total);
		return result;
	}
	

}
