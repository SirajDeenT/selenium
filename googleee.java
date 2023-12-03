package test;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleee {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			WebElement text = driver.findElement(By.name("q"));
			System.out.println("textboxlocated");
			text.sendKeys("java"+Keys.ENTER);
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        // Thread.sleep(3000);
			
			

	}

}
