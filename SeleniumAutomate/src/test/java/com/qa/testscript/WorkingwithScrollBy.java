package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkingwithScrollBy {
WebDriver driver;
Actions act;
JavascriptExecutor Js;
@BeforeMethod
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "F:\\Chrome\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	act=new Actions(driver);
	Js=(JavascriptExecutor)driver;
	
}
@AfterMethod
public void teardown() {
	driver.close();
}
@Test
public void scroll() {
	System.out.println("Ready to scroll");
	WebElement clickcareers=driver.findElement(By.linkText("Careers"));
	Js.executeScript("argument[0].scrollIntoview(true)",clickcareers);
	driver.findElement(By.linkText("Careers")).click();
	
}
}
