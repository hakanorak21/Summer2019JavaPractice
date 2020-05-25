package Replits;

import java.util.ArrayList;

public class Replit_MethodsWithArrays3 {
	
	public static int getDup(String[] r) 
	{
		
		ArrayList<String> list = new ArrayList<>();
		
		int result=0;
		
		for(int i=0;i<r.length;i++) {
			if(!list.contains(r[i])) {
				list.add(r[i]);
			}
		}

		for(int j=0;j<list.size();j++)	{
			int c=0;
			for(int i=0;i<r.length;i++) {
				if(r[i].equals(list.get(j))) {
					c++;
				}

			}
			
			if(c!=1) {
				result += c;

			}	


		}	

		return result;

	}
	
	public static void main(String[] args) {
		
		String[] str = {"1","2","aa","1", "aa"};
		int count = getDup(str);
		System.out.println(count);	
		                    
	}

}
