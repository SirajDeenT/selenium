package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/siraj/Downloads/chromedriver.exe");
		
WebDriver driver = WebDriverManager.chromedriver().create();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		
		driver.get("https://www.amazon.com");
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone x");
		
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		
		driver.findElement(By.linkText("Apple iPhone 11 (64GB) - White")).click();
		
		Select quantity = new Select(driver.findElement(By.cssSelector("#selectQuantity #quantity")));
		quantity.selectByIndex(1);
		//System.out.println(driver.getTitle());
		
		//System.out.println(driver.getCurrentUrl());
		
	
	
			
	
	
		
		 
		
		
	}

}
