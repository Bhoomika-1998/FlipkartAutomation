package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_RediffSignIn_01 {
	public static void main(String[] args) {
		//open the browser
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//launch the rediff url
		driver.get("https://www.rediff.com/");
		//get and print the title of home page
		String HomeTitle1=driver.getCurrentUrl();
		System.out.println(HomeTitle1);
		//click on sign in
		WebElement SignInLink = driver.findElement(By.linkText("SignIn"));
		SignInLink.click();
		//get and print the title of login page
		String LoginTitle1=driver.getCurrentUrl();
		System.out.println(LoginTitle1);
		//go back to the previous page using navigate method
		driver.navigate().back();
		//get the title and check if it is same as home page
		String HomeTitle2=driver.getCurrentUrl();
		if(HomeTitle1.equals(HomeTitle2))
		{
			System.out.println("Both are same");
		}
		else {
			System.out.println("both are not same");
		}
		//use forward method and get the page title and check if it is same as login page
		driver.navigate().forward();
		String LoginTitle2=driver.getCurrentUrl();
		if(LoginTitle1.equals(LoginTitle2))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("both are not same");
		}
		//close all browser entities
		driver.close();
	}
}
