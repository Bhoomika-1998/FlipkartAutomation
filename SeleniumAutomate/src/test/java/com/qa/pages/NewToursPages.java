package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewToursPages {
WebDriver driver;
@FindBy(name="userName")
WebElement username;
public WebElement getusername() {
	return username;
}
@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")
WebElement password;
public WebElement getpassword()
{
	return password;
}
@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")
WebElement submit;
public WebElement submit() {
	return submit;
}
@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")
WebElement flights;
public WebElement selectFlights()
{
	return flights;
}
@FindBy(name="passCount")
WebElement passCount;
public WebElement getpassCount()
{
	return passCount;
}
@FindBy (name="fromMonth")
WebElement fromMonth;
public WebElement getfromMonth()
{
	return fromMonth;
}
@FindBy(name="fromDay")
WebElement fromDay;
public WebElement getfromDay()
{
	return fromDay;
}
@FindBy(name="fromPort")
WebElement fromPort;
public WebElement getfromPort()
{
	return fromPort;
}
@FindBy(name="toPort")
WebElement toPort;
public WebElement gettoPort()
{
	return toPort;
}
@FindBy(name="toMonth")
WebElement toMonth;
public WebElement gettoMonth()
{
	return toMonth;
}
@FindBy(name="toDay")
WebElement toDay;
public WebElement gettoDay() 
{
	return toDay;
}
@FindBy(name="findFlihts")
WebElement findFlights;
public WebElement findFlights()
{
	return findFlights;
}
public NewToursPages(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
