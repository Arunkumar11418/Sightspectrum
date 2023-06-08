package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifyTitle( String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
						
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\geckodriver.exe");
			driver= new FirefoxDriver() ;

			
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 System.out.println(driver.getTitle());
		 driver.quit();
	
	
	

}
}