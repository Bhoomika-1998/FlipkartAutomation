package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebDriverProgram {
	public static void main(String[] args) {
		//invoke the browser
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
	}
	

}
