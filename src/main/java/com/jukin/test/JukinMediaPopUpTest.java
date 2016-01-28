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

public class JukinMediaPopUpTest extends TestBaseSetup {

	private WebDriver driver;
	private SoftAssert softAssert;
	JukinMediaHomePage jukinMediaHomePage;
	JukinMediaPopup jukinMediaPopup;

	String invalidEmailAddress[] = { "test", "test.com", "test@com",
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabb@test.com" };

	String validEmailAddress[] = {
			"test@gmail.com",
			"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@test.com",
			"TEST@GMAIL.COM", "TET234@GMAIL.com", "test123#@gmail.com" };

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		JukinMediaLogin loginPage = new JukinMediaLogin(driver);
		loginPage.loginToJukinMedia("jukinmedia", "qatest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		jukinMediaHomePage = new JukinMediaHomePage(driver);

	}

	@Test(priority=0)
	public void validateInvalidEmailAddress() {

		softAssert = new SoftAssert();
		for (String email : invalidEmailAddress) {
			if (jukinMediaPopup==null
					&& jukinMediaHomePage.getCompanyNameText().contains("ACME")) {
				System.out.println("On home page...lets click mailing list");
				jukinMediaHomePage.clickMailingList();
				jukinMediaPopup = new JukinMediaPopup(driver);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			System.out.println("Entering email..." + email);

			jukinMediaPopup.setSignUpEmail(email);
			jukinMediaPopup.clickSignupBtn();
			softAssert.assertTrue(jukinMediaPopup.getSignUpLabelText()
					.contains("Sign Up"));

		}

		softAssert.assertAll();
	}

	@Test(priority=1)
	public void validateValidEmailAddress() {

		softAssert = new SoftAssert();
		for (String email : validEmailAddress) {
			if (jukinMediaPopup==null
					&& jukinMediaHomePage.getCompanyNameText().contains("ACME")) {
				System.out.println("On home page...lets click mailing list");
				jukinMediaHomePage.clickMailingList();
				jukinMediaPopup = new JukinMediaPopup(driver);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Entering email..." + email);

			jukinMediaPopup.setSignUpEmail(email);
			jukinMediaPopup.clickSignupBtn();
			softAssert.assertTrue(jukinMediaHomePage.getCompanyNameText()
					.contains("ACME"));
		}

		softAssert.assertAll();
	}

}
