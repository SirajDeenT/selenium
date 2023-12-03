package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.FirefoxDriver;


public class JAVAS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// open webpage
		driver.get("https://google.com");

		// find the search textbar in JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Object searchTextbar = js.executeScript("return document.getElementById('lst-ib')");
		// we have to cast the returned object into webelement to access
		// all the webelement related methods
		((WebElement) searchTextbar).sendKeys("abc");

		/* (same as above) find the search textbar in selenium
		driver.findElement(By.id("lst-ib")).sendKeys("abc");/*
	}
}

		

	


