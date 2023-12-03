package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class table1 {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 String row ="//*[@id='leftcontainer']/table/tbody/tr";
			int rowData =	driver.findElements(By.xpath(row)).size();
	
	driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[4]"));
	
	String firstPart = "//*[@id='leftcontainer']/table/tbody/tr[";
    String secondPart = "]/ td[4]";
	ArrayList<Integer> array = new ArrayList<Integer>();
	for(int i = 1;i<rowData;i++)
	{
		String finalPart = firstPart +i+secondPart;
	String price = driver.findElement(By.xpath(finalPart)).getText();
	Double dPrice = Double.parseDouble(price);
	int intPrice = dPrice.intValue();
	array.add(intPrice);
	 
	
	}
	
	Collections.sort(array);
	System.out.println(array.get(0));
	System.out.println(array.get(array.size()));
	
	}
}
	
			