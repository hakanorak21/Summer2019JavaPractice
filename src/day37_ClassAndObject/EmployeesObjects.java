package day37_ClassAndObject;

public class EmployeesObjects {
	
	public static void main(String[] args) {
		
		Employees Employee1 = new Employees();
		
		Employee1.EmployeeName = "Hakan Orak";
		Employee1.EmployeeID = 123;
		Employee1.JobTitle = "SDET";
		Employee1.Gender = 'M';
		Employee1.Salary = 150000;
		Employee1.SSN = 123456789;
		
		Employee1.getInfo();
		
	}

}
