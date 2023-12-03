package test1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get(" http://demo.automationtesting.in/Windows.html");
		String title = driver.getTitle();
		System.out.println("the title of main window is :"+title);
		WebElement tabbedwindow =driver.findElement(By.xpath("//*[@id='Tabbed']/a/button"));
		tabbedwindow.click();
		
		Thread.sleep(5000);
		
	Set<String>	windowIds=driver.getWindowHandles();
	Iterator<String> iter = windowIds.iterator();
	
	String mainwindow =iter.next();
	String tabwindow = iter.next();
	driver.switchTo().window(tabwindow);//moving or switching to tabbed window
		title = driver.getTitle();
		System.out.println("title of tabbed window is :"+title);
		Thread.sleep(5000);
		driver.switchTo().window(mainwindow);//moving or switch to main window
		title = driver.getTitle();
		System.out.println("title of main window after back from tabb window:"+title);
		
		driver.quit();

	}

}
