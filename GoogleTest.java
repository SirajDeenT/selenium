package test1;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.Alert;  
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;



public class GoogleTest {
	
	@Test
	  public void google() {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
			
			driver.get("https://www.amazon.in/");
			
			System.out.println("search box located");
			
	}
			
			
		@Test
		
			public void dragAndDrop() {
			
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			
				
				driver.get( "http://demo.guru99.com/test/drag_drop.html" );
				
				WebElement from = driver.findElement(By.xpath(  "//*[@id='credit2']/a"));
				WebElement to = driver.findElement(By.xpath(" //*[@id='bank']"));					
						Actions act = new Actions(driver);
						act.dragAndDrop(from,to).build().perform();
						
			}
			
			@Test
			
			public void dropAnddown() {
				
				ChromeOptions chromeOptions = new ChromeOptions();
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver(chromeOptions);
				
				driver.get("https://demo.guru99.com/test/newtours/register.php");
				WebElement S = driver.findElement(By.name("country"));
				Select D = new Select(S);
				
				D.selectByVisibleText("INDIA");
				
				
				
			}
			

	  
	  @BeforeTest
	  public void startCar() {
		 // System.setProperty("webdriver.chrome.driver"," D:\\Jar_Files\\chromedriver.exe");
		  System.out.println("before test");
	  }

	  @AfterTest
	  public void stopCar() {
		  System.out.println("after test");
	  }

	}	
	
	