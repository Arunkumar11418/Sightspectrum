package selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		 String parentwindow= driver.getWindowHandle();
		 System.out.println(parentwindow);
		 Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		Set<String> windowhandles =driver.getWindowHandles();
		List<String>list = new ArrayList<>(windowhandles);
		driver.switchTo().window(list.get(1));
		System.out.println("Second window title is " + " " +driver.getCurrentUrl());
		
		System.out.println(windowhandles);
		driver.switchTo().window(list.get(0));
		System.out.println("Parent window title is "+ " " +driver.getCurrentUrl());

	}
}


