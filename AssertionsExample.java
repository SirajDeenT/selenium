package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	
	String name = "Agni";
	@Test
	
	public void checkEqual(){
		/*if(name.equals("Agni"))
		{
			System.out.println("Name is equal");
		}else{
			System.out.println("Name is not equal");
			
		}*/
		
		Assert.assertFalse(name,"Agni" );
	}

}
