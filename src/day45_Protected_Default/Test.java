package day45_Protected_Default;

import day45_Inheritance.Protected_VS_Default;

public class Test extends Protected_VS_Default{
	
	/**
	//Inherited:
	protected String name;
	String ID;
	
	protected void printHello() {
		System.out.println("Hello");
	}
	
	void printHola() {
		System.out.println("Hola");
	}
	*/
	
	public static void main(String[] args) {
		
		/*
		Protected_VS_Default obj = new Protected_VS_Default();
		//obj.printHello(); //Protected not visible outside class
		//obj.printHola(); //Default not visible outside class
		//Only public is visible outside package
		*/
		Test obj = new Test();
		System.out.println(obj.name);
		//System.out.println(obj.ID); //default (ID) is not inheritable
										//outside package
		obj.printHello();
		//obj.printHola(); //default not inheritable outside package
		
	}

}
