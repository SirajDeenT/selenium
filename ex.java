package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 
        driver.get("http://www.learn-automation.com");

        // Specify implicit wait of 30 seconds                                   
       driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

      // No login id is present on Webpage so this will fail our script.
        driver.findElement(By.id("login")).sendKeys(" Selenium Webdriver");

	}

}
