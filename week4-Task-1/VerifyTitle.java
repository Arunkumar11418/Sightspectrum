package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title ="Facebook – log in or sign up";
		
		String title1 =driver.getTitle();
		System.out.println(title1);
		
		if(title.equalsIgnoreCase(title1)) {
			System.out.println("Title matches");
		}
		else {
			System.out.println("Title doesnt matched");
		}
		
		
		
		
	}

}
