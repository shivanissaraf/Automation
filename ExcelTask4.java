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

		
		public class ExcelTask4 {

					
		public void task4() throws IOException, InterruptedException {
				
				//data
				//Create Workbook & SpreedSheet
				//create logic
				//Write
				//[] by default 0 & new int [Here will give no. of information] 
				int [] serial = new int[8]; // count = 8 & indexing 0-7
				for(int i =0; i<serial.length; i++) { // for column 0
					
					serial[i] = i+1; // 1
					
				}
				
				//column 1
				String [] name = new String[8];
				name[0] = "Real Name";
				name[1] = "Kim Namjoon";
				name[2] = "Kim Seokjin";
				name[3] = "Min Yoongi";
				name[4] = "Jung Hoseok";
				name[5] = "Park Jimin";
				name[6] = "Kim Taehyung";
				name[7] = "Jeon Jungkook";

				//column 2
				
				String[] stagename = new String [8];
				stagename[0] = "Stage Name";
				stagename[1] = "RM";
				stagename[2] = "Jin";
				stagename[3] = "Suga";
				stagename[4] = "Jhope";
				stagename[5] = "Jimin";
				stagename[6] = "V";
				stagename[7] = "Jungkook";

				
				//Creating Workbook
				XSSFWorkbook wb = new XSSFWorkbook();
				
				//creatingSpreadSheet
				XSSFSheet sheet = wb.createSheet("Bts");
				
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

							cell.setCellValue(stagename[i]);
						}
					}
				}
				
				//Writing in excel sheet
				
				String path = "C:\\Users\\akash\\OneDrive\\Desktop\\My Work HTML\\btsband.xlsx";
				FileOutputStream out = new FileOutputStream(path); // to write
				wb.write(out);
				System.out.println("Excel Sheet Created");
				
				
				Thread.sleep(5000);
				
				FileInputStream f = new FileInputStream (path);
				XSSFWorkbook w = new XSSFWorkbook(f);
				XSSFSheet s3 = w.getSheet("Bts");
				
				for (int i=0; i<9; i++) { // row
					 for(int j =0; j<3; j++) { // col
						 XSSFCell row1 =s3.getRow(i).getCell(j);
						 System.out.print(row1 + " ");
					 }

					 System.out.println();

			}
				
				
				out.close();
				
			}
		

		
		
		
	}

