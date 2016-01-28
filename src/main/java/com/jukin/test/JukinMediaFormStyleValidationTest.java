package com.jukin.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.jukin.pageobjects.JukinMediaHomePage;
import com.jukin.pageobjects.JukinMediaLogin;
import com.jukin.test.base.TestBaseSetup;

public class JukinMediaFormStyleValidationTest extends TestBaseSetup {

	private static final String arialFont = "Arial";
	private SoftAssert softAssert ;
	private WebDriver driver;
	JukinMediaHomePage jukinMediaForm;
    
    
	@BeforeClass
	public void setUp() {
		driver = getDriver();
		JukinMediaLogin loginPage = new JukinMediaLogin(driver);
		loginPage.loginToJukinMedia("jukinmedia", "qatest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		jukinMediaForm = new JukinMediaHomePage(driver);
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
		softAssert.assertTrue(jukinMediaForm.getCompanyMotoFontFamily().contains(arialFont));
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
		softAssert.assertTrue(jukinMediaForm.getCompanyNameFontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getCompanyNameFontSize(), "30px");
		softAssert.assertEquals(jukinMediaForm.getCompanyNameTextAlign(), "center");
		softAssert.assertAll();
	}

	@Test
	public void validateHowDidYouHearAboutStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getHowDidYouHearAboutText(),
				"How did you hear about ACME VC&A Co.? *");
		softAssert.assertTrue(jukinMediaForm.getHowDidYouHearAboutFontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getHowDidYouHearAboutFontSize(), "18px");
		softAssert.assertEquals(jukinMediaForm.getHowDidYouHearAboutTextAlign(), "start");
		softAssert.assertAll();
	}
	
	@Test
	public void validateHowDidYouHearAboutOptionsStyle() {
		softAssert = new SoftAssert();
		softAssert.assertTrue(jukinMediaForm.getSocialMediaRadioBtn().isSelected());
		softAssert.assertTrue(jukinMediaForm.getSocialMediaFontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getSocialMediaFontSize(), "14px");
		softAssert.assertTrue(jukinMediaForm.getAdvertisingFontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getAdvertisingFontSize(), "14px");
		softAssert.assertTrue(jukinMediaForm.getSearchEngineFontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getSearchEngineFontSize(), "14px");
		softAssert.assertTrue(jukinMediaForm.getFriendFontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getFriendFontSize(), "14px");
		softAssert.assertTrue(jukinMediaForm.getOtherFontFamily().contains(arialFont));
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
		softAssert.assertTrue(jukinMediaForm.getRateYourExperienceFontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getRateYourExperienceFontSize(), "28px");
		softAssert.assertEquals(jukinMediaForm.getRateYourExperienceTextAlign(), "start");
		softAssert.assertAll();
	}
	
	@Test
	public void validateRateYourExperieneceOptionsStyle() {
		softAssert = new SoftAssert();
		softAssert.assertTrue(jukinMediaForm.getRate1FontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getRate1FontSize(), "14px");
		softAssert.assertTrue(jukinMediaForm.getRate2FontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getRate2FontSize(), "14px");
		softAssert.assertTrue(jukinMediaForm.getRate3FontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getRate3FontSize(), "14px");
		softAssert.assertTrue(jukinMediaForm.getRate4FontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getRate4FontSize(), "14px");
		softAssert.assertTrue(jukinMediaForm.getRate5FontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getRate5FontSize(), "14px");
		softAssert.assertAll();
	}
	
	@Test
	public void validateWouldYouReccomendStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getWouldYouRecommendText(),
				"Would you recommend us to your friends? (required)");
		softAssert.assertTrue(jukinMediaForm.getWouldYouRecommendFontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getWouldYouRecommendFontSize(), "18px");
		softAssert.assertEquals(jukinMediaForm.getWouldYouRecommendTextAlign(), "start");
		softAssert.assertAll();
	}
	
	@Test
	public void validateWouldYouReccomendOptionsStyle() {
		softAssert = new SoftAssert();
		softAssert.assertTrue(jukinMediaForm.getYesFontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getYesFontSize(), "14px");
		softAssert.assertTrue(jukinMediaForm.getNoFontFamily().contains(arialFont));
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
		softAssert.assertTrue(jukinMediaForm.getFirstNameFontFamily().contains(arialFont));
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
		softAssert.assertTrue(jukinMediaForm.getLastNameFontFamily().contains(arialFont));
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
		softAssert.assertTrue(jukinMediaForm.getEmailFontFamily().contains(arialFont));
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
		softAssert.assertTrue(jukinMediaForm.getPhoneNumberFontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getPhoneNumberFontSize(), "14px");
		softAssert.assertEquals(jukinMediaForm.getPhoneNumberTextAlign(), "start");
		softAssert.assertEquals(jukinMediaForm.getPhoneNumberRequired(), "true");
		softAssert.assertEquals(jukinMediaForm.getPhoneNumberMaxLength(), "32");
		softAssert.assertAll();
	}
	
	@Test
	public void validateMailingListStyle() {
		softAssert = new SoftAssert();
		softAssert.assertTrue(jukinMediaForm.getMailingListFontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getMailingListFontSize(), "21px");
		softAssert.assertAll();
	}
	
	@Test
	public void validateSubmitButtonStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaForm.getSubmitText(), "Submit");
		softAssert.assertTrue(jukinMediaForm.getSubmitFontFamily().contains(arialFont));
		softAssert.assertEquals(jukinMediaForm.getSubmitFontSize(), "24px");
		softAssert.assertEquals(jukinMediaForm.getSubmitTextAlign(), "right");
		softAssert.assertAll();
	}
}
