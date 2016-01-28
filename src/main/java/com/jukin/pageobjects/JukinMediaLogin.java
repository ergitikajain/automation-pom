package com.jukin.pageobjects;

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

	public String getLoginTitle() {
		return titleText.getText();
	}

	public void setUserName(String strUserName) {
		loginUserName.sendKeys(strUserName);
	}

	public void setPassword(String strPassword) {
		loginPassword.sendKeys(strPassword);
	}

	public void clickLogin() {
		loginButton.click();
	}

	public void login(String strUserName, String strPasword) {
		this.setUserName(strUserName);
		this.setPassword(strPasword);
		this.clickLogin();
	}

}
