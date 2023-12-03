package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	Actions Action = new Actions(driver);

		WebElement text = driver.findElement(By.id("email"));

		text.sendKeys("123456");
		
		WebElement text1 = driver.findElement(By.id("pass"));

		text1.sendKeys("1234455");
		
		WebElement text3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));

        Action.moveToElement(text3).build().perform();
        
        text3.sendKeys(Keys.ENTER);
		
	}
	
}
