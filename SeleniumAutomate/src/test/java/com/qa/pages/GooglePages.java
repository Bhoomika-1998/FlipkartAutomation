package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePages {
	WebDriver driver;
@FindBy(name="a")
WebElement passTitle;
@FindBy(name="a")
WebElement submitButton;
public GooglePages(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
public WebElement getTitle() {
	return passTitle;
}
public WebElement getSubmitButton() {
	return submitButton;
}
}
