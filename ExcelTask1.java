package companyWaySelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTask1 {

	String path = "C:\\Users\\akash\\OneDrive\\Desktop\\My Work HTML\\TestData.xlsx";

	
	
	public void oneline() throws EncryptedDocumentException, IOException {
		for(int i=0; i<3; i++) { // row 
			for(int j =0; j<3; j++) { // col / cell
				FileInputStream f = new FileInputStream(path);
				String value =WorkbookFactory.create(f).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(value + " ");	
			}
		}
		System.out.println( );
		System.out.println( );

		
	}
	
	
	public void verticalline() throws EncryptedDocumentException, IOException {
		
		for (int i=0; i<3; i++) {
			for(int j =0; j<3; j++) {
			FileInputStream f = new FileInputStream(path);
			String value = WorkbookFactory.create(f).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			System.out.println(value + " ");	
			}
		}	
		System.out.println( );

	}
	
public void matrix1() throws EncryptedDocumentException, IOException {
	//col1 | row1  row2 row3
	//col2 | row1  row2 row3
	//col3 | row1  row2 row3

	   for(int j =0; j<3; j++) { // col
            for (int i=0; i<3; i++) { // row
			FileInputStream f = new FileInputStream(path);
			String value = WorkbookFactory.create(f).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			System.out.print(value + " ");	
			}
    		System.out.println( );

		}
		System.out.println( );

	}
	
public void matrix2() throws EncryptedDocumentException, IOException {
	//Row 1 | col1  col2 col3
	//Row 2 | col1  col2 col3
	//Row 3 | col1  col2 col3


         for (int i=0; i<3; i++) { // row
      	   for(int j =0; j<3; j++) { // col

			FileInputStream f = new FileInputStream(path);
			String value = WorkbookFactory.create(f).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			System.out.print(value + " ");	
			}
    		System.out.println( );

		}		
	}
	
	
	public static void main(String [] args) throws EncryptedDocumentException, IOException {
		ExcelTask1 a = new ExcelTask1();
		System.out.println("Excel data in one line" );
		a.oneline();
		
		System.out.println("Excel data in Vertical line" );
		a.verticalline();
		
		System.out.println("Excel data in Matrix1" );
		a.matrix1();
		
		System.out.println("Excel data in Matrix2" );
        a.matrix2();

	}
}
