package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFilling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sight");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("spectrum");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9080899988");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("sightsightspectrum");
		
		Select day = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		day.selectByVisibleText("24");
		
		Select month = new Select(driver.findElement(By.xpath("//select[@title='Month']")));
		month.selectByVisibleText("Sep");
		
		Select year = new Select(driver.findElement(By.xpath("//select[@title='Year']")));
		year.selectByVisibleText("1918");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		

	}
}
