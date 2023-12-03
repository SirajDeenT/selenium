package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Element {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Jar_Files\\chromedriver.exe");
		
		WebDriver driver=  new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement search= driver.findElement(By.name("q"));
		System.out.println("search box located");
		search.sendKeys("java");
		

	}

}
