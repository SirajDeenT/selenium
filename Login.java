package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
String[][]data= {
		{"Admin1","admin"},
		{"Admin1","dummy"},
		{"Admin","admin"},
		{"Admin","admin1"},
	};
	
	
	
	
	

	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		
		return data;
	}

	
	@Test(dataProvider="loginData")
	public void loginWithBothCorrect(String uName,String pword)
	{
	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(chromeOptions);
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	WebElement userName=driver.findElement(By.id("txtUsername"));
	userName.sendKeys(uName);
	
	WebElement password=driver.findElement(By.id("txtPassword"));
	password.sendKeys(pword);
	
	WebElement loginButton=driver.findElement(By.id("btnLogin"));
	loginButton.click();
	
	
	
	
	
	

	}
}
