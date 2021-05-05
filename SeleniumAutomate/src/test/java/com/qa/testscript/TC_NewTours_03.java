package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.pages.GooglePages;
import com.qa.pages.NewToursPages;

public class TC_NewTours_03 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	NewToursPages newTours=new NewToursPages(driver);
	driver.get("http://demo.guru99.com/te/newtours/");
	newTours.getusername().sendKeys("mercury");
	newTours.getpassword().sendKeys("mercury");
	newTours.submit().click();
	newTours.selectFlights().click();
	Select drop=new Select(newTours.getpassCount());
drop.selectByIndex(3);
Select drop1=new Select(newTours.getfromPort());
drop1.selectByValue("Sydney");
Select drop2=new Select(newTours.getfromMonth());
drop2.selectByIndex(8);
Select drop3=new Select(newTours.getfromDay());
drop3.selectByValue("22");
Select drop4=new Select(newTours.gettoPort());
drop4.selectByValue("Paris");
Select drop5=new Select(newTours.gettoMonth());
drop5.selectByVisibleText("November");
Select drop6=new Select(newTours.gettoDay());
drop6.selectByVisibleText("20");
newTours.findFlights().click();

}
}
