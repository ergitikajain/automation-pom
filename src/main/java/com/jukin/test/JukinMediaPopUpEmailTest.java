package com.jukin.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.jukin.pageobjects.JukinMediaHomePage;
import com.jukin.pageobjects.JukinMediaLogin;
import com.jukin.pageobjects.JukinMediaPopup;
import com.jukin.test.base.TestBaseSetup;

public class JukinMediaPopUpEmailTest extends TestBaseSetup {

	private static final String arialFont = "Arial";
	private WebDriver driver;
	private SoftAssert softAssert ;
	JukinMediaHomePage jukinMediaForm;
	JukinMediaPopup junJukinMediaPopup;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		JukinMediaLogin loginPage = new JukinMediaLogin(driver);
		loginPage.loginToJukinMedia("jukinmedia", "qatest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		jukinMediaForm = new JukinMediaHomePage(driver);
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
		softAssert.assertTrue(junJukinMediaPopup.getSignUpLabelFontFamily()
				.contains(arialFont));
		softAssert.assertEquals(junJukinMediaPopup.getSignUpLabelFontSize(), "18px");
		softAssert.assertEquals(junJukinMediaPopup.getSignUpLabelTextAlign(), "center");
		softAssert.assertAll();
	}

	@Test
	public void validateSignUpEmailStyle() {
		softAssert = new SoftAssert();
		softAssert.assertEquals(junJukinMediaPopup.getSignUpEmailGhostText(),
				"Email Address *");
		softAssert.assertTrue(junJukinMediaPopup.getSignUpEmailFontFamily()
				.contains(arialFont));
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
		softAssert.assertTrue(junJukinMediaPopup.getCertifyCheckboxFontFamily().
				contains(arialFont));
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
