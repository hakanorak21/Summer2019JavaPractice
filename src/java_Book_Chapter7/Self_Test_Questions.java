package java_Book_Chapter7;

public class Self_Test_Questions {
	
	public static void main(String[] args) {
		
		//Question 7
		SalesAssociate[] entry = new SalesAssociate[3];
		for (int i = 0; i < entry.length; i++) {
			entry[i] = new SalesAssociate("Jane Doe", 5000);
		}
		//Lesson learned:
		//Creating an array of objects does not create the objects.
		//So, we have to call the constructor separately.
		
		
	}
	
	//Question 10
	public static void showArray(char[] arr) {
		
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]);
		System.out.println();
		
		for(char each: arr)
			System.out.println(each);
		System.out.println();
						
	}
	
	public static double[] getArrayOfHalves(double[] arr) {
		
		double[] temp = new double[arr.length];
		for (int i = 0; i < temp.length; i++)
			temp[i] = arr[i]/2.0;
		return temp;
		
	}

}
