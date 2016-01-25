package com.jukin.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jukin.util.CssHelper;

public class JukinMediaForm {

	WebDriver driver;

	@FindBy(xpath="//p[contains(text(),'ACME')]")
	WebElement companyMoto;

	public WebElement getCompanyMoto() {
		return companyMoto;
	}

	@FindBy(xpath="//img")
	WebElement companyLogo;

	@FindBy(xpath="//h1[contains(text(),'ACME')]")
	WebElement companyName;

	@FindBy(xpath="//label[contains(text(),'How did you')]")
	WebElement howDidYouHearAbout;

	@FindBy(xpath="//span[text()='Social Media']")
	WebElement socialMedia;

	@FindBy(xpath="//span[text()='Advertising']")
	WebElement advertising;

	@FindBy(xpath="//span[text()='Search Engine']")
	WebElement searchEngine;

	@FindBy(xpath="//span[text()='Friend']")
	WebElement friend;

	@FindBy(id="other")
	WebElement other;


	@FindBy(xpath="//span[text()='Social Media']/preceding-sibling::input[1]")
	WebElement socialMediaRadioBtn;

	@FindBy(xpath="//input[@value='Advertising']")
	WebElement advertisingRadioBtn;

	@FindBy(xpath="//input[@value='Search Engine']")
	WebElement searchEngineRadioBtn;

	@FindBy(xpath="//input[@value='Friend']")
	WebElement friendRadioBtn;

	@FindBy(xpath="//input[@value='other']")
	WebElement otherRadioBtn;


	@FindBy(xpath="//label[contains(text(),'Rate')]")
	WebElement rateYourExperience;

	@FindBy(xpath="//span[text()='1']")
	WebElement rate1;

	@FindBy(xpath="//span[text()='2']")
	WebElement rate2;

	@FindBy(xpath="//span[text()='3']")
	WebElement rate3;

	@FindBy(xpath="//span[text()='4']")
	WebElement rate4;

	@FindBy(xpath="//span[text()='5']")
	WebElement rate5;

	@FindBy(name="3")
	WebElement rate1RadioBtn;

	@FindBy(name="4")
	WebElement rate2RadioBtn;

	@FindBy(name="5")
	WebElement rate3RadioBtn;

	@FindBy(name="6")
	WebElement rate4RadioBtn;

	@FindBy(name="7")
	WebElement rate5RadioBtn;

	@FindBy(xpath="//label[contains(text(),'Would')]")
	WebElement wouldYouRecommend;

	@FindBy(xpath="//span[text()='Yes']")
	WebElement yes;

	@FindBy(xpath="//span[text()='No']")
	WebElement no;

	@FindBy(xpath="//b[contains(text(),'Contact')]/ancestor::form[1]/div[5]/div[1]/input")
	WebElement firstNameTextbox;

	@FindBy(xpath="//b[contains(text(),'Contact')]/ancestor::form[1]/div[5]/div[2]/input")
	WebElement lastNameTextbox;

	@FindBy(xpath="//b[contains(text(),'Contact')]/ancestor::form[1]/div[6]/div[1]/input")
	WebElement emailTextbox;

	@FindBy(id ="phone")
	WebElement phoneNumberTextbox;

	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitButton;	

	public JukinMediaForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getCompanyLogoVerticalAlign() {
		return CssHelper.getImageVerticalAlign(companyLogo);
	}

	public String getCompanyLogoLeftAlign() {
		return CssHelper.getImageLeftAlign(companyLogo);
	}

	public String getCompanyMotoText() {
		return companyMoto.getText();
	}

	public String getCompanyMotoFontSize() {
		return CssHelper.getFontSize(companyMoto);
	}

	public String getCompanyMotoFontFamily() {
		return CssHelper.getFontFamily(companyMoto);
	}

	public String getCompanyMotoFontStyle() {
		return CssHelper.getFontStyle(companyMoto);
	}

	public String getCompanyMotoTextAlign() {
		return CssHelper.getTextAlign(companyMoto);
	}



	public String getCompanyNameText() {
		return companyName.getText();
	}

	public String getCompanyNameFontSize() {
		return CssHelper.getFontSize(companyName);
	}

	public String getCompanyNameFontFamily() {
		return CssHelper.getFontFamily(companyName);
	}

	public String getCompanyNameTextAlign() {
		return CssHelper.getTextAlign(companyName);
	}


	public String getHowDidYouHearAboutText() {
		return howDidYouHearAbout.getText();
	}

	public String getHowDidYouHearAboutFontSize() {
		return CssHelper.getFontSize(howDidYouHearAbout);
	}

	public String getHowDidYouHearAboutFontFamily() {
		return CssHelper.getFontFamily(howDidYouHearAbout);
	}

	public String getHowDidYouHearAboutTextAlign() {
		return CssHelper.getTextAlign(howDidYouHearAbout);
	}

	public String getSocialMediaFontSize() {
		return CssHelper.getFontSize(socialMedia);
	}

	public String getSocialMediaFontFamily() {
		return CssHelper.getFontFamily(socialMedia);
	}

	public String getAdvertisingFontSize() {
		return CssHelper.getFontSize(advertising);
	}

	public String getAdvertisingFontFamily() {
		return CssHelper.getFontFamily(advertising);
	}

	public String getSearchEngineFontSize() {
		return CssHelper.getFontSize(searchEngine);
	}

	public String getSearchEngineFontFamily() {
		return CssHelper.getFontFamily(searchEngine);
	}

	public String getFriendFontSize() {
		return CssHelper.getFontSize(friend);
	}

	public String getFriendFontFamily() {
		return CssHelper.getFontFamily(friend);
	}

	public String getOtherGhostText() {
		return CssHelper.getTextboxPlaceholder(other);
	}
	public String getOtherFontSize() {
		return CssHelper.getFontSize(other);
	}
	public String getOtherFontFamily() {
		return CssHelper.getFontFamily(other);
	}


	public String getRateYourExperienceText() {
		return rateYourExperience.getText();
	}

	public String getRateYourExperienceFontSize() {
		return CssHelper.getFontSize(rateYourExperience);
	}

	public String getRateYourExperienceFontFamily() {
		return CssHelper.getFontFamily(rateYourExperience);
	}

	public String getRateYourExperienceTextAlign() {
		return CssHelper.getTextAlign(rateYourExperience);
	}
	public String getRate1FontSize() {
		return CssHelper.getFontSize(rate1);
	}

	public String getRate1FontFamily() {
		return CssHelper.getFontFamily(rate1);
	}
	public String getRate2FontSize() {
		return CssHelper.getFontSize(rate2);
	}

	public String getRate2FontFamily() {
		return CssHelper.getFontFamily(rate2);
	}
	public String getRate3FontSize() {
		return CssHelper.getFontSize(rate3);
	}

	public String getRate3FontFamily() {
		return CssHelper.getFontFamily(rate3);
	}
	public String getRate4FontSize() {
		return CssHelper.getFontSize(rate4);
	}

	public String getRate4FontFamily() {
		return CssHelper.getFontFamily(rate4);
	}
	public String getRate5FontSize() {
		return CssHelper.getFontSize(rate5);
	}

	public String getRate5FontFamily() {
		return CssHelper.getFontFamily(rate5);
	}


	public String getWouldYouRecommendText() {
		return wouldYouRecommend.getText();
	}

	public String getYesFontSize() {
		return CssHelper.getFontSize(yes);
	}

	public String getYesFontFamily() {
		return CssHelper.getFontFamily(yes);
	}
	public String getNoFontSize() {
		return CssHelper.getFontSize(no);
	}

	public String getNoFontFamily() {
		return CssHelper.getFontFamily(no);
	}
	
	public String getWouldYouRecommendFontSize() {
		return CssHelper.getFontSize(wouldYouRecommend);
	}

	public String getWouldYouRecommendFontFamily() {
		return CssHelper.getFontFamily(wouldYouRecommend);
	}

	public String getWouldYouRecommendTextAlign() {
		return CssHelper.getTextAlign(wouldYouRecommend);
	}


	public String getFirstNameGhostText() {
		return CssHelper.getTextboxPlaceholder(firstNameTextbox);
	}

	public String getFirstNameFontSize() {
		return CssHelper.getFontSize(firstNameTextbox);
	}

	public String getFirstNameFontFamily() {
		return CssHelper.getFontFamily(firstNameTextbox);
	}

	public String getFirstNameTextAlign() {
		return CssHelper.getTextAlign(firstNameTextbox);
	}


	public String getLastNameGhostText() {
		return CssHelper.getTextboxPlaceholder(lastNameTextbox);
	}

	public String getLastNameFontSize() {
		return CssHelper.getFontSize(lastNameTextbox);
	}

	public String getLastNameFontFamily() {
		return CssHelper.getFontFamily(lastNameTextbox);
	}

	public String getLastNameTextAlign() {
		return CssHelper.getTextAlign(lastNameTextbox);
	}


	public String getEmailGhostText() {
		return CssHelper.getTextboxPlaceholder(emailTextbox);
	}

	public String getEmailFontSize() {
		return CssHelper.getFontSize(emailTextbox);
	}

	public String getEmailFontFamily() {
		return CssHelper.getFontFamily(emailTextbox);
	}

	public String getEmailTextAlign() {
		return CssHelper.getTextAlign(emailTextbox);
	}


	public String getPhoneNumberGhostText() {
		return CssHelper.getTextboxPlaceholder(phoneNumberTextbox);
	}

	public String getPhoneNumberFontSize() {
		return CssHelper.getFontSize(phoneNumberTextbox);
	}

	public String getPhoneNumberFontFamily() {
		return CssHelper.getFontFamily(phoneNumberTextbox);
	}

	public String getPhoneNumberTextAlign() {
		return CssHelper.getTextAlign(phoneNumberTextbox);
	}


	public String getSubmitText() {
		return submitButton.getText();
	}

	public String getSubmitFontSize() {
		return CssHelper.getFontSize(submitButton);
	}

	public String getSubmitFontFamily() {
		return CssHelper.getFontFamily(submitButton);
	}

	public String getSubmitTextAlign() {
		return CssHelper.getTextAlign(submitButton);
	}

	
	
	
	public void clickSubmit(){
		this.submitButton.click();
	}
	
	public String getPhoneError() {
		WebElement phoneError = driver.findElement(By.xpath("//p[@class='phoneError']"));
		return phoneError.getText();
	}
	
	public void fillForm() {
		
	}
}
