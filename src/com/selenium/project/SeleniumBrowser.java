package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumBrowser {
	WebDriver driver;
@Test(invocationCount=4)
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Downloads\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://facebook.com");
	//driver.findElement(By.name("firstname")).sendKeys("kunal");
	driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Sujeet");
}
}
