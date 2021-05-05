package com.qa.testscript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.GooglePages;

public class GoogleAutomation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		GooglePages gp=new GooglePages(driver);
		driver.get("https://www.google.com/");
		String passTitle="automation testing";
		gp.getTitle().sendKeys(passTitle);
		gp.getSubmitButton().sendKeys(Keys.ENTER);
		String title= driver.getTitle();
		System.out.println(title);
		String title2=passTitle+"-google search";
		if(title2.equals(title))
		{
			System.out.println("both are same");
		}
		else {
			System.out.println("both are not same");
		}
		driver.close();
	}

}
