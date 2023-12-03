package test;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.IOException;
import java.util.logging.LogManager;

import org.apache.log4j.lf5.viewer.LogTable;
import org.apache.logging.log4j.core.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {

	//private static XSSFWorkbook workbook;

	public static void main(String[] args) throws IOException {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
	 // WebDriverManager.chromedriver().setup();
		java.util.logging.Logger log = LogManager.getLogger(LogExample.class.getName());
	  

		FileInputStream fis = new FileInputStream("C:\\new.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
                    //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
                    //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
                   	System.out.println(cell);
		System.out.println(sheet.getRow(0).getCell(0));
		//String cellval = cell.getStringCellValue();
		
		

	}

}
