package day59_Exceptions;

public class TestCustomException {
	
	public static void main(String[] args) throws LunchTimeException {
		
		//throw new NoBreakTimeException();
		
		boolean StudentAskedForBreak = false;
		
		if(StudentAskedForBreak) {
			throw new NoBreakTimeException();
		}else {
			System.out.println("Continue class");
		}
		
		try {
			throw new NoBreakTimeException();
			
		} catch (NoBreakTimeException e) {
			System.out.println("No more Java!");
			
		}
		
		//throw new Exception();
		
		throw new LunchTimeException("Hungry"); //Fixed (passed) by throws keyword
		//Fixes compile error 
		
	}

}
