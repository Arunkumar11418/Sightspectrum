package testNG;

import org.testng.annotations.Test;

public class SkipaTestCase {
	@Test(priority = 0)
	public void startthecar() {
		System.out.println("start the car");

	}
@Test(priority = 1)
	public void putfirstgear() {
		System.out.println("First Gear");
	}
@Test(priority = 2)
	public void putsecondgear() {
		System.out.println("Second Gear");
	}
@Test(priority = 3)
	public void putthirdgear() {
		System.out.println("Third Gear");
	}
@Test(priority = 4,enabled=true)
public void putfourthgear() {
	System.out.println("Fourth Gear");
}

}



