package com.testng.suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Suite_TestNG {
//1. Aim Open Chrome And Go to Google,Bing,Yahoo and then Close Browser
	static WebDriver driver;
	long startTime;
	long endTime;
	long totalTime;

	@BeforeSuite
	public void launchBrowser() {
		startTime = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void openGoogle() {
		driver.get("http://www.google.co.in");
	}

	@Test
	public void openBing() {
		driver.get("http://www.bing.co.in");
	}

	@Test
	public void openYahoo() {
		driver.get("http://www.yahoo.co.in");
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.println("Total Time Taken : " + totalTime + " Ms");
	}
}
