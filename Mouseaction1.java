package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikepedia.org/");
		Actions Action = new Actions(driver);
		driver.manage().window().maximize();
		WebElement text =driver.findElement(By.className("link-box"));
		Action.keyDown(text, Keys.SHIFT).build().perform();
		text.click();
		System.out.println("located");


	}

}
