package test1;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel {
	public class Login {
		
		String[][]data=null ;
		WebDriver driver;
				
			
			
			
			
			

			@DataProvider(name="loginData")
			public String[][] loginDataProvider()throws BiffException,IOException {
				 data=getExcelData();
		          String[][] testData = null;
				return testData;
			}
			
			public String[][] getExcelData() throws BiffException ,IOException
			{
				FileInputStream excel = new FileInputStream(" C:\\new.xlsx");
			
          Workbook workbook = Workbook.getWorkbook(excel);
          
          Sheet sheet = workbook.getSheet(0);
          int rowCount = sheet.getRows();
          int coloumnCount = sheet.getColumns();
          String testData[][]= new String[rowCount-1][coloumnCount];
          for(int i =1;i<rowCount;i++){
        	  for(int j=0;j<coloumnCount;j++){
        		  
        	  
        		 
				testData[i-1][j]=sheet.getCell(j,i).getContents();
        	  }
          }
		return testData;
         
			}
			@BeforeTest
			public void beforeTest(){
				ChromeOptions chromeOptions = new ChromeOptions();
				
				WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver(chromeOptions);
				
			}
			@AfterTest
			public void afterTest(){
				driver.quit();
			}
			@Test(dataProvider="loginData")
			public void loginWithBothCorrect(String uName,String pword)
			{
		
			
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			WebElement userName=driver.findElement(By.id("txtUsername"));
			userName.sendKeys(uName);
			
			WebElement password=driver.findElement(By.id("txtPassword"));
			password.sendKeys(pword);
			
			WebElement loginButton=driver.findElement(By.id("btnLogin"));
			loginButton.click();
			driver.quit();
			
			
			
			
			
			

			}
		}

}
