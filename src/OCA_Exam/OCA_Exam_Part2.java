package OCA_Exam;

public class OCA_Exam_Part2 {
	
	public static void main(String[] args) {
		
		//Question 14
		//ArrayList<int> list = new ArrayList<>();
		//ArrayList takes only objects!
		
		//Question 19
		String[][] chs = new String[2][];
		chs[0] = new String[2];
		chs[1] = new String[5];
		
		int i = 97;
		
		for (int a = 0; a < chs.length; a++) {
			for (int b = 0; b < chs.length; b++) {
				chs[a][b] = ""+i;
				i++;
			}
		}
		
		for (int a = 0; a < chs.length; a++) {
			for (int b = 0; b < chs[a].length; b++) {
				System.out.print(chs[a][b] + " ");
			}
		}
		
		//Question 36
		Short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long)s1+s2;
		//String s4 = (String)(s3*s2); //No type casting to String
		
	}
	
	//Question 34
	int count;
			
	public static void displayMSG() {
	//	count++;
	//	System.out.println("Welcome "+"Visit Count: "+count);
	}
	// static accepts only static!

}
