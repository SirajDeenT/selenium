package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.concurrent.TimeUnit;

public class Url {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      driver.get("https://www.google.com/");
		
		

	}

}
