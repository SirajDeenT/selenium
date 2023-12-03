package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google3links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vadamalayan.org/");
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	System.out.println(alllinks.size());
	
	for(int i=0;i<alllinks.size();i++)
	{
		System.out.println(alllinks.get(i).getAttribute("href"));
	}


	}

}
