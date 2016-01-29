package com.jukin.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.jukin.pageobjects.JukinMediaHomePage;
import com.jukin.pageobjects.JukinMediaLogin;
import com.jukin.pageobjects.JukinMediaPopup;
import com.jukin.test.base.TestBaseSetup;

public class SignUpPopUpStyleTest extends TestBaseSetup {

	private static final String arialFont = "Arial";
	private WebDriver driver;
	private SoftAssert softAssert ;
	JukinMediaHomePage jukinMediaForm;
	JukinMediaPopup jukinMediaPopup;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		JukinMediaLogin loginPage = new JukinMediaLogin(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.login("jukinmedia", "qatest");
		jukinMediaForm = new JukinMediaHomePage(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		jukinMediaForm.clickMailingList();
		jukinMediaPopup = new JukinMediaPopup(driver);
		
	}


	@Test
	public void validateSignUpLabelStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaPopup.getSignUpLabelText(),
				"Sign Up for Our Newsleter");
		softAssert.assertTrue(jukinMediaPopup.getSignUpLabelFontFamily()
				.contains(arialFont));
		softAssert.assertEquals(jukinMediaPopup.getSignUpLabelFontSize(), "18px");
		softAssert.assertEquals(jukinMediaPopup.getSignUpLabelTextAlign(), "center");
		softAssert.assertAll();
	}

	@Test
	public void validateSignUpEmailStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaPopup.getSignUpEmailGhostText(),
				"Email Address *");
		softAssert.assertTrue(jukinMediaPopup.getSignUpEmailFontFamily()
				.contains(arialFont));
		softAssert.assertEquals(jukinMediaPopup.getSignUpEmailFontSize(), "14px");
		softAssert.assertEquals(jukinMediaPopup.getSignUpEmailTextAlign(), "start");
		softAssert.assertEquals(jukinMediaPopup.getSignUpEmailWidth(), "568.4px");
		softAssert.assertEquals(jukinMediaPopup.getSignUpEmailMaxLength(), "255");
		softAssert.assertNotEquals(jukinMediaPopup.getSignUpEmailBoxShadow(), "none");
		softAssert.assertAll();
	}

	@Test
	public void validateICertifyStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaPopup.getCertifyCheckboxText(),
				"I certify that I am 18 years of age or older *");
		softAssert.assertTrue(jukinMediaPopup.getCertifyCheckboxFontFamily().
				contains(arialFont));
		softAssert.assertEquals(jukinMediaPopup.getCertifyCheckboxFontSize(), "18px");
		softAssert.assertEquals(jukinMediaPopup.getCertifyCheckboxTextTextAlign(),
				"center");
		softAssert.assertAll();
	}

	@Test
	public void validateSignUpBtnStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaPopup.getSignUpBtnAlignment(), "center");
		softAssert.assertAll();
	}
	
	@Test
	public void validateCloseBtnStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(jukinMediaPopup.getCloseBtnAlignment(), "right");
		softAssert.assertAll();
	}
	
	
	
}
