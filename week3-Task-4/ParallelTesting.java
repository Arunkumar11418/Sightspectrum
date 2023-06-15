package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	WebDriver driver;
	@Test
	public void openGoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	
	public void openGecko()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\geckodriver.exe");
		driver= new FirefoxDriver() ;
		driver.get("https://www.mozilla.org/en-US/firefox/new/?redirect_source=firefox-com");

}
}
