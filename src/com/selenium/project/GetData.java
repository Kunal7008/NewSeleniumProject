package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GetData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.irctc.co.in");
       WebElement element= driver.findElement(By.xpath("//li[@class='menu-list header-icon-menu ng-star-inserted']/a[text()=' LOYALTY ']"));	
Actions act= new Actions(driver);
act.moveToElement(element).perform();
	}

}
