package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();
			
			//scroll up and down
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,5000)");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-5000)");	
			Thread.sleep(2000);
			
			// scroll upto a specific element
			 WebElement element= driver.findElement(By.xpath("//strong[text()='Fun and frolic']"));
			 js.executeScript("arguments[0].scrollIntoView(true);", element);Thread.sleep(2000);
			 
			 //Page up
			 js.executeScript("window.scroll(0,0)");
			 Thread.sleep(2000);
			 
			 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
}
