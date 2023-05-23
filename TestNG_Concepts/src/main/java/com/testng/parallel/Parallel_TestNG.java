package com.testng.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_TestNG {
	static WebDriver driver;

	@Test
	public void openGoogle() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.quit();
	}

	@Test
	public void openBing() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.bing.co.in");
		driver.quit();
	}
}
