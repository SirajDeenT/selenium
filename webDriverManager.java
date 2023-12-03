package test;

//import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Alert;
public class webDriverManager {
public class alert_test {

	public void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
	
		
		WebDriver driver1 = new ChromeDriver();
        
        
        driver1.navigate().to("https://demoqa.com/alerts");   
  
        
        driver1.findElement(By.id("alertButton")).click();  
          
       
        Alert alert = (Alert) driver1.switchTo().alert();  
          Thread.sleep(10000);
          
        alert.accept(); 
        
        
       System.out.print("Alert accepted");
     
//C:\Program Files\Google\Chrome\Application\chromedriver_win32 (2)\chromedriver_win32 (1).zip
          
       
        //D:\Jar_Files\selenium-chrome-driver-3.141.59.jar
    }  
 


	}
}


