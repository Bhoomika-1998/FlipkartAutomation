package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
WebDriver driver;
public GoogleSearchPage(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver,this);
}
@FindBy(name="q")
WebElement SearchBox;
public WebElement getSearchBox() {
	return SearchBox;
}
@FindAll(@FindBy(xpath="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li"))
List<WebElement>AutoSuggests;
public List<WebElement>getAutoSuggests(){
	return AutoSuggests;
}
@FindBy(name="btnk")
WebElement SearchBtn;
public WebElement getSearchBtn() {
	return SearchBtn;
}
}

