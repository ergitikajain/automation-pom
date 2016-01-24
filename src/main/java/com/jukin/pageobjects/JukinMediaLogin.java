package com.jukin.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JukinMediaLogin {

	WebDriver driver;

	@FindBy(id = "username")
	WebElement loginUserName;

	@FindBy(id = "password")
	WebElement loginPassword;

	@FindBy(xpath = "//h1[text()='Login']")
	WebElement titleText;

	@FindBy(tagName = "button")
	WebElement loginButton;

	public JukinMediaLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Get the title of Login Page

	public String getLoginTitle() {
		return titleText.getText();
	}

	// Set user name in textbox

	public void setUserName(String strUserName) {
		loginUserName.sendKeys(strUserName);
	}

	// Set password in password textbox

	public void setPassword(String strPassword) {
		loginPassword.sendKeys(strPassword);
	}

	// Click on login button

	public void clickLogin() {
		loginButton.click();
	}

	/**
	 * 
	 * This POM method will be exposed in test case to login in the application
	 * 
	 * @param strUserName
	 * 
	 * @param strPasword
	 * 
	 * @return
	 */

	public void loginToJukinMedia(String strUserName, String strPasword) {
		// Fill user name
		this.setUserName(strUserName);

		// Fill password
		this.setPassword(strPasword);

		// Click Login button
		this.clickLogin();

	}

}
