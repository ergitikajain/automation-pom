package com.jukin.pageobjects;

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
	
	@FindBy(xpath="//p[contains(text(),'ACME')]")
	WebElement companyName;
	
	@FindBy(xpath="//label[contains(text(),'How did you')]")
	WebElement howDidYouHearAbout;
	
	@FindBy(xpath="//label[contains(text(),'Rate')]")
	WebElement rateYourExperience;
	
	@FindBy(xpath="//label[contains(text(),'Would')]")
	WebElement wouldYouRecommend;
	
	@FindBy(xpath="//b[contains(text(),'Contact')]/ancestor::form[1]/div[5]/div[1]/input")
	WebElement firstNameTextbox;
	
	@FindBy(xpath="//b[contains(text(),'Contact')]/ancestor::form[1]/div[5]/div[2]/input")
	WebElement lastNameTextbox;
	
	@FindBy(xpath="//b[contains(text(),'Contact')]/ancestor::form[1]/div[6]/div[1]/input")
	WebElement emailTextbox;
	
	@FindBy(id ="phone")
	WebElement phoneNumberTextbox;
	
	
	
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
	
	
	public String getWouldYouRecommendText() {
		return wouldYouRecommend.getText();
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
	
	
/*	public String getFirstNameGhostText() {
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
	
	
	public String getFirstNameGhostText() {
		return CssHelper.getTextboxPlaceholder(firstNameTextbox);
	}
	
	public String getFirstNameFontSize() {
		return CssHelper.getFontSize(firstNameTextbox);
	}
	
	public String getFirstNameFontFamily() {
		return CssHelper.getFontFamily(firstNameTextbox);
	}*/
	
	public String getFirstNameTextAlign() {
		return CssHelper.getTextAlign(firstNameTextbox);
	}
	
	
	
}
