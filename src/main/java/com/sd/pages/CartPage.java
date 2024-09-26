package com.sd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * 
 * This class will store all the locaters and Methods for cart page
 * 
 * 
 */
public class CartPage{
	WebDriver driver;

	public CartPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	//private By firstProductName = By.xpath("(//div[@class='inventory_item_name '])[1]");
	
	private By addedItem = By.xpath("//div[text()='Sauce Labs Backpack']");
	
	
	public String verifyAddedItem() 
	{
		String itemTextCart=driver.findElement(addedItem).getText();
		
		//String itemListed=driver.findElement(firstProductName).getText();
		
		return itemTextCart;
		

	}
	
}
