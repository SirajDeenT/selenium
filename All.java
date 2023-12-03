package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.w3schools.com/html/html_examples.asp");
		 List<WebElement> allLinks =  driver.findElements(By.tagName("a"));
		 int count = allLinks.size();
		 System.out.println("Total Number of links: "+count);
		// WebElement link = allLinks.get(0);
		// String text = link.getText();
		// System.out.println(text);

	}

}
