package companyWaySelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTask3 {
	String path = "C:\\Users\\akash\\OneDrive\\Desktop\\My Work HTML\\TestData.xlsx";

	public void shivani() throws EncryptedDocumentException, IOException {

		FileInputStream f = new FileInputStream (path);
		XSSFWorkbook w = new XSSFWorkbook(f);
		XSSFSheet s3 = w.getSheet("Sheet3");
		
	    for (int i=0; i<2; i++) { // row
			 for(int j =0; j<5; j++) { // col
				 XSSFCell row1 =s3.getRow(i).getCell(j);
				 System.out.print(row1 + " ");
			 }

			 System.out.println();

	}
	
	}
	
	public void tushar() throws EncryptedDocumentException, IOException {
		String path = "C:\\Users\\akash\\OneDrive\\Desktop\\My Work HTML\\TestData.xlsx";

		FileInputStream f = new FileInputStream (path);
		XSSFWorkbook w = new XSSFWorkbook(f);
		XSSFSheet s3 = w.getSheet("Sheet3");
		
	    for (int i=2; i<3; i++) { // row
			 for(int j =0; j<5; j++) { // col
				 XSSFCell row1 =s3.getRow(i).getCell(j);
				 System.out.print(row1 + " ");
			 }

			 System.out.println();

	}
	
	}
	
	public void siddhi() throws EncryptedDocumentException, IOException {
		String path = "C:\\Users\\akash\\OneDrive\\Desktop\\My Work HTML\\TestData.xlsx";

		FileInputStream f = new FileInputStream (path);
		XSSFWorkbook w = new XSSFWorkbook(f);
		XSSFSheet s3 = w.getSheet("Sheet3");
		
	    for (int i=3; i<4; i++) { // row
			 for(int j =0; j<5; j++) { // col
				 XSSFCell row1 =s3.getRow(i).getCell(j);
				 System.out.print(row1 + " ");
			 }

			 System.out.println();

	}
	
	}
	
	public void pramol() throws EncryptedDocumentException, IOException {
		String path = "C:\\Users\\akash\\OneDrive\\Desktop\\My Work HTML\\TestData.xlsx";

		FileInputStream f = new FileInputStream (path);
		XSSFWorkbook w = new XSSFWorkbook(f);
		XSSFSheet s3 = w.getSheet("Sheet3");
		
	    for (int i=4; i<5; i++) { // row
			 for(int j =0; j<5; j++) { // col
				 XSSFCell row1 =s3.getRow(i).getCell(j);
				 System.out.print(row1 + " ");
			 }

			 System.out.println();

	}
	
	}
}