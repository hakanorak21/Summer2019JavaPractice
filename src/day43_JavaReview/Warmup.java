package day43_JavaReview;

//First, we have to import the methods.
import static java.lang.System.out;
import static java.lang.Math.PI;
import java.text.DecimalFormat;

public class Warmup {
	
	public static void main(String[] args) {
		
		//Static import
		double value = PI * 5;
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		String formattedValue = twoDecimals.format(value);
		out.println(formattedValue);
		
	}

}
