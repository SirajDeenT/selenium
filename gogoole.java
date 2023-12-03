package test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.webDriverManager;

public class gogoole {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		
		String ExpectedTitle="Google";
				if(title.equals (ExpectedTitle))
				{
					System.out.println("pass");
				}
					else{
						System.out.println("fail");}
				driver.close();
	}

				
		
		
		//driver.close();
				//
		

	}

