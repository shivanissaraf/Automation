package companyWaySelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.output.DeferredFileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		
		public class ExcelSheetHandlingWay2 {

					
		public static void main(String[] args) throws IOException, InterruptedException {
				
				//data
				//Create Workbook & SpreedSheet
				//create logic
				//Write
				//[] by default 0 & new int [Here will give no. of information] 
				int [] serial = new int[4]; // count = 4 & indexing 0-3
				for(int i =0; i<serial.length; i++) { // for column 0
					
					serial[i] = i+1; // 1
					
				}
				
				//column 1
				String [] name = new String[4];
				name[0] = "Country";
				name[1] = "India";
				name[2] = "France";
				name[3] = "USA";
				
				//column 2
				
				String[] cname = new String [4];
				cname[0] = "Capital";
				cname[1] = "New Delhi";
				cname[2] = "Paris";
				cname[3] = "D.C";
				

				
				//Creating Workbook
				XSSFWorkbook wb = new XSSFWorkbook();
				
				//creatingSpreadSheet
				XSSFSheet sheet = wb.createSheet("country");
				
				//creating rows
				XSSFRow row;
				row = sheet.createRow(0);

				
				// creating column
				Cell cell0 = row.createCell(0);
				Cell cell1 = row.createCell(1);		
				Cell cell2 = row.createCell(2);

				
				//Logic
				
				for(int i=0; i<serial.length; i++) { // for row
					row = sheet.createRow(i+1);
					
					for(int j=0; j<3; j++) { // for column
						
						Cell cell = row.createCell(j);
						
						if(cell.getColumnIndex()==0) {//printing 1st column serial
							
							cell.setCellValue(serial[i]); 
						}
						
						else if(cell.getColumnIndex()==1) {//printing 2nd column name

							cell.setCellValue(name[i]);
						}

						else if(cell.getColumnIndex()==2) {//printing 3rd column stagename

							cell.setCellValue(cname[i]);
						}
					}
				}
				
				//Writing in excel sheet
				
				String path = "C:\\Users\\akash\\OneDrive\\Desktop\\country.xlsx";
				FileOutputStream out = new FileOutputStream(path); // to write
				wb.write(out);
				System.out.println("Excel Sheet Created");
				
				out.close();

				
				
			}
		

		
		
		
	}

