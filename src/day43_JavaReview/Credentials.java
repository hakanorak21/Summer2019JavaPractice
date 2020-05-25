package day43_JavaReview;

public class Credentials {
	
	/**
	 Encapsulation: hiding the instance variables
	 1. Hide the data by giving private access-modifier
	 2. Grants other classes get access to the private instance variable
	 through public getters/setters (aka accessors/mutators)
	 
	 	private: only visible (accessible) within the class
	 	
	 	 	getter: instance method, returns the private instance variable
	 	 			return-type MUST match private instance variable
	 	 			access-modifier needs to be public, because we want to
	 	 			call the method outside the class
	 	 			
	 */
	
	private String username = "Ibrohim";
	private String password = "Prichoska";
	
	//getters
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	//setters
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
