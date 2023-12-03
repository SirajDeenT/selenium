package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement text = driver.findElement(By.name("q"));
		text.sendKeys("java");
		System.out.println(text.getSize());
		text.sendKeys(Keys.ENTER);
		
		//WebElement button = driver.findElement(By.tagName("btnK"));
		//button.submit();
		
		List<WebElement> list1  = driver.findElements(By.tagName("a"));
		
	
		
		System.out.print(list1.get(4).getAttribute("href"));
		
		
		
	
		
		

	}

}
