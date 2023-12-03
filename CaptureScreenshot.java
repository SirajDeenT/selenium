package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/ ");
		TakesScreenshot screenshot = (TakesScreenshot) driver;
	File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
	File destinationfile=new File("C:\\Users\\siraj\\Downloads\\download\\first.png");
	FileHandler.copy(sourcefile, destinationfile);

	}

}
