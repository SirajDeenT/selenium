package test;

import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.



public class Drag {

	

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	String URL = (" https://the-internet.herokuapp.com/drag_and_drop");
	
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	
	Actions builder = new Actions(driver);
	WebElement from = driver.findElement(By.id("column-a"));
	WebElement to  = driver.findElement(By.id("column-b"));
	
	builder.dragAndDrop(from,to).perform();
	
	String textTo = to.getText();
	
	if(textTo.equals("B")) {
		
		System.out.println("Pass : file is dropped to target as expected");
	}
	else{
		System.out.println("Fail : file couldnt be dropped to target expected");
	}
	//driver.close();
		

	}

}
