package com.jukin.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jukin.pageobjects.JukinMediaForm;
import com.jukin.pageobjects.JukinMediaLogin;
import com.jukin.test.base.TestBaseSetup;

public class JukinMediaFormStyleValidationTest extends TestBaseSetup {

	private static final String arialFontFamily = "Arial,sans-serif";

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
		assertEquals(jukinMediaForm.getCompanyLogoVerticalAlign(), "middle");
		assertEquals(jukinMediaForm.getCompanyLogoVerticalAlign(), "middle");
	}

	@Test
	public void validateCompanyMotoStyle() {
		// assertEquals(jukinMediaForm.getCompanyMotoText(),
		// "At ACME Vacume Cleaner & Anvil Co. it is our conviction that manufacturing vacuum cleaners & anvils are not merely complementary activities-they are inextricably linked.");
		assertEquals(jukinMediaForm.getCompanyMotoFontFamily(), arialFontFamily);
		assertEquals(jukinMediaForm.getCompanyMotoFontStyle(), "italic");
		assertEquals(jukinMediaForm.getCompanyMotoFontSize(), "21px");
		assertEquals(jukinMediaForm.getCompanyMotoTextAlign(), "center");
	}

	@Test
	public void validateCompanyNameStyle() {
		assertEquals(jukinMediaForm.getCompanyNameText(),
				"ACME Vacuum Cleaner & Anvil Co.");
		assertEquals(jukinMediaForm.getCompanyNameFontFamily(), arialFontFamily);
		assertEquals(jukinMediaForm.getCompanyNameFontSize(), "30px");
		assertEquals(jukinMediaForm.getCompanyNameTextAlign(), "center");
	}

	@Test
	public void validateHowDidYouHearAboutStyle() {
		assertEquals(jukinMediaForm.getHowDidYouHearAboutText(),
				"How did you hear about ACME VC&A Co.? *");
		assertEquals(jukinMediaForm.getHowDidYouHearAboutFontFamily(), arialFontFamily);
		assertEquals(jukinMediaForm.getHowDidYouHearAboutFontSize(), "18px");
		assertEquals(jukinMediaForm.getHowDidYouHearAboutTextAlign(), "start");
	}
	
	@Test
	public void validateHowDidYouHearAboutOptionsStyle() {
		
		assertEquals(jukinMediaForm.getSocialMediaFontFamily(), arialFontFamily);
		assertEquals(jukinMediaForm.getSocialMediaFontSize(), "14px");
		assertEquals(jukinMediaForm.getAdvertisingFontFamily(), arialFontFamily);
		assertEquals(jukinMediaForm.getAdvertisingFontSize(), "14px");
		assertEquals(jukinMediaForm.getSearchEngineFontFamily(), arialFontFamily);
		assertEquals(jukinMediaForm.getSearchEngineFontSize(), "14px");
		assertEquals(jukinMediaForm.getFriendFontFamily(), arialFontFamily);
		assertEquals(jukinMediaForm.getFriendFontSize(), "14px");
	}
	
	
	@Test
	public void validateRateYourExperieneceStyle() {
		assertEquals(jukinMediaForm.getRateYourExperienceText(),
				"Rate your overall experience (1 - Very Poor, 5 - Very Good) *:");
		assertEquals(jukinMediaForm.getRateYourExperienceFontFamily(), arialFontFamily);
		assertEquals(jukinMediaForm.getRateYourExperienceFontSize(), "18px");
		assertEquals(jukinMediaForm.getRateYourExperienceTextAlign(), "start");
	}
	
	@Test
	public void validateWouldYouReccomendStyle() {
		assertEquals(jukinMediaForm.getWouldYouRecommendText(),
				"Would you recommend us to your friends? (required)");
		assertEquals(jukinMediaForm.getWouldYouRecommendFontFamily(), arialFontFamily);
		assertEquals(jukinMediaForm.getWouldYouRecommendFontSize(), "18px");
		assertEquals(jukinMediaForm.getWouldYouRecommendTextAlign(), "start");
	}
	
	@Test
	public void validateFirstNameStyle() {
		assertEquals(jukinMediaForm.getFirstNameGhostText(), "First Name *");
		assertEquals(jukinMediaForm.getFirstNameFontFamily(), arialFontFamily);
		assertEquals(jukinMediaForm.getFirstNameFontSize(), "14px");
		assertEquals(jukinMediaForm.getFirstNameTextAlign(), "start");
	}
	
	@Test
	public void validateLastNameStyle() {
		assertEquals(jukinMediaForm.getLastNameGhostText(), "Last Name *");
		assertEquals(jukinMediaForm.getLastNameFontFamily(), arialFontFamily);
		assertEquals(jukinMediaForm.getLastNameFontSize(), "14px");
		assertEquals(jukinMediaForm.getLastNameTextAlign(), "start");
	}
	
	@Test
	public void validateEmailStyle() {
		assertEquals(jukinMediaForm.getEmailGhostText(), "Email Addres *");
		assertEquals(jukinMediaForm.getEmailFontFamily(), arialFontFamily);
		assertEquals(jukinMediaForm.getEmailFontSize(), "14px");
		assertEquals(jukinMediaForm.getEmailTextAlign(), "start");
	}
	
	@Test
	public void validatePhoneStyle() {
		assertEquals(jukinMediaForm.getPhoneNumberGhostText(), "Phone Number *");
		assertEquals(jukinMediaForm.getPhoneNumberFontFamily(), arialFontFamily);
		assertEquals(jukinMediaForm.getPhoneNumberFontSize(), "14px");
		assertEquals(jukinMediaForm.getPhoneNumberTextAlign(), "start");
	}
	
	@Test
	public void validateSubmitButtonStyle() {
		assertEquals(jukinMediaForm.getSubmitText(), "Submit");
		assertEquals(jukinMediaForm.getSubmitFontFamily(), arialFontFamily);
		assertEquals(jukinMediaForm.getSubmitFontSize(), "14px");
		assertEquals(jukinMediaForm.getSubmitTextAlign(), "center");
	}
}
