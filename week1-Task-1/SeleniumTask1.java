package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTask1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.name("firstname")).sendKeys("sight");
				driver.findElement(By.name("lastname")).sendKeys("spectrum");
				driver.findElement(By.name("reg_email__")).sendKeys("ssmepz20123@gmail.com");Thread.sleep(2000);
				driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ssmepz20123@gmail.com");Thread.sleep(2000);
				driver.findElement(By.name("reg_passwd__")).sendKeys("sightspectrum97");Thread.sleep(2000);
				
				WebElement day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
				Select d =new Select(day);
				d.selectByVisibleText("25");
				Thread.sleep(2000);
				
				WebElement month =driver.findElement(By.xpath("//select[@name='birthday_month']"));
				Select m = new Select(month);
				m.selectByVisibleText("Jun");
				Thread.sleep(2000);
				
				WebElement year= driver.findElement(By.xpath("//select[@name='birthday_year']"));
				Select y =new Select(year);
				y.selectByVisibleText("1996");
				Thread.sleep(2000);
				
				
				driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@name='websubmit']")).click();
				driver.quit();
		
	}

}
