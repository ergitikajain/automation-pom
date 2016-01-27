package com.jukin.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.jukin.pageobjects.JukinMediaForm;
import com.jukin.pageobjects.JukinMediaLogin;
import com.jukin.pageobjects.JukinMediaPopup;
import com.jukin.test.base.TestBaseSetup;

public class JukinMediaPopUpTest extends TestBaseSetup {

	private static final String arialFontFamily = "Arial,sans-serif";
	private WebDriver driver;
	private SoftAssert softAssert ;
	JukinMediaForm jukinMediaForm;
	JukinMediaPopup junJukinMediaPopup;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		JukinMediaLogin loginPage = new JukinMediaLogin(driver);
		loginPage.loginToJukinMedia("jukinmedia", "qatest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		jukinMediaForm = new JukinMediaForm(driver);
	}

	@Test(priority = 0)
	public void clickMailingListLink() {
		jukinMediaForm.clickMailingList();
		junJukinMediaPopup = new JukinMediaPopup(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Assert.assertEquals(junJukinMediaPopup.getSignUpLabelText(),
				"Sign Up for Our Newsleter");
	}

	@Test
	public void validateSignUpLabelStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(junJukinMediaPopup.getSignUpLabelText(),
				"Sign Up for Our Newsleter");
		softAssert.assertEquals(junJukinMediaPopup.getSignUpLabelFontFamily(),
				arialFontFamily);
		softAssert.assertEquals(junJukinMediaPopup.getSignUpLabelFontSize(), "18px");
		softAssert.assertEquals(junJukinMediaPopup.getSignUpLabelTextAlign(), "center");
		softAssert.assertAll();
	}

	@Test
	public void validateSignUpEmailStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(junJukinMediaPopup.getSignUpEmailGhostText(),
				"Email Address *");
		softAssert.assertEquals(junJukinMediaPopup.getSignUpEmailFontFamily(),
				arialFontFamily);
		softAssert.assertEquals(junJukinMediaPopup.getSignUpEmailFontSize(), "14px");
		softAssert.assertEquals(junJukinMediaPopup.getSignUpEmailTextAlign(), "start");
		softAssert.assertEquals(junJukinMediaPopup.getSignUpEmailMaxLength(), "255");
		softAssert.assertAll();
	}

	@Test
	public void validateICertifyStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(junJukinMediaPopup.getCertifyCheckboxText(),
				"I certify that I am 18 years of age or older *");
		softAssert.assertEquals(junJukinMediaPopup.getCertifyCheckboxFontFamily(),
				arialFontFamily);
		softAssert.assertEquals(junJukinMediaPopup.getCertifyCheckboxFontSize(), "18px");
		softAssert.assertEquals(junJukinMediaPopup.getCertifyCheckboxTextTextAlign(),
				"center");
		softAssert.assertAll();
	}

	@Test
	public void validateSignUpBtnStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(junJukinMediaPopup.getSignUpBtnAlignment(), "center");
		softAssert.assertAll();
	}
	
	@Test
	public void validateCloseBtnStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(junJukinMediaPopup.getCloseBtnAlignment(), "right");
		softAssert.assertAll();
	}
	
	
}
