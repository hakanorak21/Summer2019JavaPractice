package day42_OOP_Encapsulation;

/**
OOP: Object oriented programming

Class:
		data/attribute ==> instance variables
		actions ==> instance methods
		
Instance variable: belongs to the object. Each object has its own copy.

Encapsulation: hides the instance variable (hiding the data)
				1. Private access modifier
				2. Grants other classes to access private data  

Private: Only visible within the class (access modifier) 

Getter (read only): "public" instance method
					return type should match private data type
					no parameters
					
Setter (modify data): 	"public void" instance method
  						parameter (MUST match private instance variable)
				


*/

public class TestData {
	
	/**
	 Name
	 ID
	 */
	
	private String Name = "Bekir";
	private int ID = 200;
	
	public String getName() {
		return Name;
	}
	
	public int getID() {
		return ID;
	}
	
	//setter: changes the value
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	
	
	

}
