package day48_MethodOverriding;

class WebDriver {
	
	protected void get() {
        System.out.println("Opens browser");
    }
    
}
class ChromeDriver extends WebDriver{
    
    @Override
    protected void get() {
        System.out.println("Opens chrome browser");
    }
    
}
class FireFoxDriver extends WebDriver{
    
    @Override
    public void get() {
        System.out.println("Opens firefox browser");
    }
    
}

final class Erhan extends Practice {//immutable
	
	private final String password = "CybertekBatch12";
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		//this.password = password; //Cannot change constant variable
	}
	
}
public class Practice {
	
	final static int num2 = 0; //Should be initialized with declaration
    
	public static void main(String[] args) {
		
		System.out.println(num2); //0 (default value)
        
        ChromeDriver driver1 = new ChromeDriver();
                    driver1.get();  // chrome browser
                    
        FireFoxDriver driver2 = new FireFoxDriver();
                    driver2.get();    // fire fox
                    
        final int num;
        num = 100;
        //num = 200; //constant variables cannot be re-assigned
        
        final String DOB = "11/04/2019";
        //DOB = "01012001"; //constant variable
    }
}
