package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin"));
		driver.findElement(By.xpath("/html/body"))
		
		
		.click();

	}
}



