package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//delete cookies
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
		//navigate
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//previous page
		driver.navigate().back();
		Thread.sleep(2000);
		
		//forward
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//refersh
		driver.navigate().refresh();		
		
		
		
		
		
	}

}
