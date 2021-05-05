package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.qa.pages.AmazonPages;
import com.qa.pages.GooglePages;


public class BaseTestforGoogle {
	WebDriver driver;
	GooglePages Pages;
	SoftAssert SAssert;
	AmazonPages Apage;
	@Parameters({"Browser", "Url"})
	@BeforeClass
	public void SetUp(String Browser, String Url)
	{
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","F:\\Chrome\\chromedriver_win32\\chromedriver.exe");
       driver=new ChromeDriver();
     // driver.get("https://www.google.com");
		}
		else if(Browser.equalsIgnoreCase("edge")){
     
     System.setProperty("webdriver.edge.driver","F:\\msedgedriver.exe");
     driver=new EdgeDriver();
		}
		
		Pages =new GooglePages(driver);
		driver.get(Url);
		
		 Apage=new AmazonPages(driver);
		 driver.get(Url);
	
	SAssert=new SoftAssert();
}
	@AfterClass
	public void TearDown()
	{
		driver.close();
	}
	
		
}
