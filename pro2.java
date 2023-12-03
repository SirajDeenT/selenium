package test1;

//import java.awt.List;
//import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pro2 {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		 
		 driver.get(" https://money.rediff.com/gainers");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		
	
	driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[4]"));
	
    List<WebElement> myList=driver.findElements(By.className("acc-toggle"));
    //To store all web elements into list

    List<String> all_elements_text=new ArrayList<>();
    //If you want to get all elements text into array list

    for(int i=0; i<myList.size(); i++){

        all_elements_text.add(myList.get(i).getText());
        //loading text of each element in to array all_elements_text
        System.out.println(myList.get(i).getText());
        Object obj = Collections.max(all_elements_text);

        System.out.println(obj);
    }

	
	}
}
	
			