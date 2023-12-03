package testNG;

import org.testng.annotations.Test;

public class ParameterizationExample {
	@Test
	@Parameterd("Name")
	
	public void printName(String name){
		System.out.println("Name is" + "name");
	}

}
