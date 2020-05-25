package day61_ExcelReader;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 Apache POI Library: Used for data driven testing.
 There are special classes and interfaces in order to
 retrieve data from excel files.
 
 How to add external jars and libraries to Java project?
 Project -> Properties -> Libraries -> Classpath -> Add external jar
 (This is instead of dependencies)
 */
public class ExcelReader {
	
	public static void main(String[] args) throws Exception {
		
		String filePath = "/Users/horak/Desktop/Cybertek/Java/TestData.xlsx";
		String sheetName = "Sheet1";
		
		//Reads file
		FileInputStream file = new FileInputStream(filePath);
		
		//Specially designed for excel files
		Workbook excelFile = WorkbookFactory.create(file);
		
		//Opens a spreadsheet
		Sheet sheet = excelFile.getSheet(sheetName);
		
		//Retrieves a cell
		Cell cell = sheet.getRow(0).getCell(0); 
		//String cellData = cell.getStringCellValue();
		//System.out.print(cellData + ": ");
		System.out.print(cell.toString() + ": ");
		
		Cell cell2 = sheet.getRow(1).getCell(0);
		//String cellData2 = cell2.getStringCellValue(); 
		System.out.println(cell2.toString());
		
	}

}
