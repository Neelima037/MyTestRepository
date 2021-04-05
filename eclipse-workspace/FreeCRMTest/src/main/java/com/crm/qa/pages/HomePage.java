package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath= "//td[contains(text(),'Username ')]")
	WebElement userNameLabel;

	@FindBy(xpath= "//a[contains(text(),'Contacts')]")
	WebElement ContactLink;
	
	//Initializing the page objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle() {
			return driver.getTitle();
		}
		public ContactPage clickOnContactsLink() {
			ContactLink.click();
			return new ContactPage();
		}
}
