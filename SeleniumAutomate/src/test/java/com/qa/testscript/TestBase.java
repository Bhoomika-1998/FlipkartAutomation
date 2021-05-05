package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.GoogleSearchPage;

public class TestBase {
WebDriver driver;
GoogleSearchPage GoogleSearch;
@Parameters({"Browser","Url"})
@BeforeClass
public void SetUp(String Browser,String Url) {
	if(Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	else if(Browser.equalsIgnoreCase("edge")) {
		System.setProperty("WebDriver.edge.driver","F:\\msedgedriver.exe");
		driver=new EdgeDriver();
	}
	GoogleSearch=new GoogleSearchPage(driver);
	driver.get(Url);
}
@AfterClass
public void Teardown() {
	driver.close();
}
}
