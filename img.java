package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class img {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Jar_Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement s =driver.findElement(By.id("twotabsearchtextbox"));
		
		s.sendKeys("mobile");
		
		WebElement k =driver.findElement(By.id("nav-search-submit-button"));
				k.submit();
		
		List<WebElement> l1 =driver.findElements(By.tagName("img"));
		
		System.out.println(l1.size());
		
	

	}

}
