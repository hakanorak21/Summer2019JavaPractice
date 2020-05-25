package day39_JavaReview;

import java.text.DecimalFormat;

public class FormattingDecimals {
	
	/**
	DecimalFormatter class: presented in "java.text"
	*/
	
	public static void main(String[] args) {
		
		DecimalFormat format = new DecimalFormat("0.00");
		
		double b = 23.12376847623;
		
		//format(double): formats decimals and returns String value
		String newB = format.format(b);
		System.out.println(newB);
		
		double c = 45.56789044;
		System.out.println( format.format(c) );
		c = Double.parseDouble(format.format(c)); // String ==> Double
		System.out.println(c);
		System.out.println(c+1);
		
	}

}
