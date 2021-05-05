package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class TC_GoogleSearchPage_04 extends TestBase{
	@Test
	public void Search() throws InterruptedException{
		GoogleSearch.getSearchBox().sendKeys("Automation Testing");
		Thread.sleep(3000);
		List<WebElement>AutoSuggestions=GoogleSearch.getAutoSuggests();
	for(int i=0;i<AutoSuggestions.size();i++)
	{
		String SearchTexts=AutoSuggestions.get(i).getText();
		System.out.println(SearchTexts);
	}
	GoogleSearch.getSearchBtn().click();
	String Title=driver.getTitle();
	if(Title.contains("Automation Testing")) {
		System.out.println("Title is same");
	}
	else {
		System.out.println("Title is not same");
	}
	}

}
