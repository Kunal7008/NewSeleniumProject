package com.cricbuzzSite.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cricbuzz {
	WebDriver driver;
@Test
public void lauchCricbuzzSite() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Downloads\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cricbuzz.com");
	//driver.findElement(By.xpath("//a[text()='Schedule']")).click();
	WebElement element=driver.findElement(By.linkText("Schedule"));
	String expected= "Schedule";
	if(expected.equals(element)) {
	System.out.println("pass");	
	}
	else {
		System.out.println("fail");
	}
}
public void verifyPage() {
System.out.println("get my message")	
}

}
