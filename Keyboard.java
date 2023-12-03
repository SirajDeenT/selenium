package test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
	     
	      driver.get("http://www.uitestpractice.com/Students/Actions");
	      Actions actions= new Actions(driver);
	      actions.keyUp(Keys.CONTROL)
	      .click(driver.findElement(By.name("one")))
	      .click(driver.findElement(By.name("six")))
	      .click(driver.findElement(By.name("eleven")))
	      .keyUp(Keys.CONTROL)
	      .build().perform();
	      
	      Thread.sleep(2000);
	    //  driver.quit();
	      
	   //   driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	      

	}

	
		
	

}
