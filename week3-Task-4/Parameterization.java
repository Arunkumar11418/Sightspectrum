package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Test
	@Parameters("Name")
	
	public void printName(String name) {
		System.out.println("Name of the Person is "+ name);
		
	}
	
	@Test
	@Parameters("Age")
	public void age(int a) {
		System.out.println("Age of Arun" +" "+ a );
	}

}
