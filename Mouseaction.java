package test;



	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	
	import java.security.Key;
	import java.util.*;
	public class Mouseaction { 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement text =driver.findElement(By.name("q"));
		
		Actions A = new Actions(driver);
		Actions e = A
				.moveToElement(text)
				.keyDown(Keys.SHIFT)
				.sendKeys("mobile")
				.keyDown(Keys.CONTROL)
				.sendKeys("A")
				.keyDown(Keys.CONTROL)
				.sendKeys("C");
		e.perform();
		System.out.println("located");
		driver.get(" https://www.amazon.in/");
		WebElement text1 = driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions B = new Actions(driver);
		Actions d = B
				.moveToElement(text1)
				.click()
				.keyDown(Keys.CONTROL)
				.sendKeys("V");
				d.perform();
		
		WebElement text2 = driver.findElement(By.id("nav-search-submit-button"));
		text2.click();
		driver.manage().window().maximize();
		
		
	}
	
	}
	
	
				
				
//SHIFT - GOOGLE -MOBILE- AMAZON - MOBILE
	//NO SHIFT - AMAZON - JUST MOBILE - ONLY SEARCHBOX
	
	
	


