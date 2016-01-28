package com.jukin.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jukin.util.WebElementHelper;

public class JukinMediaHomePage {

	WebDriver driver;

	@FindBy(xpath = "//p[contains(text(),'ACME')]")
	WebElement companyMoto;

	@FindBy(xpath = "//img")
	WebElement companyLogo;

	@FindBy(xpath = "//img/ancestor::div[1]")
	WebElement companyLogoAlign;

	@FindBy(xpath = "//h1[contains(text(),'ACME')]")
	WebElement companyName;

	@FindBy(xpath = "//span[text()='Mailing']"/* "//a[contains(text(),'List')]" */)
	WebElement mailingList;

	@FindBy(xpath = "//label[contains(text(),'How did you')]")
	WebElement howDidYouHearAbout;

	@FindBy(xpath = "//span[text()='Social Media']")
	WebElement socialMedia;

	@FindBy(xpath = "//span[text()='Advertising']")
	WebElement advertising;

	@FindBy(xpath = "//span[text()='Search Engine']")
	WebElement searchEngine;

	@FindBy(xpath = "//span[text()='Friend']")
	WebElement friend;

	@FindBy(id = "other")
	WebElement other;

	@FindBy(xpath = "//span[text()='Social Media']/preceding-sibling::input[1]")
	WebElement socialMediaRadioBtn;

	@FindBy(xpath = "//input[@value='Advertising']")
	WebElement advertisingRadioBtn;

	@FindBy(xpath = "//input[@value='Search Engine']")
	WebElement searchEngineRadioBtn;

	@FindBy(xpath = "//input[@value='Friend']")
	WebElement friendRadioBtn;

	@FindBy(xpath = "//input[@value='other']")
	WebElement otherRadioBtn;

	@FindBy(xpath = "//label[contains(text(),'Rate')]")
	WebElement rateYourExperience;

	@FindBy(xpath = "//span[text()='1']")
	WebElement rate1;

	@FindBy(xpath = "//span[text()='2']")
	WebElement rate2;

	@FindBy(xpath = "//span[text()='3']")
	WebElement rate3;

	@FindBy(xpath = "//span[text()='4']")
	WebElement rate4;

	@FindBy(xpath = "//span[text()='5']")
	WebElement rate5;

	@FindBy(xpath = "//span[text()='1']/preceding-sibling::input[1]")
	WebElement rate1RadioBtn;

	@FindBy(xpath = "//span[text()='2']/preceding-sibling::input[1]")
	WebElement rate2RadioBtn;

	@FindBy(xpath = "//span[text()='3']/preceding-sibling::input[1]")
	WebElement rate3RadioBtn;

	@FindBy(xpath = "//span[text()='4']/preceding-sibling::input[1]")
	WebElement rate4RadioBtn;

	@FindBy(xpath = "//span[text()='5']/preceding-sibling::input[1]")
	WebElement rate5RadioBtn;

	@FindBy(xpath = "//label[contains(text(),'Would')]")
	WebElement wouldYouRecommend;

	@FindBy(xpath = "//span[text()='Yes']")
	WebElement yes;

	@FindBy(xpath = "//span[text()='No']")
	WebElement no;

	@FindBy(xpath = "//span[text()='Yes']/preceding-sibling::input[1]")
	WebElement yesRadioBtn;

	@FindBy(xpath = "//span[text()='No']/preceding-sibling::input[1]")
	WebElement noRadioBtn;

	@FindBy(xpath = "//b[text()='Why']")
	WebElement noOptionWhy;

	@FindBy(xpath = "//label[text()=' not? *']")
	WebElement noOptionNot;

	@FindBy(xpath = "//textarea")
	WebElement reasoningTextarea;

	@FindBy(xpath = "//b[contains(text(),'Contact')]/ancestor::form[1]/div[5]/div[1]/input")
	WebElement firstNameTextbox;

	@FindBy(xpath = "//b[contains(text(),'Contact')]/ancestor::form[1]/div[5]/div[2]/input")
	WebElement lastNameTextbox;

	@FindBy(xpath = "//b[contains(text(),'Contact')]/ancestor::form[1]/div[6]/div[1]/input")
	WebElement emailTextbox;

	@FindBy(id = "phone")
	WebElement phoneNumberTextbox;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;

	@FindBy(xpath = "//button[text()='Submit']/ancestor::div[1]")
	WebElement submitButtonAlign;

	public JukinMediaHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getCompanyLogoVerticalAlign() {
		return WebElementHelper.getImageVerticalAlign(companyLogo);
	}

	public String getCompanyLogoLeftAlign() {
		return WebElementHelper.getImageLeftAlign(companyLogoAlign);
	}

	public String getCompanyMotoText() {
		return companyMoto.getText();
	}

	public String getCompanyMotoFontSize() {
		return WebElementHelper.getFontSize(companyMoto);
	}

	public String getCompanyMotoFontFamily() {
		return WebElementHelper.getFontFamily(companyMoto);
	}

	public String getCompanyMotoFontStyle() {
		return WebElementHelper.getFontStyle(companyMoto);
	}

	public String getCompanyMotoTextAlign() {
		return WebElementHelper.getTextAlign(companyMoto);
	}

	public String getCompanyNameText() {
		return companyName.getText();
	}

	public String getCompanyNameFontSize() {
		return WebElementHelper.getFontSize(companyName);
	}

	public String getCompanyNameFontFamily() {
		return WebElementHelper.getFontFamily(companyName);
	}

	public String getCompanyNameTextAlign() {
		return WebElementHelper.getTextAlign(companyName);
	}

	public String getMailingListFontSize() {
		return WebElementHelper.getFontSize(mailingList);
	}

	public String getMailingListFontFamily() {
		return WebElementHelper.getFontFamily(mailingList);
	}

	public WebElement getMailingList() {
		return mailingList;
	}

	public String getMailingListColor() {
		return WebElementHelper.getColor(mailingList);
	}

	public String getHowDidYouHearAboutText() {
		return howDidYouHearAbout.getText();
	}

	public String getHowDidYouHearAboutFontSize() {
		return WebElementHelper.getFontSize(howDidYouHearAbout);
	}

	public String getHowDidYouHearAboutFontFamily() {
		return WebElementHelper.getFontFamily(howDidYouHearAbout);
	}

	public String getHowDidYouHearAboutTextAlign() {
		return WebElementHelper.getTextAlign(howDidYouHearAbout);
	}

	public WebElement getSocialMediaRadioBtn() {
		return socialMediaRadioBtn;
	}

	public String getSocialMediaFontSize() {
		return WebElementHelper.getFontSize(socialMedia);
	}

	public String getSocialMediaFontFamily() {
		return WebElementHelper.getFontFamily(socialMedia);
	}

	public String getAdvertisingFontSize() {
		return WebElementHelper.getFontSize(advertising);
	}

	public String getAdvertisingFontFamily() {
		return WebElementHelper.getFontFamily(advertising);
	}

	public String getSearchEngineFontSize() {
		return WebElementHelper.getFontSize(searchEngine);
	}

	public String getSearchEngineFontFamily() {
		return WebElementHelper.getFontFamily(searchEngine);
	}

	public String getFriendFontSize() {
		return WebElementHelper.getFontSize(friend);
	}

	public String getFriendFontFamily() {
		return WebElementHelper.getFontFamily(friend);
	}

	public WebElement getOtherRadioBtn() {
		return otherRadioBtn;
	}

	public String getOtherGhostText() {
		return WebElementHelper.getTextboxPlaceholder(other);
	}

	public String getOtherFontSize() {
		return WebElementHelper.getFontSize(other);
	}

	public String getOtherFontFamily() {
		return WebElementHelper.getFontFamily(other);
	}

	public String getOtherMaxLength() {
		return WebElementHelper.getMaxLength(other);
	}

	public String getOtherRequired() {
		return WebElementHelper.getRequired(other);
	}

	public String getOtherDisable() {
		return WebElementHelper.getDisabled(other);
	}

	public String getRateYourExperienceText() {
		return rateYourExperience.getText();
	}

	public String getRateYourExperienceFontSize() {
		return WebElementHelper.getFontSize(rateYourExperience);
	}

	public String getRateYourExperienceFontFamily() {
		return WebElementHelper.getFontFamily(rateYourExperience);
	}

	public String getRateYourExperienceTextAlign() {
		return WebElementHelper.getTextAlign(rateYourExperience);
	}

	public String getRate1FontSize() {
		return WebElementHelper.getFontSize(rate1);
	}

	public String getRate1FontFamily() {
		return WebElementHelper.getFontFamily(rate1);
	}

	public String getRate2FontSize() {
		return WebElementHelper.getFontSize(rate2);
	}

	public String getRate2FontFamily() {
		return WebElementHelper.getFontFamily(rate2);
	}

	public String getRate3FontSize() {
		return WebElementHelper.getFontSize(rate3);
	}

	public String getRate3FontFamily() {
		return WebElementHelper.getFontFamily(rate3);
	}

	public String getRate4FontSize() {
		return WebElementHelper.getFontSize(rate4);
	}

	public String getRate4FontFamily() {
		return WebElementHelper.getFontFamily(rate4);
	}

	public String getRate5FontSize() {
		return WebElementHelper.getFontSize(rate5);
	}

	public String getRate5FontFamily() {
		return WebElementHelper.getFontFamily(rate5);
	}

	public String getWouldYouRecommendText() {
		return wouldYouRecommend.getText();
	}

	public String getYesFontSize() {
		return WebElementHelper.getFontSize(yes);
	}

	public String getYesFontFamily() {
		return WebElementHelper.getFontFamily(yes);
	}

	public String getNoFontSize() {
		return WebElementHelper.getFontSize(no);
	}

	public String getNoFontFamily() {
		return WebElementHelper.getFontFamily(no);
	}

	public boolean isDisplayedWhy() {
		return noOptionWhy.isDisplayed();
	}

	public boolean isDisplayedNot() {
		return noOptionNot.isDisplayed();
	}

	public WebElement getYesRadioBtn() {
		return yesRadioBtn;
	}

	public WebElement getNoRadioBtn() {
		return noRadioBtn;
	}

	public boolean isDisplayedTextArea() {
		return reasoningTextarea.isDisplayed();
	}

	public String getReasoningTextareaGhostText() {
		return WebElementHelper.getTextboxPlaceholder(reasoningTextarea);
	}

	public String getReasoningTextareaMaxLength() {
		return WebElementHelper.getMaxLength(reasoningTextarea);
	}

	public String getReasoningTextareaRequired() {
		return WebElementHelper.getRequired(reasoningTextarea);
	}

	public String getWouldYouRecommendFontSize() {
		return WebElementHelper.getFontSize(wouldYouRecommend);
	}

	public String getWouldYouRecommendFontFamily() {
		return WebElementHelper.getFontFamily(wouldYouRecommend);
	}

	public String getWouldYouRecommendTextAlign() {
		return WebElementHelper.getTextAlign(wouldYouRecommend);
	}

	public String getFirstNameGhostText() {
		return WebElementHelper.getTextboxPlaceholder(firstNameTextbox);
	}

	public String getFirstNameFontSize() {
		return WebElementHelper.getFontSize(firstNameTextbox);
	}

	public String getFirstNameFontFamily() {
		return WebElementHelper.getFontFamily(firstNameTextbox);
	}

	public String getFirstNameTextAlign() {
		return WebElementHelper.getTextAlign(firstNameTextbox);
	}

	public String getFirstNameMaxLength() {
		return WebElementHelper.getMaxLength(firstNameTextbox);
	}

	public String getFirstNameRequired() {
		return WebElementHelper.getRequired(firstNameTextbox);
	}

	public String getLastNameGhostText() {
		return WebElementHelper.getTextboxPlaceholder(lastNameTextbox);
	}

	public String getLastNameFontSize() {
		return WebElementHelper.getFontSize(lastNameTextbox);
	}

	public String getLastNameFontFamily() {
		return WebElementHelper.getFontFamily(lastNameTextbox);
	}

	public String getLastNameTextAlign() {
		return WebElementHelper.getTextAlign(lastNameTextbox);
	}

	public String getLastNameMaxLength() {
		return WebElementHelper.getMaxLength(lastNameTextbox);
	}

	public String getLastNameRequired() {
		return WebElementHelper.getRequired(lastNameTextbox);
	}

	public String getEmailGhostText() {
		return WebElementHelper.getTextboxPlaceholder(emailTextbox);
	}

	public String getEmailFontSize() {
		return WebElementHelper.getFontSize(emailTextbox);
	}

	public String getEmailFontFamily() {
		return WebElementHelper.getFontFamily(emailTextbox);
	}

	public String getEmailTextAlign() {
		return WebElementHelper.getTextAlign(emailTextbox);
	}

	public String getEmailMaxLength() {
		return WebElementHelper.getMaxLength(emailTextbox);
	}

	public String getEmailRequired() {
		return WebElementHelper.getRequired(emailTextbox);
	}

	public String getPhoneNumberGhostText() {
		return WebElementHelper.getTextboxPlaceholder(phoneNumberTextbox);
	}

	public String getPhoneNumberFontSize() {
		return WebElementHelper.getFontSize(phoneNumberTextbox);
	}

	public String getPhoneNumberFontFamily() {
		return WebElementHelper.getFontFamily(phoneNumberTextbox);
	}

	public String getPhoneNumberTextAlign() {
		return WebElementHelper.getTextAlign(phoneNumberTextbox);
	}

	public String getPhoneNumberMaxLength() {
		return WebElementHelper.getMaxLength(phoneNumberTextbox);
	}

	public String getPhoneNumberRequired() {
		return WebElementHelper.getRequired(phoneNumberTextbox);
	}

	public String getSubmitText() {
		return submitButton.getText();
	}

	public String getSubmitFontSize() {
		return WebElementHelper.getFontSize(submitButton);
	}

	public String getSubmitFontFamily() {
		return WebElementHelper.getFontFamily(submitButton);
	}

	public String getSubmitBtnAlign() {
		return WebElementHelper.getBtnAlign(submitButtonAlign);
	}

	public void clickSubmit() {
		this.submitButton.click();
	}

	public void clickMailingList() {
		this.mailingList.click();
	}

	public boolean verifyOnHomePage() {
		return getCompanyNameText().contains("ACME");
	}

	public String getPhoneError() {
		WebElement phoneError = driver.findElement(By.xpath("//p[@class='phoneError']"));
		return phoneError.getText();
	}

	public void fillForm() {
		advertisingRadioBtn.click();
		rate1RadioBtn.click();
		yesRadioBtn.click();
		firstNameTextbox.sendKeys("Jigs");
		lastNameTextbox.sendKeys("varsada");
		emailTextbox.sendKeys("test@gmail.com");
		phoneNumberTextbox.sendKeys("898989");
	}

	public boolean verifySubmitButton() {
		WebElement sucessPopUp = driver.findElement(By.xpath("//h1[contains(text(),'successfully')]"));
		System.out.println(sucessPopUp.getText());
		return true;
	}

}
