package com.jukin.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jukin.pageobjects.JukinMediaForm;
import com.jukin.pageobjects.JukinMediaLogin;
import com.jukin.pageobjects.JukinMediaPopup;
import com.jukin.test.base.TestBaseSetup;

public class JukinMediaPopUpTest extends TestBaseSetup {

	private static final String arialFontFamily = "Arial, sans-serif";
	private WebDriver driver;
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
				"Sign Up for Out Newsleter");
	}

	@Test
	public void validateSignUpLabelStyle() {
		assertEquals(junJukinMediaPopup.getSignUpLabelText(),
				"Sign Up for Out Newsleter");
		assertEquals(junJukinMediaPopup.getSignUpLabelFontFamily(),
				arialFontFamily);
		assertEquals(junJukinMediaPopup.getSignUpLabelFontSize(), "18px");
		assertEquals(junJukinMediaPopup.getSignUpLabelTextAlign(), "center");
	}

	@Test
	public void validateSignUpEmailStyle() {
		assertEquals(junJukinMediaPopup.getSignUpEmailGhostText(),
				"Email Addres *");
		assertEquals(junJukinMediaPopup.getSignUpEmailFontFamily(),
				arialFontFamily);
		assertEquals(junJukinMediaPopup.getSignUpEmailFontSize(), "14px");
		assertEquals(junJukinMediaPopup.getSignUpEmailTextAlign(), "start");
	}

	@Test
	public void validateICertifyStyle() {
		assertEquals(junJukinMediaPopup.getCertifyCheckboxText(),
				"I certify that I am 18 years of age or older *");
		assertEquals(junJukinMediaPopup.getCertifyCheckboxFontFamily(),
				arialFontFamily);
		assertEquals(junJukinMediaPopup.getCertifyCheckboxFontSize(), "14px");
		assertEquals(junJukinMediaPopup.getCertifyCheckboxTextTextAlign(),
				"center");
	}

	@Test
	public void validateSignUpBtnStyle() {
		assertEquals(junJukinMediaPopup.getSignUpBtnAlignTextAlign(), "center");
	}
	
	@Test
	public void validateCloseBtnStyle() {
		assertEquals(junJukinMediaPopup.getCloseBtnAlignTextAlign(), "right");
	}
}
