package office_Hours;

public abstract class iPhone {
    //1, no obj creation 
    //2 , abs method 
    
	
	//Instance variables
	final String PHONE_NAME = "iPhone";
	static int applePay; //static way : iPhone.static
	String color; //default 
    public double storage;
    protected double price ;
    private int appleID;
    
    //Abstract method
    public abstract void size(); //To be inherited
    
    //Default constructor 
    public iPhone() {
        
    }
    
    //Overloaded constructor
    public iPhone(String color, double storage, double price, int appleID) {
        
        this.color = color;
        this.storage = storage;
        this.price = price;
        this.appleID = appleID;
    }
    
    //Getter
    public int getAppleID() {
        return appleID;
    }
    
    //Setter
    public void setAppleID(int appleID) {
        this.appleID = appleID;
    }
    
    public void sell() {
        System.out.println("iPhone is sold");
    }
    
    public int tellPrice(String type) {
        
        if(type.equals("iPhone_X")) {
            return 999;
        }else if(type.equals("iPhone_Xs")){
            return 888;
        }
        
        return -1;
    }
    
}
