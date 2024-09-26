package com.sd.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sd.base.Base;
import com.sd.pages.CartPage;
import com.sd.pages.LoginPage;
import com.sd.pages.ProductPage;

public class VerifySaucedemoProductPage extends Base {
	
	ProductPage productpage;
	LoginPage login;
	CartPage cartpage;
	@Test
	public void verifyProductPage() {
		
		login=new LoginPage(driver);
		
		login.loginToApplication("standard_user", "secret_sauce");
		
		productpage = new ProductPage(driver);
		
		String name=productpage.storeProductName();
		
		productpage.storeProductPrice();
		
		productpage.addToCart();
		
		productpage.goToCart();
		
		cartpage = new CartPage(driver);
 
		Assert.assertTrue(cartpage.verifyAddedItem().contains(name));
		
	}
}
