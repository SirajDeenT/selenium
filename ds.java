package test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

public class ds {

	public static void main(String[] args) throws IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     driver.navigate().to("http://www.leafground.com/pages/Alert.html ");
     
   //  TakesScreenshot screenshot =  (TakesScreenshot) driver;
//  File sourceFile =  screenshot.getScreenshotAs(OutputType.FILE);
   
 ////  File destinationFile = new File("D://sample.png");
  // FileHandler.copy(sourceFile,destinationFile);
   
  driver.findElement(By.xpath("//*[@id='wrapper']")).click();
     
    Robot robot = new Robot();
     java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
     Rectangle rectangle = new Rectangle(screenSize);
 BufferedImage source =    robot.createScreenCapture(rectangle);
 
File destinationFile = new File("D://robotsnap.png");
 ImageIO.write(source, "png", destinationFile);
     
	}


}
