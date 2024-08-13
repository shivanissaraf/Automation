package companyWaySelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetHandlingWay1 {
	
	
	public void ns() throws EncryptedDocumentException, IOException {

	// 1. Download, Install and Configure Apache POI Jar Files in Project
	// 2. Need Create/Created Test Data Excel Sheet to fetch the data

	String path = "C:\\Users\\shivani\\OneDrive\\Desktop\\TestData.xlsx";
	
	// 3. Start connect the file with code using class-object 

	FileInputStream f = new FileInputStream(path);
	
	// I. here we are adding details from where we want to retrieve the data. getStringCellValue() is used for string Type
	String value = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println("Text is = "+value);

	//To find out what type of data is stored in our excel sheet, we use get getCellType() is used
	//CellType value1 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getCellType();
	//System.out.println("CellType" + value1);
	
	
	// II. to get the numeric data we use double datatype because here int is not supported. And to get numeric o/p we use getNumericCellValue();
	double value1 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
	System.out.println("Text is = "+value1);

	
	
	}

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ExcelSheetHandlingWay1 obj = new ExcelSheetHandlingWay1();
		obj.ns();
		
		
		
	}
}
