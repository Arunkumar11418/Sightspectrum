package com.maven.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSLTP11460\\eclipse-workspace\\Maven\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    //launch Browser
	    driver.get("https://www.google.com/");
	    System.out.println("Browser launched successfully");
	}

}
