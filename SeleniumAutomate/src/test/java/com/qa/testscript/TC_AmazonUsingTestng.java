package com.qa.testscript;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import okio.Options;

public class TC_AmazonUsingTestng extends BaseTestforGoogle{
	
	@Test(priority=1, dataProvider="getData")
	public void SelectProducts(String Input, String name)
	{
		
		//Apage.Selectbox().click();
		Select drop=new Select(Apage.Selectbox());
		drop.selectByVisibleText(Input);
		Apage.getsearchbox().clear();
		
		Apage.getsearchbox().sendKeys(name);
		
		Apage.getsearchbtn().click();
	
	List<WebElement> AllOptions =Apage.getAllOptions();
	for (WebElement Options : AllOptions) {
		Reporter.log(Options.getText(), true);
		
	}
	
	
	List<WebElement> Pricetag =Apage.getGetPrice();
	for (WebElement webElement : Pricetag) 
	{
		Reporter.log("Price of product",true);
		Reporter.log(webElement.getText(),true);
		
	}
		
	}
	
@DataProvider
public Object[][] getData() throws InterruptedException{
	Object[][] data = new Object[3][2];
	data[0][0] = "Books";
	data[0][1]="Da vin code";
	data[1][0]="Electronics";
	data[1][1]="Mobile Phones";
	data[2][0]="Furniture";
	data[2][1]="Wooden tables";
Thread.sleep(2000);
return data;
	
	}

}
