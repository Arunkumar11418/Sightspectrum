package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SSLTP11460\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div[2]/form/button")).click();
		
		String location = "C:\\Users\\SSLTP11460\\Downloads";
		File filelocation =new File(location);
		File[] totalfile=filelocation.listFiles();
		
		for (File file : totalfile) {
			
			if(file.getName().equalsIgnoreCase("TestLeaf Logo.png"))
			{
				System.out.println("File is downloaded");
				break;
			}
			
		}
		
		
	}
	


}
