package test;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
	WebElement UNCHECKED =	driver.findElement(By.xpath(" /html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input"));
	
	WebElement checked =  driver.findElement(By.xpath(" /html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));
		
		
		
		boolean status1 = UNCHECKED.isSelected();
		boolean status2 = checked.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement below20= driver.findElement(By.name("age"));
		below20.click();
		
		
		
	}

}
