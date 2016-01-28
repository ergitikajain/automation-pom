package com.jukin.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.jukin.pageobjects.JukinMediaHomePage;
import com.jukin.pageobjects.JukinMediaLogin;
import com.jukin.pageobjects.JukinMediaPopup;
import com.jukin.test.base.TestBaseSetup;

public class SignUpPopUpTest extends TestBaseSetup {

	private WebDriver driver;
	private SoftAssert softAssert;
	JukinMediaHomePage jukinMediaHomePage;
	JukinMediaPopup jukinMediaPopup;

	String invalidEmailAddress[] = { "test", "test.com", "test@com",
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbffsdfsdfs@test.com" };

	String validEmailAddress[] = { "test@gmail.com",
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@test.com", "TEST@GMAIL.COM",
			"TET234@GMAIL.com", "test123#@gmail.com" };

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		JukinMediaLogin loginPage = new JukinMediaLogin(driver);
		loginPage.login("jukinmedia", "qatest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		jukinMediaHomePage = new JukinMediaHomePage(driver);

	}

	@Test(priority = 0)
	public void clickMailingListLink() {
		jukinMediaHomePage.clickMailingList();
		jukinMediaPopup = new JukinMediaPopup(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(jukinMediaPopup.verifyOnPopUp());
		jukinMediaPopup.clickCloseBtn();
	}

	@Test(priority = 0)
	public void verifyPopUpCloseBtn() {
		initializePopUp();
		Assert.assertTrue(jukinMediaPopup.verifyOnPopUp());
		jukinMediaPopup.clickCloseBtn();
		Assert.assertTrue(jukinMediaHomePage.verifyOnHomePage());
	}

	@Test(priority = 1)
	public void verifyPopUpSignUpBtn() {
		initializePopUp();
		Assert.assertTrue(jukinMediaPopup.verifyOnPopUp());
		jukinMediaPopup.clickSignupBtn();
		Assert.assertTrue(jukinMediaHomePage.verifyOnHomePage());
		jukinMediaPopup.clickCloseBtn();
	}

	@Test(priority = 2)
	public void validateInvalidEmailAddress() {

		softAssert = new SoftAssert();
		for (String email : invalidEmailAddress) {
			initializePopUp();
			System.out.println("Entering email..." + email);

			jukinMediaPopup.setSignUpEmail(email);
			jukinMediaPopup.clickSignupBtn();

			try {
				softAssert.assertTrue(jukinMediaPopup.verifyOnPopUp());
				if (jukinMediaPopup.verifyOnPopUp()) {
					jukinMediaPopup.clickCloseBtn();
				}
			} catch (Exception e) {
				softAssert.assertTrue(false, "Not on pop up for invalid email " + email);
			}

		}

		softAssert.assertAll();
	}

	private void initializePopUp() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (jukinMediaHomePage.verifyOnHomePage()) {
			System.out.println("On home page...lets click mailing list");
			jukinMediaHomePage.clickMailingList();
			jukinMediaPopup = new JukinMediaPopup(driver);
		}
	}

	@Test(priority = 3)
	public void validateValidEmailAddress() {

		softAssert = new SoftAssert();
		for (String email : validEmailAddress) {
			initializePopUp();
			System.out.println("Entering email..." + email);

			jukinMediaPopup.setSignUpEmail(email);
			jukinMediaPopup.clickSignupBtn();

			try {
				softAssert.assertFalse(jukinMediaPopup.verifyOnPopUp(), "On Pop up for valid email " + email);
				if (jukinMediaPopup.verifyOnPopUp()) {
					jukinMediaPopup.clickCloseBtn();
				}
			} catch (Exception e) {
				softAssert.assertTrue(true, "On Home Page for valid email");
			}
		}

		softAssert.assertAll();
	}

}
