package office_Hours;

public class iPhone_X extends iPhone {
	
	String color;
    
    public void faceID() {
        System.out.println("iPhone_x speciality");
    }
    
    @Override
    public void size() {
        System.out.println("iPhone_x size is 7");
        
    }
    
    public static void main(String[] args) {
		iPhone_X phone = new iPhone_X();
		System.out.println(phone.PHONE_NAME);
		//phone.PHONE_NAME = "New"; //Final
		
		System.out.println(phone.getAppleID());
		phone.setAppleID(123);
		System.out.println(phone.getAppleID());
		
		phone.faceID();
		phone.size();
		int price = phone.tellPrice("iPhone_X");
		System.out.println("$" + price);
		
		int a = iPhone.applePay;
		System.out.println(a); //Default int
		
		int b = iPhone_X.applePay;
		System.out.println(a); //Default int
		
		//Have access to default, protected, and public 
		//instance variables of the super class
		String color = phone.color;
		System.out.println(color);
		
		System.out.println(phone.storage);
		
		System.out.println(phone.price);
		
		//System.out.println(phone.appleID); //Private variable!
		
	}

}
