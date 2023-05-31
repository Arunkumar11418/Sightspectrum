package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class AlertsandScreenshot {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.automationtesting.in/Alerts.html");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
				driver.findElement(By.xpath("//a[text()='Alerts']")).click();
				
				//Simple Alert
				driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
				driver.findElement(By.xpath("//button[contains(@onclick,'alertbox')]")).click();
				Alert a =driver.switchTo().alert();
				a.accept();
				driver.switchTo().defaultContent();
				
				//Confirm Alert
				driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
				driver.findElement(By.xpath("//button[contains(@onclick,'confirmbox')] ")).click();
				Alert a1 =driver.switchTo().alert();
				Thread.sleep(2000);
				a1.dismiss();
				
				//Prompt Alert
				driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
				driver.findElement(By.xpath("//button[contains(text(),'prompt box ')]")).click();
				Alert a2= driver.switchTo().alert();
				Thread.sleep(2000);
				a2.sendKeys("Automation");
				a2.accept();
				
				//Screenshot
				TakesScreenshot ts =  (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File des=new File("C:\\Users\\SSLTP11460\\Pictures\\eclipse screenshot\\alert.png");
				FileHandler.copy(source, des);
				Thread.sleep(2000);
				
				
				
				
				
				
				
				
				
				
		
	}

}
