package testNG;

import org.testng.annotations.Test;

public class DependonMethods {
	

	

	
		@Test(enabled=false)
		public void startthecar() {
			System.out.println("start the car");

		}
	@Test(dependsOnMethods = "startthecar")
		public void putfirstgear() {
			System.out.println("First Gear");
		}
	@Test(dependsOnMethods = "putfirstgear")
		public void putsecondgear() {
			System.out.println("Second Gear");
		}
	@Test(dependsOnMethods ="putsecondgear")
		public void putthirdgear() {
			System.out.println("Third Gear");
		}
	@Test(dependsOnMethods = "putthirdgear")
	public void putfourthgear() {
		System.out.println("Fourth Gear");
	}

	}





