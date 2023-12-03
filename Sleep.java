package test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Sleep {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","D:\\Jar_Files\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement text = driver.findElement(By.name("q"));
	text.sendKeys("java");
		Thread.sleep(20000);
		driver.close();
		
		
		//20 seconds

	}

}
