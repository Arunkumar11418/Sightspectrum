package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioandCheckbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/radio.html");
		 driver.manage().window().maximize();
		 
		 //select a radio button
		 WebElement button3= driver.findElement(By.xpath("//*[@id=\"vfb-7-3\"]"));
		 button3.click();
		 Thread.sleep(3000);
		 
		 //deselect option3 and select option1
		 WebElement button1=driver.findElement(By.xpath("//input[@value='Option 1']"));
		 button1.click();
		 
		 //checkbox
		 WebElement box1= driver.findElement(By.xpath("/html/body/div[4]/input[4]"));
		 box1.click();
		boolean a = box1.isSelected();
		System.out.println(a);
		// driver.quit();
		 
		 
		 
	
	}

}
