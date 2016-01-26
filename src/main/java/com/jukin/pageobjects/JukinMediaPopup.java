package com.jukin.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jukin.util.CssHelper;

public class JukinMediaPopup {

	WebDriver driver;

	@FindBy(id = "myModalLabel")
	WebElement signUpLabel;

	@FindBy(xpath = "//input[@type='email']")
	WebElement signUpEmailTextbox;

	@FindBy(xpath = "//label[contains(text(),'certify')]/input[1]")
	WebElement certifyCheckbox;

	@FindBy(xpath = "//label[contains(text(),'certify')]")
	WebElement certifyCheckboxText;
	
	@FindBy(xpath = "//button[text()='Sign Up']")
	WebElement signUpBtn;
	
	@FindBy(xpath = "//button[text()='Sign Up']/ancestor::div[1]")
	WebElement signUpBtnAlign;
	
	@FindBy(xpath = "//span[text()='×']")
	WebElement closeBtn;

	public JukinMediaPopup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String getSignUpLabelText() {
		return signUpLabel.getText();
	}

	public String getSignUpLabelFontSize() {
		return CssHelper.getFontSize(signUpLabel);
	}

	public String getSignUpLabelFontFamily() {
		return CssHelper.getFontFamily(signUpLabel);
	}

	public String getSignUpLabelTextAlign() {
		return CssHelper.getTextAlign(signUpLabel);
	}
	
	
	public String getSignUpEmailGhostText() {
		return CssHelper.getTextboxPlaceholder(signUpEmailTextbox);
	}

	public String getSignUpEmailFontSize() {
		return CssHelper.getFontSize(signUpEmailTextbox);
	}

	public String getSignUpEmailFontFamily() {
		return CssHelper.getFontFamily(signUpEmailTextbox);
	}

	public String getSignUpEmailTextAlign() {
		return CssHelper.getTextAlign(signUpEmailTextbox);
	}
	
	public String getCertifyCheckboxText() {
		return certifyCheckboxText.getText();
	}

	public String getCertifyCheckboxFontSize() {
		return CssHelper.getFontSize(certifyCheckboxText);
	}

	public String getCertifyCheckboxFontFamily() {
		return CssHelper.getFontFamily(certifyCheckboxText);
	}

	public String getCertifyCheckboxTextTextAlign() {
		return CssHelper.getTextAlign(certifyCheckboxText);
	}
	
	public String getSignUpBtnAlignTextAlign() {
		return CssHelper.getTextAlign(signUpBtnAlign);
	}
	
	public String getCloseBtnAlignTextAlign() {
		return CssHelper.getBtnAlign(closeBtn);
	}
	
}
