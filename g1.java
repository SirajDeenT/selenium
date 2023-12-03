package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class g1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Jar_Files\\chromedriver.exe");
		
		
			      WebDriver driver = new ChromeDriver();
			      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			      
			      driver.manage().window().maximize();
			      String url = "https://accounts.google.com/signin";
			      driver.get(url);
			      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			      WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
			      email_phone.sendKeys("abc@gmail");
			      
			      driver.findElement(By.id("identifierNext")).click();
			      WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			      WebDriverWait wait = new WebDriverWait(driver, 20);
			      wait.until(ExpectedConditions.elementToBeClickable(password));
			      password.sendKeys("your_password");
			      driver.findElement(By.id("passwordNext")).click();
			      
	}

	private static Object timeouts() {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

			     
			     
		


