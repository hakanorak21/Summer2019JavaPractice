package day07_UnaryShortHand;

public class PPT_Tasks 
{
	public static void main(String[] args) 
	{
		
		// Slide 7
		int a  = 1; // -1
		a = -a-- + a++ / -a-- * --a;
		// -1 + 0 / -1 * -1
		// -1 / -1 * -1
		// 1 * -1
		// -1
		System.out.println(a);
		
		// Slide 8 - Task 1
		a = 50; // 50
		a = --a + a++ + a-- + a++;
		// 49 + 49 + 50 + 49
		// 197
		System.out.println(a);
		
		// Slide 8 - Task 2
		int x = 4;
		int y = x * 4 - x++;
		// 4 * 4 - 4
		// 16-4 = 12
		System.out.println(y);
		
		// Page 12
		x = 10;
		y = 20;
		x += y;
		System.out.println(x);
		
		a = 30;
		int b = 10;
		a -= b;
		System.out.println(a);
		
		x = 2;
		y = 3;
		x *= y;
		System.out.println(x);
		
		a = 10;
		b = 2;
		a /= b;
		System.out.println(a);
		
		x =20;
		y = 3;
		x %= y;
		System.out.println(x);
		
		// Page 13 - Task 1
		int z = 198;
		System.out.println("If the number is even, the result will be zero:");
		System.out.println(z%2);
		
		// Page 13 - Task 2
		byte A = 30;
		int B = b += a;
		System.out.println(B);
	}

}
