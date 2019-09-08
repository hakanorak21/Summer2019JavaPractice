package day08_ShortHandOperators;

public class LogicalOperators 
{
	public static void main(String[] args) 
	{
		/*
		&&: and logic / true && true 
		||: or logic / true || false => true
		  			   true || true  => true
		  			   false|| true  => true
		  			   false|| false => false 
		*/
		
		boolean ResultA = 9 == 0 && "Muhtar" == "good";
		System.out.println(ResultA);
		
		boolean ResultB = 8 > 5 && 7 == (8-2+1);
		//                true       true
		System.out.println(ResultB);
		
		boolean ResultC = !false != true && !false == !(!true);
		//					true != true &&  true  == true
		//                      false    &&  true
		System.out.println(ResultC);
		
		boolean A = "Monday" == "Funday" || 6 == 6;
		//					False        || True => True
		System.out.println(A);
		
		boolean B = true || false;
		System.out.println(B);
		
		boolean C = true || false || false;
		System.out.println(C);
		
		boolean D = true && true || false;
		System.out.println(D);
		
		boolean E = !(7 > 5 && 6 != 5) && (9 > 5 || 10 > 4);
		//           !true			   && true ==> false
		System.out.println(E);
		
	}

}
