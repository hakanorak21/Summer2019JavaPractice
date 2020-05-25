package day61_ExcelReader;

public class ExcelReadWriteTest {
	
	public static void main(String[] args) {
		String filePath = "/Users/horak/Desktop/Cybertek/Java/TestData.xlsx";
		String sheetName = "Sheet1";
		
		ExcelReadWrite obj = new ExcelReadWrite(filePath, sheetName);
		System.out.println(obj.readData(2, 1));
		
		obj.setData(2, 1, "Mehmet");
		System.out.println(obj.readData(2, 1));
	}

}
