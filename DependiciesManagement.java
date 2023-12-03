package testNG;

import org.testng.annotations.Test;

public class DependiciesManagement {
	@Test(enabled=true)

	public void highSchool(){
		System.out.println("High school");
	}
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary(){
		System.out.println("higher secondary");
	}


	@Test(dependsOnMethods="higherSecondary")
public void engineering(){
		System.out.println("college");
	}
		
	
}
