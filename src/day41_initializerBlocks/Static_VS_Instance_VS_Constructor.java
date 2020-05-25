package day41_initializerBlocks;

public class Static_VS_Instance_VS_Constructor {
	
	static {
		System.out.println("Static block"); // Static block execution
		// does not depend on the object
		// Executed as soon as class is loaded, ONLY ONCE
	}
	
	{
		System.out.println("Instance block");
		//Instance block execution depends on the object
	}
	
	public Static_VS_Instance_VS_Constructor() {
		System.out.println("Constructor");
		//Depends on the object 
		//Executed after static and instance blocks 
	}
	
	public static void main(String[] args) {
		
		Static_VS_Instance_VS_Constructor obj = new Static_VS_Instance_VS_Constructor();
		System.out.println();
		Static_VS_Instance_VS_Constructor obj2 = new Static_VS_Instance_VS_Constructor();
		
	}

}
