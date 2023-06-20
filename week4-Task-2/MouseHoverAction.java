package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		


	}

}
