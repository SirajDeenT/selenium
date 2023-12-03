package test;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String ActualResult = driver.getTitle();
		String ExpectedResult ="Facebook – log in or sign up";
		
		//System.out.println(title);
		
		if(ActualResult.equals(ExpectedResult))
					
				{
					System.out.println("pass: facebook opened sucess");
				}else
				{
					System.out.println("fail:facebook not opened sucess");
					driver.quit();
				}
	}
	

}
