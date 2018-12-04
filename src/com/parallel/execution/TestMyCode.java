package com.parallel.execution;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestMyCode {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WIN10);

		ChromeOptions options= new ChromeOptions();
		options.merge(caps);
		String huburl="http://10.0.75.1:4444/wd/hub";
		WebDriver driver= new RemoteWebDriver(new URL(huburl),options);
		driver.get("http://jio.com");
		System.out.println("The Title is:"+driver.getTitle());

	}

}
