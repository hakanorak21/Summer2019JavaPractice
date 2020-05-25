package day41_initializerBlocks;

public class instanceBlock {
	
	{
		System.out.println("Instance block1");
	}
	
	{
		System.out.println("Instance block2");
	}
	
	{
		System.out.println("Instance block3");
	}
	
	//Constructor overload
	public instanceBlock() {
		
		System.out.println("Constructor");
		
	}
	
	// Runs the program
	public static void main(String[] args) {
		
		instanceBlock obj = new instanceBlock(); // First, instance block,
												// Then, constructor
		instanceBlock obj2 = new instanceBlock();
		instanceBlock obj3 = new instanceBlock();
		
	}

}