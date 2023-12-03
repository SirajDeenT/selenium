package test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class google1 {

	public static  void main(String[] args ) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Jar_Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		
		driver.get("https://www.google.com/");
		
		 driver.manage().window().maximize();
		  
		
		
		
		
		//driver.close();
		
	}
	}


