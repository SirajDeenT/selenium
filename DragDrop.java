package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class DragDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get( "http://demo.guru99.com/test/drag_drop.html" );
		
		WebElement from = driver.findElement(By.xpath(  "//*[@id='credit2']/a"));
		WebElement to = driver.findElement(By.xpath( "//*[@id='bank']/li"));					
				Actions act = new Actions(driver);
				act.dragAndDrop(from,to).build().perform();
				

	}

}