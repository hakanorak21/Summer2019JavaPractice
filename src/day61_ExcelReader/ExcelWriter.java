package day61_ExcelReader;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWriter {
	
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
		cell.setCellValue("NAME");
		System.out.print(cell.toString()+": ");
		
		//Write in a call
		Cell cell21 = sheet.getRow(1).getCell(0);
		cell21.setCellValue("Nurzat");
		System.out.println(cell21);
		//Changed only in Java but not in excel file.
		
		//Change Salary header and value
		Cell cell12 = sheet.getRow(0).getCell(1);
		cell12.setCellValue("SALARY");
		System.out.print(cell12.toString() + ": ");
		
		Cell cell22 = sheet.getRow(1).getCell(1);
		cell22.setCellValue("120000");
		System.out.println("$" + cell22.toString());
		
	}

}
