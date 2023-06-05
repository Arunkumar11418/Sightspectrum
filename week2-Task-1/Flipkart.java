package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//search box
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("mobile case"+ Keys.ENTER);
		Thread.sleep(2000);
		//min value 100
		WebElement minvalue=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div/div/div/section[2]/div[4]/div[1]/select"));
		Select value1 = new Select(minvalue);
		Thread.sleep(2000);
		value1.selectByIndex(1);
		
		//max value =2000
		WebElement highvalue=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/div/div/section[2]/div[4]/div[3]/select"));
		Select value2 = new Select(highvalue);
		Thread.sleep(2000);
		value2.selectByIndex(6);
		
			
			
			}
			
		}
		
		
		
		
	
		
		




