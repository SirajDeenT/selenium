package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;



public class promptalert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		   driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		   driver.manage().window().maximize();
		  
		   WebElement e = driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[3]/div/div/div[3]/div/div/div/div/center/button"));
		   e.click();
		   
		   Alert promptAlert  = driver.switchTo().alert();
		   
		  
		   System.out.println (promptAlert.getText());
		   
		   promptAlert.sendKeys("yes");
		   
		   Thread.sleep(10000);
		
		  
		   promptAlert.accept();
		   WebElement k = driver.findElement(By.xpath("//*[@id='demoone'] "));
		   System.out.println(k.getText());
		   driver.close();
		  }
		}


	


