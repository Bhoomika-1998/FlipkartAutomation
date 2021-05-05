package com.qa.testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.Excel;

public class TC_Flipkart_01 extends TestBaseforAmazon_01 {
	
	@Test
	public void FlipkartShopping() throws InterruptedException
	{
		
		Page.getUsername().sendKeys("8296308452");
		Page.getPassword().sendKeys("Bhoomika@123");
		Page.GetLogin().click();
		Thread.sleep(3000);
		Page.SearchItem().sendKeys("Redmi note5 pro");
		Thread.sleep(3000);

		Page.SearchItem().sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		Page.SelectItem().click();
		Set<String> windowHandle= driver.getWindowHandles();
		
		String h=null;
		for(String s:windowHandle)
		{
			System.out.println(s);
			h=s;
		}
		System.out.println(h);
		driver.switchTo().window(h);

			Page.BuyNow().click();
	}
	@DataProvider
	public String[][] getData() throws Exception {
		String Xlpath = "C:\\Users\\ADMIN\\Documents\\SeleniumAutomate\\src\\test\\java\\com\\qa\\utility.xlsx";
		String Xpath = "Sheet1";
		int rowCount = Excel.GetRowCount(Xlpath, Xpath);
		int columnCount = Excel.GetCellCount(Xlpath, Xpath, rowCount);
		String[][] data = new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				data[i - 1][j] = Excel.GetCallData(Xlpath, Xpath, i, j);

			}

		}
		return data;
	}

}
