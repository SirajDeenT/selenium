package test1;
import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Workbook;


public class ExcelRead {

	 
		
	
	//private static XSSFWorkbook workbook;

	//How to read excel files using Apache POI
	
		public static void main (String [] args) throws IOException{
	                        //I have placed an excel file 'Test.xlsx' in my D Driver 
			FileInputStream fis=new FileInputStream("C:/new.xlsx");
			Workbook wb=(Workbook) WorkbookFactory.create(fis);
			int c = wb.getSheet("Sheet1").getRow(0).length;
			System.out.println(c);
			//Sheet s = wb.getSheet("Sheet1");
			//Row r = s.getRow(0);
			//Cell c = r.getCell(0);
			//String v = c.toString();
			//System.out.println(v);
		}
}


