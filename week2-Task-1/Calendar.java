package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();

		Select month = new Select(driver.findElement(By.xpath("//select[@title='Change the month']")));
		month.selectByVisibleText("October");

		driver.findElement(By.xpath("//select[@title='Change the year']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[2]/option[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[2]/option[5]")).click();

		driver.findElement(By.linkText("4")).click();

	}
}