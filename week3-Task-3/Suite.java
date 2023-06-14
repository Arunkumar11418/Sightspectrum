package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suite {
	WebDriver driver;
	long starttime;
	long endtime;

	@BeforeSuite
	public void browserLaunch() {
		 starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void openGoogle() {
		driver.get("https://www.google.com/");

	}

	@Test
	public void openYahoo() {
		driver.get("https://www.yahoo.com/?guccounter=1");
	}

	@Test
	public void openBing() {
		driver.get("https://www.bing.com/");
	}

	@AfterSuite
	public void quit() {
		driver.quit();
	 endtime = System.currentTimeMillis();
	 long totaltime=endtime-starttime;
	 System.out.println("Time Taken is"+ totaltime);

	}
}
