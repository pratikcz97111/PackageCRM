package com.crm.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.BaseClass;
import com.qa.crm.pages.CartPage;
import com.qa.crm.pages.LaptopPage;

public class CartTest extends BaseClass {

	CartPage login;
	LaptopPage laptopPage;
	
	public  CartTest() {
		
		super();
	}
	
	@BeforeMethod 
	
	public void setUp() {
		
		intialization();
		
		 login= new CartPage();
		
		
	}
	@Test(priority=1)
	
	public void titlevalidation() {
		String title= login.titlevalidation();
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
		
	}
	@Test(priority=2)
	
	public void searchBoxText() {
		laptopPage= login.enterSearchBoxText();
	}
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
		
	}

		
	
	
}
