package Replits;

public class Replit_159 {
	
	/**
	 c_profits gets the buyPrice(int) and sellPrice(int) and 
	 determines if there was a profit or loss.
	 it returns a string value that can be "profit","loss","no loss"

	for example:
	c_profis(100,1500)
	returns : "profit"

	c_profis(20,5)
	returns : "loss"

	c_profis(100,100)
	returns : "no loss"
	*/
	
	public static void main(String[] args) {
		
		System.out.println(c_profits(100, 1500));
		System.out.println(c_profits(20, 5));
		System.out.println(c_profits(100, 100));
		
	}
	
	public static String c_profits (int buyPrice,int sellPrice)
	  {
	    //your code here
		String profit;
		if (sellPrice > buyPrice)
			profit = "profit";
		else if (buyPrice > sellPrice)
			profit = "loss";
		else
			profit = "no loss";
		
	   return profit;
	  }
	
	

}
