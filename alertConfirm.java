package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertConfirm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://demoqa.com/alerts");
        
        WebElement button=driver.findElement(By.id("confirmButton"));
        button.click();
        
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        String alertMessage= driver.switchTo().alert().getText();
        	
       System.out.println(alertMessage);	
      alert.accept();
    WebElement alertText=driver.findElement(By.xpath("//*[@id='confirmResult']"));
      System.out.println(alertText.getText());
       
       
      
       
	}

	}


