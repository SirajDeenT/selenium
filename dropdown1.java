package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/register.php");
			WebElement S = driver.findElement(By.name("country"));
			Select D = new Select(S);
			
			D.selectByVisibleText("INDIA");
			
			//Thread.sleep(5000);
			
			//D.selectByVisibleText("PHILIPPINES");

	}

}
