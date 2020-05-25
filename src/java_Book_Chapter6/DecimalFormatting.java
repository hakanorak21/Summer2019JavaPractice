package java_Book_Chapter6;

public class DecimalFormatting {
	
	public static void main(String[] args) {
		
		double amount = 7.05;
		System.out.println(amount);
		
		int allCents = (int)(Math.round(amount*100));
		int dollars = allCents / 100;
		int cents = allCents % 100;
		
		System.out.print("$");
		System.out.print(dollars);
		System.out.print(".");
		if(cents < 10)
			System.out.print(0);
		System.out.println(cents);
		
	}

}
