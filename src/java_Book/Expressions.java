package java_Book;

public class Expressions 
{
	public static void main(String[] args) 
	{
		int x = 5, y = 15, z = 2, a = 3;
		double b = 3.0, result;
		
		result = x / y * z + y / a;
		System.out.println("result 1 = " + result);
		
		result = b * z / (y - a);
		System.out.println("result 2 = " + result);
		
		result = a * y/ x + b/z;
		System.out.println("result 3 = " + result);
		
		result = a / z + y / z;
		System.out.println("result 4 = " + result);
		
		result = b * a / z + x / z;
		System.out.println("result 5 = " + result);
		
		result = z % y + x / a; // 2 + 1 = 3
		System.out.println("result 6 = " + result);
		
		result = y % z + a / x + x / a; // 1 + 0 + 1 = 2
		System.out.println("result 7 = " + result);
		
	}

}
