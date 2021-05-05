package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Google_02 {
	public static void main(String[] args) {
		//open the browser
		System.setProperty("webdriver.chrome.driver", "F:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//launch the google url
		driver.get("https://www.google.com/");
		//search for automation testing
		WebElement Input=driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]input[1])"));
		Input.sendKeys("automation Testing");
		//submit the input
		driver.findElement(By.cssSelector("div.U3eUgb:nth-child(2) div.o3j99.ikrT4e.om7nvf:nth-child(3) div:nth-child(1) div.ABSBwf"));
		//check if the title is same as search term
		String Title = driver.getTitle();
		if(Title.contains("Automation Testing")) {
			System.out.println("Title is same as search term");
		}
		else {
			System.out.println("Title is not same as search term");
		}
		
	}
}
