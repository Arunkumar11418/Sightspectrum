package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		 Implicit wait
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//
//		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		//Explicit wait
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ssmepz20123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sightspectrum97");
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3000));
//		WebElement delay =wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("login"))));
//		delay.click();
		
		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)			
				
				.withTimeout(Duration.ofSeconds(10)) 						
				.ignoring(NoSuchElementException.class);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		     		
		
	}

}
