package test1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {

	 
	

	

	    WebDriver driver;

	    @BeforeAll
	    static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	    }

	    @BeforeEach
	    void setupTest() {
	        driver = new ChromeDriver();
	    }

	    @AfterEach
	    void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    @Test
	    void test() {
	        System.out.println("hi");
	    }

	

	}


