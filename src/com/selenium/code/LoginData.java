package com.selenium.code;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginData {
	WebDriver driver;
@Test
public void getCode() {
	driver=LaunchBrowser.launchBrowser(driver);
	driver.get("https://jio.com");
}
}
