package day46_SuperKeyword;

class parent {
	
	public parent(int a) {
		this("A");
		System.out.println("Parent Constructor int");
	}
	
	//Does not need to be called in the sub class
	//Rule: At least one constructor should be called
	public parent(String b) {
		System.out.println("Parent Constructor String");
	}
	
}

public class Practice extends parent {
	
	/*
	 //By default (invisible)
	 public Practice(){
	 	super();
	 */
	
	public Practice() {
		super(10);
		System.out.println("Sub Constructor");
	}
	
	public static void main(String[] args) {
		
		Practice obj = new Practice();
		
	}

}
