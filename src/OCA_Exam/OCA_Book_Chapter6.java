package OCA_Exam;

public class OCA_Book_Chapter6 {

	public static void main(String[] args) {
	
		OCA_Book_Chapter6 obj = new OCA_Book_Chapter6();
		
		try {
			System.out.println("Trying");
			obj.fall();
			System.out.println("Tried");
		}catch(Exception e) {
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}
		
		String[] animals = new String[0]; //No compile error!
		//System.out.println(animals[0]); //Unchecked exception
		
		//Integer.parseInt("abc"); //NumberFormatException

	}
	
	void fall() throws Exception{ 
		throw new Exception();
	}

}
