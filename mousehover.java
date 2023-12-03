package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.get("http://www.google.com");
	       WebElement ele = driver.findElement(By.id("gbqfba"));
	       Actions action = new Actions(driver);
	       action.moveToElement(ele).build().perform();
	    	

	}

}
