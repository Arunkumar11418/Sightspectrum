package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotsize {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Full screenshot
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\SSLTP11460\\Pictures\\eclipse screenshot\\fullscreenshot.png");
		FileHandler.copy(src,des);
		Thread.sleep(2000);
		
		//specific area
		WebElement specificarea= driver.findElement(By.xpath("//form[@method='post']"));
		File src1= specificarea.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\SSLTP11460\\Pictures\\eclipse screenshot\\specificarea.png");
		FileHandler.copy(src1, des1);
		Thread.sleep(2000);
		
		//specific element
		WebElement ele=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		File src2= ele.getScreenshotAs(OutputType.FILE);
		File des2 = new File("C:\\Users\\SSLTP11460\\Pictures\\eclipse screenshot\\specificelement.png");
		FileHandler.copy(src2, des2);
		Thread.sleep(2000);
		
		
		
		
}
}
