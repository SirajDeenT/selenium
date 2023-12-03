package test;

//import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.*;

public class Auto1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(" https://demoqa.com/text-box");
		
		WebElement textbox =driver.findElement(By.id("userName"));
		textbox.sendKeys("siraj");
		
	WebDriverWait driver =	new WebDriverWait(d,2000);
		WebElement wait1 = (WebElement) (ExpectedConditions.elementToBeSelected(By.className( "btn btn-light active")));
		//((WebElement) wait1).sendKeys("sirajmech364@gmail.com");
		wait1.click();
		
		
		
		//WebElement radio =d.findElement(By.className("btn btn-light active"));
			//	radio.sendKeys("sirajmech364@gmail.com");
				
		
		
		
		//System.out.println("single clicked by mouse");
		

	}

	private static Function ExpectedTobeclickable(By className) {
		// TODO Auto-generated method stub
		return null;
	}

}
