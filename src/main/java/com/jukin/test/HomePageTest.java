package com.jukin.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.jukin.pageobjects.JukinMediaHomePage;
import com.jukin.pageobjects.JukinMediaLogin;
import com.jukin.pageobjects.JukinMediaPopup;
import com.jukin.test.base.TestBaseSetup;

public class HomePageTest extends TestBaseSetup {

	private WebDriver driver;
	JukinMediaHomePage jukinMediaHomePage;
	JukinMediaPopup jukinMediaPopup;
	private SoftAssert softAssert ;
	
	@BeforeClass
	public void setUp() {
		driver = getDriver();
		JukinMediaLogin loginPage = new JukinMediaLogin(driver);
		loginPage.login("jukinmedia", "qatest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		jukinMediaHomePage = new JukinMediaHomePage(driver);
	}
	
	@Test(priority = 0)
	public void validateMailingListMouseHover() {

		softAssert = new SoftAssert();
		Color beforHoverColor = Color.fromString(jukinMediaHomePage
				.getMailingListColor());
		String beforHoverColorCode = beforHoverColor.asHex();
		softAssert.assertEquals(beforHoverColorCode, "#ffffff");

		Actions action = new Actions(driver);
		action.moveToElement(jukinMediaHomePage.getMailingList()).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Color afterHoverColor = Color.fromString(jukinMediaHomePage
				.getMailingListColor());
		String afterHoverColorCode = afterHoverColor.asHex();
		softAssert.assertEquals(afterHoverColorCode, "#ffff00");
		softAssert.assertAll();

	}
	
	@Test(priority = 2)
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

	

	

	
}
