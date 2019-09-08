package day09_Review;

public class Quiz 
{
	public static void main(String[] args) 
	{
		// Question 1
		boolean a = !!!!!false;
		System.out.println(a);
		
		// Question 2
		boolean result = !false != ("Batch12" != "Best Batch Ever");
		//					true != true 
		//						false
		System.out.println(result);
		
		// Question 3
		int x = 100;
		double y = x += 100/20;
		//	   y = 100 + 5 
		// 	   y = 105
		System.out.println(x);
		System.out.println(105.0 > 105);
		
		// Question 4
		// Elimination :-)
		
		// Question 5
		boolean A = 128 > '9'|| 128 == 127;
		//				true || false ==> true
		System.out.println(A);
		
		// Question 6
		boolean StupidOperators = 10 >= 20 && 'a' > 'b';
		// 							false  &&	false   ==> false
		System.out.println(StupidOperators);
		
		// Question 7
		int num1 = 999999;
		int num2 = 10;
		System.out.println(num1 * num2 / 10 % num1);
		
		// Question 9
		int z = 100;
		// System.out.println("z > 100 is:" + H); compilation error because 
		//										  H is not defined yet.
		// boolean H = z>100;
		
		// Question 10
		System.out.println(5 + 7 + "8"); // Output string
		System.out.println("8" + 5 + 7); // Output string
		
		// Question 11
		boolean test;
		test = 1 + 11 + "3" == "123";
		System.out.println(test);
		//					12 +    "3" == "123"
		//					      "123" == "123"
		//								True
		String str = "Cybertek";
		System.out.println(str + 2019 + test + 'C');
		
		
		// Question 12
		int numberA = 100;
		numberA += 300;
		System.out.println(numberA++ + " " + numberA); // 400 401
		
		// Question 13
		int B = 100;
		int C = B++;
		
		// Question 14
		System.out.println((10 * 2) / (5 * 4) * 1000 / 10 % 100);
		// 					20 / 20 * 1000 / 10 % 100
		//					1 * 1000 / 10 % 100
		// 					   1000 / 10 % 100
		// 						100 % 100 ==> 0
		
	}

}
