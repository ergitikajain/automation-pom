package com.jukin.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.jukin.pageobjects.JukinMediaForm;
import com.jukin.pageobjects.JukinMediaLogin;
import com.jukin.test.base.TestBaseSetup;

public class JukinMediaFormStyleValidationTest extends TestBaseSetup {

	private static final String arialFontFamily = "Arial,sans-serif";
	private SoftAssert softAssert ;
	private WebDriver driver;
	JukinMediaForm jukinMediaForm;
    
    
	@BeforeClass
	public void setUp() {
		driver = getDriver();
		JukinMediaLogin loginPage = new JukinMediaLogin(driver);
		loginPage.loginToJukinMedia("jukinmedia", "qatest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		jukinMediaForm = new JukinMediaForm(driver);
	}

	@Test
	public void validateLogoStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getCompanyLogoVerticalAlign(), "middle");
		softAssert.assertEquals(jukinMediaForm.getCompanyLogoLeftAlign(), "15px");
		softAssert.assertAll();
	}

	@Test
	public void validateCompanyMotoStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getCompanyMotoFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getCompanyMotoFontStyle(), "italic");
		softAssert.assertEquals(jukinMediaForm.getCompanyMotoFontSize(), "21px");
		softAssert.assertEquals(jukinMediaForm.getCompanyMotoTextAlign(), "center");
		softAssert.assertAll();
	}

	@Test
	public void validateCompanyNameStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getCompanyNameText(),
				"ACME Vacuum Cleaner & Anvil Co.");
		softAssert.assertEquals(jukinMediaForm.getCompanyNameFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getCompanyNameFontSize(), "30px");
		softAssert.assertEquals(jukinMediaForm.getCompanyNameTextAlign(), "center");
		softAssert.assertAll();
	}

	@Test
	public void validateHowDidYouHearAboutStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getHowDidYouHearAboutText(),
				"How did you hear about ACME VC&A Co.? *");
		softAssert.assertEquals(jukinMediaForm.getHowDidYouHearAboutFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getHowDidYouHearAboutFontSize(), "18px");
		softAssert.assertEquals(jukinMediaForm.getHowDidYouHearAboutTextAlign(), "start");
		softAssert.assertAll();
	}
	
	@Test
	public void validateHowDidYouHearAboutOptionsStyle() {
		softAssert = new SoftAssert();
		softAssert.assertTrue(jukinMediaForm.getSocialMediaRadioBtn().isSelected());
		softAssert.assertEquals(jukinMediaForm.getSocialMediaFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getSocialMediaFontSize(), "14px");
		softAssert.assertEquals(jukinMediaForm.getAdvertisingFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getAdvertisingFontSize(), "14px");
		softAssert.assertEquals(jukinMediaForm.getSearchEngineFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getSearchEngineFontSize(), "14px");
		softAssert.assertEquals(jukinMediaForm.getFriendFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getFriendFontSize(), "14px");
		softAssert.assertEquals(jukinMediaForm.getOtherFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getOtherFontSize(), "14px");
		softAssert.assertAll();
	}
	
	
	@Test
	public void validateOtherOption() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getOtherGhostText(), "Other");
		softAssert.assertFalse(jukinMediaForm.getOtherRadioBtn().isSelected());
		softAssert.assertEquals(jukinMediaForm.getOtherRequired(), "");
		jukinMediaForm.getOtherRadioBtn().click();
		softAssert.assertTrue(jukinMediaForm.getOtherRadioBtn().isSelected());
		softAssert.assertEquals(jukinMediaForm.getOtherRequired(), "true");
		softAssert.assertEquals(jukinMediaForm.getOtherMaxLength(), "32");
		softAssert.assertAll();
	}
	
	@Test
	public void validateRateYourExperieneceStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getRateYourExperienceText(),
				"Rate your overall experience (1 - Very Poor, 5 - Very Good) *:");
		softAssert.assertEquals(jukinMediaForm.getRateYourExperienceFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getRateYourExperienceFontSize(), "28px");
		softAssert.assertEquals(jukinMediaForm.getRateYourExperienceTextAlign(), "start");
		softAssert.assertAll();
	}
	
	@Test
	public void validateRateYourExperieneceOptionsStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getRate1FontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getRate1FontSize(), "14px");
		softAssert.assertEquals(jukinMediaForm.getRate2FontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getRate2FontSize(), "14px");
		softAssert.assertEquals(jukinMediaForm.getRate3FontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getRate3FontSize(), "14px");
		softAssert.assertEquals(jukinMediaForm.getRate4FontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getRate4FontSize(), "14px");
		softAssert.assertEquals(jukinMediaForm.getRate5FontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getRate5FontSize(), "14px");
		softAssert.assertAll();
	}
	
	@Test
	public void validateWouldYouReccomendStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getWouldYouRecommendText(),
				"Would you recommend us to your friends? (required)");
		softAssert.assertEquals(jukinMediaForm.getWouldYouRecommendFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getWouldYouRecommendFontSize(), "18px");
		softAssert.assertEquals(jukinMediaForm.getWouldYouRecommendTextAlign(), "start");
		softAssert.assertAll();
	}
	
	@Test
	public void validateWouldYouReccomendOptionsStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getYesFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getYesFontSize(), "14px");
		softAssert.assertEquals(jukinMediaForm.getNoFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getNoFontSize(), "14px");
		softAssert.assertAll();
	}
	
	@Test
	public void validateWouldYouReccomendNoOption() {
		softAssert = new SoftAssert();
		Assert.assertFalse(jukinMediaForm.getYesRadioBtn().isSelected());
		Assert.assertFalse(jukinMediaForm.getNoRadioBtn().isSelected());
		jukinMediaForm.getYesRadioBtn().click();
		Assert.assertTrue(jukinMediaForm.getYesRadioBtn().isSelected());
		Assert.assertFalse(jukinMediaForm.getNoRadioBtn().isSelected());

		Assert.assertFalse(jukinMediaForm.isDisplayedWhy());
		Assert.assertFalse(jukinMediaForm.isDisplayedNot());
		Assert.assertFalse(jukinMediaForm.isDisplayedTextArea());
		
		jukinMediaForm.getNoRadioBtn().click();
		
		Assert.assertFalse(jukinMediaForm.getYesRadioBtn().isSelected());
		Assert.assertTrue(jukinMediaForm.getNoRadioBtn().isSelected());
		
		Assert.assertTrue(jukinMediaForm.isDisplayedWhy());
		Assert.assertTrue(jukinMediaForm.isDisplayedNot());
		Assert.assertTrue(jukinMediaForm.isDisplayedTextArea());
		softAssert.assertEquals(jukinMediaForm.getReasoningTextareaRequired(), "true");
		softAssert.assertEquals(jukinMediaForm.getReasoningTextareaMaxLength(), "100");
		softAssert.assertAll();
	}
	
	
	@Test
	public void validateFirstNameStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getFirstNameGhostText(), "First Name *");
		softAssert.assertEquals(jukinMediaForm.getFirstNameFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getFirstNameFontSize(), "14px");
		softAssert.assertEquals(jukinMediaForm.getFirstNameTextAlign(), "start");
		softAssert.assertEquals(jukinMediaForm.getFirstNameRequired(), "true");
		softAssert.assertEquals(jukinMediaForm.getFirstNameMaxLength(), "32");
		
		softAssert.assertAll();
	}
	
	@Test
	public void validateLastNameStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getLastNameGhostText(), "Last Name *");
		softAssert.assertEquals(jukinMediaForm.getLastNameFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getLastNameFontSize(), "14px");
		softAssert.assertEquals(jukinMediaForm.getLastNameTextAlign(), "start");
		softAssert.assertEquals(jukinMediaForm.getLastNameRequired(), "true");
		softAssert.assertEquals(jukinMediaForm.getLastNameMaxLength(), "32");
		softAssert.assertAll();
	}
	
	@Test
	public void validateEmailStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getEmailGhostText(), "Email *");
		softAssert.assertEquals(jukinMediaForm.getEmailFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getEmailFontSize(), "14px");
		softAssert.assertEquals(jukinMediaForm.getEmailTextAlign(), "start");
		softAssert.assertEquals(jukinMediaForm.getEmailRequired(), "true");
		softAssert.assertEquals(jukinMediaForm.getEmailMaxLength(), "32");
		softAssert.assertAll();
	}
	
	@Test
	public void validatePhoneStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getPhoneNumberGhostText(), "Phone Number *");
		softAssert.assertEquals(jukinMediaForm.getPhoneNumberFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getPhoneNumberFontSize(), "14px");
		softAssert.assertEquals(jukinMediaForm.getPhoneNumberTextAlign(), "start");
		softAssert.assertEquals(jukinMediaForm.getPhoneNumberRequired(), "true");
		softAssert.assertEquals(jukinMediaForm.getPhoneNumberMaxLength(), "32");
		softAssert.assertAll();
	}
	
	@Test
	public void validateMailingListStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getMailingListFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getMailingListFontSize(), "21px");
		softAssert.assertAll();
	}
	
	@Test
	public void validateSubmitButtonStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getSubmitText(), "Submit");
		softAssert.assertEquals(jukinMediaForm.getSubmitFontFamily(), arialFontFamily);
		softAssert.assertEquals(jukinMediaForm.getSubmitFontSize(), "24px");
		softAssert.assertEquals(jukinMediaForm.getSubmitTextAlign(), "right");
		softAssert.assertAll();
	}
}
