package com.jukin.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jukin.util.WebElementHelper;

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

	@FindBy(xpath = "//span[text()='×']/ancestor::button[1]")
	WebElement closeBtn;

	public JukinMediaPopup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String getSignUpLabelText() {
		return signUpLabel.getText();
	}

	public String getSignUpLabelFontSize() {
		return WebElementHelper.getFontSize(signUpLabel);
	}

	public String getSignUpLabelFontFamily() {
		return WebElementHelper.getFontFamily(signUpLabel);
	}

	public String getSignUpLabelTextAlign() {
		return WebElementHelper.getTextAlign(signUpLabel);
	}

	public String getSignUpEmailGhostText() {
		return WebElementHelper.getTextboxPlaceholder(signUpEmailTextbox);
	}

	public String getSignUpEmailFontSize() {
		return WebElementHelper.getFontSize(signUpEmailTextbox);
	}

	public String getSignUpEmailFontFamily() {
		return WebElementHelper.getFontFamily(signUpEmailTextbox);
	}

	public String getSignUpEmailTextAlign() {
		return WebElementHelper.getTextAlign(signUpEmailTextbox);
	}

	public String getSignUpEmailMaxLength() {
		return WebElementHelper.getMaxLength(signUpEmailTextbox);
	}
	public String getSignUpEmailBoxShadow() {
		return WebElementHelper.getBoxShadow(signUpEmailTextbox);
	}
	public void setSignUpEmail(String emailAddress) {
		signUpEmailTextbox.clear();
		signUpEmailTextbox.sendKeys(emailAddress);
	}

	public String getCertifyCheckboxText() {
		return certifyCheckboxText.getText();
	}

	public String getCertifyCheckboxFontSize() {
		return WebElementHelper.getFontSize(certifyCheckboxText);
	}

	public String getCertifyCheckboxFontFamily() {
		return WebElementHelper.getFontFamily(certifyCheckboxText);
	}

	public String getCertifyCheckboxTextTextAlign() {
		return WebElementHelper.getTextAlign(certifyCheckboxText);
	}

	public String getSignUpBtnAlignment() {
		return WebElementHelper.getTextAlign(signUpBtnAlign);
	}

	public String getCloseBtnAlignment() {
		return WebElementHelper.getBtnAlign(closeBtn);
	}

	public void clickCloseBtn() {
		closeBtn.click();
	}

	public void clickSignupBtn() {
		signUpBtn.click();
	}

	public void clickCertifyCheckBox() {
		certifyCheckbox.click();
	}

	public boolean verifyOnPopUp() {
		try {
			return getSignUpLabelText().contains("Sign Up");
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyOnHomePage() {
		try {
			getSignUpLabelText().contains("Sign Up");
			return false;
		} catch (Exception e) {
			return true;

		}
	}

	public String getSignUpEmailWidth() {
		return WebElementHelper.getWidth(this.signUpEmailTextbox);
	}

}
