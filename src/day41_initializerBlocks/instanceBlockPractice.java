package day41_initializerBlocks;

public class instanceBlockPractice {
	
	public String name = "Shirin";
	
	
	public instanceBlockPractice(){
		this(1);
		name = "Dinara";
		//this(1); // constructor must be called first
	}
	
	public instanceBlockPractice(int a){
		name = "Muhtar";
	}
	
	{
		System.out.println("Mihray");
		name = "Mihray";
	}
	
	{
		System.out.println("Hatice");
		name = "Hatice";
	}
	
	public static void main(String[] args) {
		
		instanceBlockPractice obj = new instanceBlockPractice();
		System.out.println(obj.name); // Dinara
		System.out.println();
		
		obj.name = "Aijamal";
		System.out.println(obj.name); // Aijamal
		System.out.println();
		
		instanceBlockPractice obj2 = new instanceBlockPractice();
		System.out.println(obj2.name);
		System.out.println();
		
		instanceBlockPractice obj3 = new instanceBlockPractice(1);
		System.out.println(obj3.name);
		
	}	

}
