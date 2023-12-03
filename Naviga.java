package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naviga {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		
		WebElement calendar = driver.findElement(By.id("datepicker"));
		calendar.sendKeys("01/31/2022" +Keys.ENTER);
		calendar.click();
		
		//
		WebElement nextButton = driver.findElement(By.xpath("//[@title='Next']"));
		nextButton.click();
		
		WebElement datetobegiven = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		datetobegiven.click();
		

	}

}
