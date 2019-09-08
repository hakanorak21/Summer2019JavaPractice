package day07_UnaryShortHand;

public class UnaryOperators 
{
	public static void main(String[] args) 
	{
		/*
		System.out.println(12.8/3);
		System.out.println(12.8%3);
		*/
		
		/*
		 +: positive
		 -: negative
		 ++: increment 
		 --: decrement
		 */
		
		/*
		int a = 10;
		int b = -a;
		System.out.println(b);
		
		int c = +b;
		System.out.println(c);
		
		int d = -c;
		System.out.println(d);
		
		int f = -(10);
		System.out.println(f);
		
		// Increments: pre-increment (++n), post-increment (n++)
		
		int num1 = 100;
		
		System.out.println(++num1); // Pre-increment
		System.out.println(num1++); // Post-increment
		System.out.println(num1);
		
		int num2 = num1++; // 102
		System.out.println(num2);
		System.out.println(num1);
		
		int x = 100;
		int y = x++ - 1;
		System.out.println(y);
		System.out.println(x);
		
		int z = 100;
		System.out.println(z--);
		System.out.println(z);
		
		int p = 50;
		p = --p + p++ + p-- + p++;
		System.out.println(p);
		
		//  49 + 49 + 50 + 49
		
		
		// Eyyup challenge
		double c1 = 20.00;
		double c2 = 80.00;
		double c3 = (c1 + c2) * 100.00;
		double c4 = c3 % 40.00;
		System.out.println(c4);
		
		
		
		int w = 1; //-1
		w = -w-- + w++ / -w-- * --w;
		//  -1   + 0  /  -1   *  -1
		//  -1   +    0   *  -1
		// -1 + 0
		// -1
		System.out.println(w);
		*/
		
		byte a = 1;
	    int b = 2;
	    a += b;
	    System.out.println(a);
				
		
		
	}

}
