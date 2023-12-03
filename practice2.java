package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Jar_Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage()timeouts().implicitlywait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/register");
		driver.manage().window().maximize();
		
		//input[@name="firstname"]
		
	 driver.findElement(By.name("firstname")).sendKeys("facebookusername");
	Thread.sleep(3000);
	
		driver.findElement(By.id("facebook")).sendKeys("hi");
 
	
	}
	

}
