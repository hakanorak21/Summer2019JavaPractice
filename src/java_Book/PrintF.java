package java_Book;

public class PrintF 
{
	public static void main(String[] args) 
	{
		int nFizzbrob = 2;
		int nFoobin = 1;
		int nFrotutti = 3;
		
		double priceFizzbrob = 1.33;
		double priceFoobin = 5.00;
		double priceFrotutti = 2.125;
		
		
		System.out.printf("%-10s %-10s %-10s %-10s\n","Item Name", "Total", "Quantity", "Unit Price");
		System.out.printf("%-10s %-10.2f %-10d %-10.3f\n","Fizzbrob", nFizzbrob*priceFizzbrob,
			nFizzbrob, priceFizzbrob);
		System.out.printf("%-10s %-10.2f %-10d %-10.3f\n","Foobin", nFoobin*priceFoobin,
				nFoobin, priceFoobin);
		System.out.printf("%-10s %-10.2f %-10d %-10.3f\n","Frotutti", nFrotutti*priceFrotutti,
				nFrotutti, priceFrotutti);
		
			
	}

}
