package com.automationtesting.testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automationtesting.pages.LoginPage;
import com.automationtesting.utilities.SeleniumUtility;

public class TestLoginPage extends SeleniumUtility{
	
	@BeforeTest
	public void startUp(){
		setUp();
	}
	@Test(priority =1)
	public void testUserNameField(){
		Assert.assertTrue(getLoginPage.getUserNameInputField().isDisplayed(),"Username input field is not displayed");
		Assert.assertTrue(getLoginPage.getUserNameInputField().isEnabled(),"Useranem input field is disabled");
	}
	@Test(priority =2)
	public void testLoginPageWithValidData(){
		getLoginPage.enterCredential(properties.getProperty("userName"), properties.getProperty("password"));
	}
}
