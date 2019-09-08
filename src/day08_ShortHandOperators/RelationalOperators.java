package day08_ShortHandOperators;

public class RelationalOperators 
{
	public static void main(String[] args) 
	{
		/*
		 > : Greater than
		 < : Less than
		 >=: Greater than or equal to
		 <=: Less than or equal to
		 == : Equal to
		 != : Not equal to
		 */
		
		System.out.println(10 > 9);
		boolean resultA = 10 > 9;
		System.out.println(resultA);
		
		String s1 = Boolean.toString(resultA);
		System.out.println(s1);
		
		boolean A = ! true;
		System.out.println(A);
		
		boolean C = !false != !true;
		System.out.println(C);
		
		boolean g = false;
		System.out.println(!g);
		
		System.out.println(!true == false);
		
		
	}

}
