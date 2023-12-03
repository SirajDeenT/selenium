package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Auto {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get(" http://automationpractice.com/index.php");
		
		WebElement k =d.findElement(By.className("login"));
		System.out.print("Button located");
		k.click();
		WebElement g =d.findElement(By.className("ajax_cart_no_product"));
		System.out.print("Button located");
	g.click();


	}

}
