package test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot  {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
driver.get( "http://demo.guru99.com/test/drag_drop.html" );
		
		WebElement from = driver.findElement(By.xpath(  "//*[@id='credit2']/a"));
		WebElement to = driver.findElement(By.xpath( "//*[@id='bank']/li"));					
				Actions act = new Actions(driver);
		 

		act.dragAndDrop(from,to).build().perform();
		File Screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try{
			FileUtils.copyFile(Screenshot,new File("  D:\\Test1.png"));
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
