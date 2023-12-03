package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDroppable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,"D:\\Jar_Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement FROM = driver.findElement(By.xpath(""));
		
	
		WebElement TO = driver.findElement(By.xpath("/html/body/div[1]/div "));
		
		
		
		Actions actions = new Actions(driver);
		
		
		//actions.clickAndHold(FROM).moveToElement(TO).release(TO).build().perform();
		
		 actions.dragAndDrop(FROM, TO).build().perform();
		
		

	}

}
