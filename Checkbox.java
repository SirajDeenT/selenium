package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver" ,"C:\Users\siraj\Downloads\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(" https://formstone.it/components/checkbox/");
		WebElement two = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[1]/div/div[2]/div/div[1]/form/fieldset[2]/div/div/div")); two.isSelected();
	two.click();
	

	}

}
