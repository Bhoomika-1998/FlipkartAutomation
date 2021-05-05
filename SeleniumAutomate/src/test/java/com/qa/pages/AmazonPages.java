package com.qa.pages;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPages {
	
	WebDriver driver;
	
	@FindBy(id="searchDropdownBox")	
	WebElement SelectCategory;
	public WebElement Selectbox()
	
	 {
		return SelectCategory;
		// Select dropDown=new Select(SelectCategory);
		 //dropDown.selectByVisibleText(arg);
	 }   
	@FindBy(id="twotabsearchtextbox")	
	WebElement Searchbox;
	public WebElement getsearchbox()
	{
		return Searchbox;
	}
	@FindBy(xpath="//input[@id='nav-search-submit-button']")	
	WebElement Searchbtn;
	public WebElement getsearchbtn()
	{
		return Searchbtn;
	}
	@FindAll(@FindBy(xpath="//Span[@class='a-size-medium a-color-base a-text-normal']")) 
	List<WebElement> AllOptions;
	public List<WebElement> getAllOptions()
{
		return AllOptions;
	}
	@FindAll(@FindBy(xpath = "//span[@class='a-price a-text-price']")) 
	List<WebElement> GetPrice;

	
	public List<WebElement> getGetPrice() {
		return GetPrice;
	}
		
	 
	public AmazonPages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
