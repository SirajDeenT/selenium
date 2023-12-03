package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class table {

	

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		
		driver.get(" https://money.rediff.com/gainers");
		List<WebElement> col = driver.findElements(By.xpath("//*[@id='leftcontainer']/tbody/tr[6]/td[3]"));
				System.out.println("no of coloumn "+col.size());
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/tbody/tr[8]/td[9]"));
				System.out.println("no of rows "+rows.size());
		
		List <WebElement> q = driver.findElements(By.xpath("//*[@id='leftcontainer']"));
				System.out.println("no of rows "+rows.size());
		List<WebElement> a = q.subList(0,10);
		
		
		
		for(WebElement r:a){
			System.out.println(r.getText());
		}

	}

}
