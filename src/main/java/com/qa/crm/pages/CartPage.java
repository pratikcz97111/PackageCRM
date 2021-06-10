package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.BaseClass;

public class CartPage extends BaseClass {
	
	//page factory or object repo
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchButton;
	
    @FindBy(id="nav-logo-sprites")
    WebElement logo;
    
    //Intialization 
    
    public void cartPage() {
    	
    	PageFactory.initElements(driver , this);
    	
    }
    
    //Action
    
    public String titlevalidation() {
    	
    	return driver.getTitle(); 
    }
    
    public LaptopPage enterSearchBoxText() {
    	searchBox.sendKeys("laptop");
    	searchButton.click();
    	 return new LaptopPage();
    }
   
    
}

