package java_Book_Chapter6;

public class Practice {
	
	public static void main(String[] args) {
		
		double start = 3.56;
		int answer = (int)Math.round(start);
		System.out.println(answer); //4
		
		int lowAnswer = (int)Math.floor(start);
		int highAnswer = (int)Math.ceil(start);
		System.out.println(lowAnswer); //3
		System.out.println(highAnswer); //4
		
		System.out.println(Math.random()); // A random number between 0 and 1, including 0
		
		//Die rolling
		int die = (int)(6.0 * Math.random()) + 1;
		System.out.println(die); //one die
		
		int die2 = (int)(6.0 * Math.random()) + 1;
		System.out.println(die + " " + die2); //two dice
		
		double speed = 0.0;
		int approxSpeed = (int) Math.round(speed);
		long approxSpeed2 = Math.round(speed);
		
		//Self-test Q23
		double x = 1.1;
		Double x1 = x;
		String x2 = x1.toString();
		System.out.println(x2 + 1); //1.11
		System.out.println(x1 + 1); //2.1
		System.out.println(x + 1); //2.1
		Double.toString(x);
		
		//Self-test Q24
		String s ="123";
		int s1 = Integer.parseInt(s);
		System.out.println(s1+2); // 123 + 2 = 125
		System.out.println(s + 2); // 123 concats 2 = 1232
		
		//Self-test Q25
		String s2 = " 123";
		int s3 = Integer.parseInt(s.trim());
		System.out.println(s3);
		
		//Self-test Q26
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		
	}

}
