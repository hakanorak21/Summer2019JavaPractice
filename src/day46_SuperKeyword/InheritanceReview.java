package day46_SuperKeyword;

import day46_ProtectedVariable.ProtectedVariables; 

class Data{
	
	// static variables
	public static int num1 = 10;
	protected static int num2 = 20;
	private static int num3 = 30;
	static int num4 = 40;
	
	// instance variables
	public int num5 = 50;
	protected int num6 = 60;
	private int num7 = 70;
	int num8 = 80;
	
	static int staticNumData;
	int insNumData;
	
}

public class InheritanceReview extends Data{
//				sub						super
	
	static int staticNum;
			int insNum;
	/**
	 Inheritance: super and sub classes
	 
	 class 	A 	extends B
	 		sub			super
	 
	 sub-class: inherits features from the super class
	 			inheritance (visible [public and default] or protected)
	 			default: only in the same package
	 			private: not inheritable
	 
	 super-class: doesn't take anything from the sub class
	 */
	
	public static void main(String[] args) {
		
		/**
		Inherited:
		public static int num1 = 10;
		protected static int num2 = 20;
		static int num4 = 40;
		
		public int num5 = 50;
		protected int num6 = 60;
		int num8 = 80;
		*/
		
		//Direct access to static variables
		System.out.println(num1);
		System.out.println(num2);
		//System.out.println(num3); // private not inheritable
		System.out.println(num4);
		System.out.println("===========================");
		
		//Access to instance variables via sub object
		InheritanceReview obj = new InheritanceReview();
		System.out.println(obj.num5);
		System.out.println(obj.num6);
		//System.out.println(obj.num7); // private not inheritable
		System.out.println(obj.num8);
		System.out.println("===========================");
		
		//Access to instance variables via super object
		Data obj2 = new Data();
		System.out.println(obj2.num5);
		System.out.println(obj2.num6);
		//System.out.println(obj2.num7); // private not inheritable
		System.out.println(obj2.num8);
		System.out.println("===========================");
		
		ProtectedVariables obj3 = new ProtectedVariables();
		//obj3.nameProtected; protected not visible in different package
		//Because it is imported but not inherited
		System.out.println(obj3.namePublic);
		
		InheritanceReview objA = new InheritanceReview();
		objA.staticNum = 100;
		objA.insNum = 200;
		
		InheritanceReview objB = new InheritanceReview();
		objB.staticNum = 300;
		objB.insNum = 400;
		
		System.out.println(objA.staticNum); // 300
		System.out.println(objA.insNum); // 200
		System.out.println(objB.staticNum); // 300
		System.out.println(objB.insNum); // 400
		
		staticNumData = 500;
		System.out.println(staticNumData);
		Data objC = new Data();
		System.out.println(objC.staticNumData);
		objC.insNumData = 600;
		System.out.println(objC.insNumData);
		objC.staticNumData = 700;
		System.out.println(objC.staticNumData);
		System.out.println(staticNumData);
		
	}
	
}
