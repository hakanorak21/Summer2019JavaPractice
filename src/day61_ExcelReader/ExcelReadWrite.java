package day61_ExcelReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadWrite {
	/**
	 Create custom class that can read and write from/to excel.
	 
	 Instance variables: String filePath 
	 					 String sheetName,
	 					 FileInputStream file;
	 					 Workbook excelFile;
	 					 Sheet sheet;
	 					 Cell cell;
	 					 
	 Actions: readData(int row, int column) ==> String
	  		  writeData(int row, int column, setValue) ==> void  
	*/
	String filePath; 
	String sheetName;
	FileInputStream file;
	Workbook excelFile;
	Sheet sheet;
	Cell cell;
	
	//Constructor
	public ExcelReadWrite(String filePath, String sheetName) {
		this.filePath = filePath;
		this.sheetName = sheetName;
		
		try {
			file = new FileInputStream(filePath);
			excelFile = WorkbookFactory.create(file);
			sheet = excelFile.getSheet(sheetName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	//Getter method
	public String readData(int rowNumber, int columnNumber) {
		String data = "";
		cell = sheet.getRow(rowNumber-1).getCell(columnNumber-1);
		data = cell.toString(); 
		return data;
	}
	
	public void setData(int rowNumber, int columnNumber, String newValue) {
		cell = sheet.getRow(rowNumber-1).getCell(columnNumber-1);
		cell.setCellValue(newValue);
	}
	
}
