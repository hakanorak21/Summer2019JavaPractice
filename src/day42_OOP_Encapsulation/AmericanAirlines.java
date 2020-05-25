package day42_OOP_Encapsulation;

public class AmericanAirlines {
	
	public static void main(String[] args) {
		
	
	EmployeeInfo emrah = new EmployeeInfo();
		emrah.setName("Emrah");
		System.out.println(emrah.getName());
		emrah.setSSN(123);
		System.out.println(emrah.getSSN());
		emrah.setSalary(120000);
		System.out.println(emrah.getSalary());
		emrah.setAge((byte)33);
		System.out.println(emrah.getAge());
		
	}

}
