package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.print("Test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.print("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.print("After Test");
  }

}
