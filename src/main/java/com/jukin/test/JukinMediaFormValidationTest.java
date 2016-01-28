package com.jukin.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jukin.pageobjects.JukinMediaHomePage;
import com.jukin.pageobjects.JukinMediaLogin;
import com.jukin.pageobjects.JukinMediaPopup;
import com.jukin.test.base.TestBaseSetup;

public class JukinMediaFormValidationTest extends TestBaseSetup {

	private WebDriver driver;
	JukinMediaHomePage jukinMediaHomePage;
	JukinMediaPopup jukinMediaPopup;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		JukinMediaLogin loginPage = new JukinMediaLogin(driver);
		loginPage.loginToJukinMedia("jukinmedia", "qatest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		jukinMediaHomePage = new JukinMediaHomePage(driver);
	}

	@Test(priority = 0)
	public void submitBlankForm() {
		jukinMediaHomePage.clickSubmit();
		assertEquals(jukinMediaHomePage.getPhoneError(),
				"Please enter phone number.");
	}

	@Test(priority = 3)
	public void submitFilledForm() {
		jukinMediaHomePage.fillForm();
		jukinMediaHomePage.clickSubmit();

		Assert.assertTrue(jukinMediaHomePage.verifySubmitButton());
	}

	@Test(priority = 1)
	public void getCssValue_ButtonColor() {

		Color beforHoverColor = Color.fromString(jukinMediaHomePage
				.getMailingListColor());
		String beforHoverColorCode = beforHoverColor.asHex();
		System.out.println("Color of a link before mouse hover: "
				+ beforHoverColorCode);

		Actions action = new Actions(driver);
		action.moveToElement(jukinMediaHomePage.getMailingList()).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Color afterHoverColor = Color.fromString(jukinMediaHomePage
				.getMailingListColor());
		String afterHoverColorCode = afterHoverColor.asHex();
		System.out.println("Color of a link after mouse hover : "
				+ afterHoverColorCode);

	}

	@Test
	public void verifyPopUpCloseBtn() {
		jukinMediaHomePage.clickMailingList();
		jukinMediaPopup = new JukinMediaPopup(driver);
		Assert.assertTrue(jukinMediaPopup.verifyOnPopUp());
		jukinMediaPopup.clickCloseBtn();
		Assert.assertTrue(jukinMediaHomePage.verifyOnHomePage());

	}

	@Test
	public void verifyPopUpSignUpBtn() {
		jukinMediaHomePage.clickMailingList();
		jukinMediaPopup = new JukinMediaPopup(driver);
		Assert.assertTrue(jukinMediaPopup.verifyOnPopUp());
		jukinMediaPopup.clickSignupBtn();
		Assert.assertTrue(jukinMediaHomePage.verifyOnHomePage());

	}

}
