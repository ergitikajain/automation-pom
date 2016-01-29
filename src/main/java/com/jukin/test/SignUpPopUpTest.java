package com.jukin.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
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

	@DataProvider
	public Object[][] ValidEmailProvider() {
		return new Object[][] { { new String[] { "jvarsada@yahoo.com", "jvarsada-100@yahoo.com",
				"jvarsada111@jvarsada.com", "jvarsada-100@jvarsada.net", "jvarsada^100@gmail.com",
				"jvarsada-100@yahoo-test.com", "email@example.com", "firstname#lastname@example.com",
				"email@subdomain.example.com", "firstname$lastname@example.com", "1234567890@example.com",
				"email@example-one.com", "_______@example.com", "email@example.name", "email@example.museum",
				"email@example.co.jp", "firstname-lastname@example.com",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@test.com" } } };
	}

	@DataProvider
	public Object[][] InvalidEmailProvider() {
		return new Object[][] { { new String[] { "jvarsada", "jvarsada@.com.my", "jvarsada123@gmail.a",
				"jvarsada123@.com", "jvarsada123@.com.com", ".jvarsada@jvarsada.com", "jvarsada()*@gmail.com",
				"jvarsada@%*.com", "jvarsada..2002@gmail.com", "jvarsada.@gmail.com", "jvarsada@jvarsada@gmail.com",
				"jvarsada@gmail.com.1a", "plainaddress", "#@%^%#$@#$@#.com", "@example.com",
				"Joe Smith <email@example.com>", "email.example.com", "email@example@example.com", ".email@example.com",
				"email.@example.com", "email..email@example.com", "あいうえお@example.com", "email@example.com (Joe Smith)",
				"email@example", "email@111.222.333.44444", "email@example..com", "Abc..123@example.com",
				"\"(),:;<>[\\]@example.com", "just\"not\"right@example.com",
				"this\\ is\\\"really\"not\\\\allowed@example.com",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbffsdfsdfs@test.com" } } };
	}

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		JukinMediaLogin loginPage = new JukinMediaLogin(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.login("jukinmedia", "qatest");
		jukinMediaHomePage = new JukinMediaHomePage(driver);
	}

	@Test(priority = 0)
	public void verifyMailingListLink() {
		jukinMediaHomePage.clickMailingList();
		jukinMediaPopup = new JukinMediaPopup(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(jukinMediaPopup.verifyOnPopUp());
	}

	@Test(priority = 1)
	public void verifyPopUpCloseBtn() {
		initializePopUp();
		Assert.assertTrue(jukinMediaPopup.verifyOnPopUp());
		jukinMediaPopup.clickCloseBtn();
		Assert.assertTrue(jukinMediaPopup.verifyOnHomePage(), "Close button not working");
	}

	@Test(priority = 2)
	public void verifySignUpBtnWithoutRequiredEntry() {
		initializePopUp();
		Assert.assertTrue(jukinMediaPopup.verifyOnPopUp());
		jukinMediaPopup.clickSignupBtn();
		Assert.assertTrue(jukinMediaPopup.verifyOnPopUp(), "Mandatory validations are not working, should remain on pop up");
	}

	@Test(priority = 3)
	public void verifySignUpWithRequiredEntry() {
		initializePopUp();
		Assert.assertTrue(jukinMediaPopup.verifyOnPopUp());
		jukinMediaPopup.setSignUpEmail("test1@gmail.com");
		jukinMediaPopup.clickCertifyCheckBox();
		jukinMediaPopup.clickSignupBtn();
		Assert.assertTrue(jukinMediaPopup.verifyOnHomePage(), "Still on popup, signup button not working");
	}
	
	@Test(priority = 4)
	public void verifySignupWithEmail() {
		initializePopUp();
		Assert.assertTrue(jukinMediaPopup.verifyOnPopUp());
		jukinMediaPopup.setSignUpEmail("test@gmail.com");
		jukinMediaPopup.clickSignupBtn();
		Assert.assertTrue(jukinMediaPopup.verifyOnPopUp() , "I certify required validation not working");
	}
	
	@Test(priority = 5)
	public void verifySignUpWithoutEmail() {
		initializePopUp();
		Assert.assertTrue(jukinMediaPopup.verifyOnPopUp());
		jukinMediaPopup.clickCertifyCheckBox();
		jukinMediaPopup.clickSignupBtn();
		Assert.assertTrue(jukinMediaPopup.verifyOnPopUp(), "Email required validation not working");
	}

	

	@Test(dataProvider = "ValidEmailProvider", priority = 6)
	public void validateInvalidEmailAddress(String[] invalidEmailAddress) {
		softAssert = new SoftAssert();
		for (String email : invalidEmailAddress) {
			driver.navigate().refresh();
			initializePopUp();
			System.out.println("Entering email..." + email);

			jukinMediaPopup.setSignUpEmail(email);
			jukinMediaPopup.clickCertifyCheckBox();
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

	@Test(dataProvider = "ValidEmailProvider", priority = 7)
	public void validateValidEmailAddress(String[] validEmailAddress) {

		softAssert = new SoftAssert();
		for (String email : validEmailAddress) {
			driver.navigate().refresh();
			initializePopUp();
			System.out.println("Entering email..." + email);

			jukinMediaPopup.setSignUpEmail(email);
			jukinMediaPopup.clickCertifyCheckBox();
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

	private void initializePopUp() {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if (jukinMediaPopup.verifyOnHomePage()) {
				System.out.println("On home page...lets click mailing list");
				jukinMediaHomePage.clickMailingList();
				jukinMediaPopup = new JukinMediaPopup(driver);
			}
		} catch (Exception e) {
			System.out.println("No problem - Not on home page, dont click mailing list");
		}
	}

	@AfterTest
	public void closePopUpIfOpen() {
		try {
			if (jukinMediaPopup.verifyOnPopUp()) {
				jukinMediaPopup.clickCloseBtn();
			}
		} catch (Exception e) {
			System.out.println("No problem - not on pop up");
		}
	}

}
