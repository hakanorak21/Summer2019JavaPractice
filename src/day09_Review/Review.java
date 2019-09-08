package day09_Review;

public class Review 
{
	public static void main(String[] args) 
	{
		/*
		 Relational operators:
		 >  : greater than
		 >= : greater than or equal to 
		 <  : less than
		 <= : less than or equal to
		 == : equal to
		 != : not equal to
		 
		 Logical operators:
		 && : and
		 || : or
		 */
		
		System.out.println('Z' > 'A'); // true
		System.out.println('Z' >= 'A'); // true
		System.out.println('a' > 'A'); // true because capital letters come first on ASCII table
		System.out.println(false != true); // true
		
		byte X = 10; int Y = 10;
		System.out.println(X == Y); // true
		
		System.out.println(true == true && false != true);
		System.out.println(true != true || false == true);
		System.out.println("Monday" == "Funday" || true == !false);
		
		
	}

}
