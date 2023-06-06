package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		
		
		//single frame
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		
		WebElement singleframe= driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(singleframe);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("arun");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		//Multiple frame
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		WebElement multiple1= driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(multiple1);
		
		WebElement multiple2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(multiple2);
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("annakumar");
		
		
		
		
		
		
		

	}

}
