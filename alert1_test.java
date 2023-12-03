package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public class alert1_test {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
         
	        // Alert Message handling                		
	        driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");	                 		
	        
	        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	        
	   WebElement text =  	driver.findElement(By.name("cusid"));text.sendKeys("53920");					
	     WebElement a = driver.findElement(By.name("submit"));a.submit();			
	        		        // Switching to Alert        
	        Alert alert = driver.switchTo().alert();		
	        // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();		
	        // Displaying alert message		
	        System.out.println(alertMessage);	
	       // Thread.sleep(5000);
	        //Accepting alert		
	        alert.accept();	
	        System.out.println("Alert Accepted");
	        driver.close();
	    }	

	

	}


