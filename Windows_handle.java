
package test;

import java.util.Iterator;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows_handle {

	

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		
		
		
		 driver.get("https://www.flipkart.com/");
	        driver.manage().window().maximize();
	      
	        String parentWin = driver.getWindowHandle();
	        
	        Set<String> windows = driver.getWindowHandles();
	        
	        System.out.println(windows.size());
	        Iterator<String> it = windows.iterator();
			while(it.hasNext()) {
	            
	            String childWin = it.next();
	            
	            if(!parentWin.equals(childWin)) {
	                
	            driver.switchTo().window(childWin);
	            
	            // Verify title of the child window
	            System.out.println(driver.getTitle());
	            String title=driver.getTitle();
	            System.out.println("title");
	            String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture ... ";
	            if(title.equals(expectedTitle))
	            	System.out.println("title match");
	            else
	            	System.out.println("Not match");
	            
	            //driver.quit();
	            
	            
	            
	            }      }   


	}

}
