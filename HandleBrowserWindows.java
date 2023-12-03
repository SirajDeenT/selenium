package test1;

import java.util.Iterator;
import java.util.Set;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.naukri.com/");
		
	Set<String> handler	=driver.getWindowHandles();
	System.out.println(handler.size());
		Iterator<String> itr = handler.iterator();//set value get
		String mainwindow =itr.next();
		String popup1=itr.next();
		driver.switchTo().window(popup1);
		System.out.println(driver.getTitle());
		driver.switchTo().window(mainwindow);
		

	}

}
