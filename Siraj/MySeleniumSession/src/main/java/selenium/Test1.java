package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	

			public static void main(String[] args) {
				//ChromeOptions chromeOptions = new ChromeOptions();
				//WebDriverManager.chromedriver().setup();
				//WebDriver driver = new ChromeDriver(chromeOptions);
				
				System.setProperty("webdriver.chrome.driver", "C:/Users/siraj/Downloads/chromedriver.exe");
 
				WebDriver driver = WebDriverManager.chromedriver().create();
				
				
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("http://demo.actitime.com");
				driver.findElement(By.id("username")).sendKeys("admin");
				driver.findElement(By.name("pwd")).sendKeys("manager");
				driver.findElement(By.id("loginButton")).click();
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));//logout
				String title=driver.getTitle();
				System.out.println(title);

	}

}
