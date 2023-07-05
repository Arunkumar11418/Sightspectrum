package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PasswordCorrect {
	
	@Test
	@Parameters({"username","password"})
	public void loginWithCorrectpassword(String uname,String pwd) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	
	//username
	WebElement username =driver.findElement(By.name("username"));
	username.sendKeys(uname);
	Thread.sleep(2000);
	
	//password
	WebElement password =driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys(pwd);
	
	//login
	WebElement loginbutton =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	loginbutton.click();
	Thread.sleep(3000);
	
	
	driver.quit();
	
	}
}



