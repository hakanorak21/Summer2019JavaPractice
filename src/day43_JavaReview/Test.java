package day43_JavaReview;

public class Test {

	/**
		//Question 5
		static 	int a;
				int b;


		// Question 6
		static String name = "Seyfo";
				String ID = "007";


		//Question 7
		public static String name;

		public Test(){
			name = "Aysel Dalcicek";
		}

		{
			name = "Muaz Gulen";
		}

		static {
			name = "Hakan Orak";
		}


		//Question 8
		int score;

		public Test() {
			score = 65;
		}

		static {
			//score = 55; //Compile error: instance variable inside static block!
		}

		{
			score = 75;
		}
	 

	//Question 9
	long total = 100; //instance variable

	
	public Test() {
		total -= 50; //Depends on the object
	}
	
	
	public Test(int total) {
		this(); //Calling the default constructor
		this.total += total; //this. is calling the instance variable 
	}

	{
		total *= 2;
	}

	static {
		int total = 20;
		total /= 2;
	}
	*/
	
	//Question 10
	static String studentName = "Erhan";
	
	{
		studentName = "Holly";
		
	}
	
	static {
		studentName = "Almaz";
	}
	
	public Test() {
		studentName = "Bekir";	
	}
	
	static {
		studentName = "Juline";
		
	}

	public static void main(String[] args) {

		/**
			//Question 5
			Test obj1 = new Test();
				obj1.b = 10; // 10
				obj1.a = 20; // 20 ==> 40

			Test obj2 = new Test();
				obj2.b = 30; // 30
				obj2.a = 40; // 40

			System.out.println(obj1.a + " " + obj1.b); // 40 10
			System.out.println(obj2.a + " " + obj2.b); // 40 30


			//Question 6
			System.out.println(name);
			//System.out.println(ID); // Compile error (instance variable needs an object)

			//Question 7
			System.out.println(name); // Only static block is executed

			// Question 8
			Test obj = new Test();
			System.out.println(obj.score);
		 

		//Question 9
		Test obj = new Test(25);
		System.out.println(obj.total);
		*/
		
		//Question 10
		Test obj = new Test();
		System.out.println(studentName); //static, instance, constructor
	}

}


