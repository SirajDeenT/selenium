package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;



public class DropDown {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		WebElement Fruits = driver.findElement(By.id(" fruits"));
		
	
		
		Select s = new Select(Fruits);
		s.selectByVisibleText(" Apple");
		
		
		
		WebElement country = driver.findElement(By.id("country"));country.submit();
		Select mycountry = new Select(country);
		mycountry.selectByValue("India");
	WebElement selectedcountry=	mycountry.getFirstSelectedOption();
	System.out.println(selectedcountry.getText());

	}

}
