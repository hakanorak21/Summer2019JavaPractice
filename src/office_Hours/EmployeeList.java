package office_Hours;

public class EmployeeList {
	
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		System.out.println(obj.getSSN());
		
		Employee obj2 = new Employee(123, "Employee", 33, 150000);
		System.out.println(obj2.getSSN());
		
	}

}
