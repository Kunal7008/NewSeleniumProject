package com.selenium.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
@Test
public void setUp() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KUNAL BHATTA\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://jio.com");
}
}
