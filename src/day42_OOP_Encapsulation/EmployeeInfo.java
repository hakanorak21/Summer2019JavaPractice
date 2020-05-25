package day42_OOP_Encapsulation;

public class EmployeeInfo {
	
	/**
	 Name
	 SSN
	 Age
	 Salary
	 */
	
	private String Name;
	private long SSN;
	byte Age;
	double Salary;
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setSSN(long SSN) {
		this.SSN = SSN;
	}
	
	public long getSSN() {
		return SSN;
	}
	
	public void setAge(byte Age) {
		this.Age = Age;
	}
	
	public byte getAge() {
		return Age;
	}
	
	public void setSalary(double Salary) {
		this.Salary = Salary;
	}
	
	public double getSalary() {
		return Salary;
	}
	
}
