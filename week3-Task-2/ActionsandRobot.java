package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsandRobot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);

		// Drag and Drown
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));

		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(2000);
		a.dragAndDrop(src, des).perform();

		// Right Click
		WebElement click = driver.findElement(By.xpath("//a[text()='Java']"));
		a.contextClick(click).perform();
		Thread.sleep(2000);
		
//		//Robot
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		

	}

}
