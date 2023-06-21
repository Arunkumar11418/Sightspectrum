package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"hide-textbox\"]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('displayed-text').value='Selenium';");
		
		String s = (String) js.executeScript("return document.getElementById('displayed-text').value");
		System.out.println("value enterd in hidden field: "+s);
		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click();
		driver.close();
		
		
		


	}

}
