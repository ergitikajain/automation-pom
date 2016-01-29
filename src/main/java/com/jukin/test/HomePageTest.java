package com.jukin.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.login("jukinmedia", "qatest");
		jukinMediaHomePage = new JukinMediaHomePage(driver);
	}
	
	
	@Test
	public void verifyCompanyMotoPosition() {
		Assert.assertTrue(jukinMediaHomePage.isComapanyMotoBelowComanyName(), "company name is not above company moto" );
	}
	
	
	@Test(priority = 0)
	public void validateMailingListMouseHover() {
		softAssert = new SoftAssert();
		
		// Get color of mailing list before mouse hover
		String beforeHoverColorCode = getColorCode();
		softAssert.assertEquals(beforeHoverColorCode, "#ffffff"); // check if color is white
		
		// Perform mouse hover
		jukinMediaHomePage.hoverOverMailingList();
		
		// Get color of mailing list after mouse hover
		String afterHoverColorCode = getColorCode();
		softAssert.assertEquals(afterHoverColorCode, "#ffff00"); // check if color is yellow
		
		softAssert.assertAll();
	}

	private String getColorCode() {
		Color color = Color.fromString(jukinMediaHomePage
				.getMailingListColor());
		return color.asHex();
	}

	
	
	@Test(priority = 1)
	public void submitBlankForm() {
		jukinMediaHomePage.clickSubmit();
		assertEquals(jukinMediaHomePage.getPhoneError(),
				"Please enter phone number.");
		Assert.assertTrue(jukinMediaHomePage.verifySubmitFailure(), "Mandatory validations are not working on form");
	}
	

	
	@Test(priority = 2)
	public void submitFormWithoutHowDidYouHearAbout() {
		driver.navigate().refresh();
		jukinMediaHomePage.fillFormWithoutHowDidYouHearAbout();
		Assert.assertTrue(jukinMediaHomePage.verifySubmitSuccess(), "Social media is not selected by default");
	}
	@Test(priority = 3)
	public void submitFormWithOutOtherText() {
		driver.navigate().refresh();
		jukinMediaHomePage.fillFormWithOutOtherText();
		Assert.assertTrue(jukinMediaHomePage.verifySubmitFailure(), "Other text required validation failed");
	}
	@Test(priority = 4)
	public void submitFormWithOtherText() {
		driver.navigate().refresh();
		jukinMediaHomePage.fillFormWithOtherText();
		Assert.assertTrue(jukinMediaHomePage.verifySubmitSuccess(), "Submit button not working");
	}
	@Test(priority = 5)
	public void submitFormWithOutRate() {
		driver.navigate().refresh();
		jukinMediaHomePage.fillFormWithOutRate();
		Assert.assertTrue(jukinMediaHomePage.verifySubmitFailure(), "rate required validation failed");
	}
	@Test(priority = 6)
	public void submitFormWithNoRecommendationWithOutWhyNot() {
		driver.navigate().refresh();
		jukinMediaHomePage.fillFormWithNoRecommendationWithOutWhyNot();
		Assert.assertTrue(jukinMediaHomePage.verifySubmitFailure(), "why not required validation failed");
	}
	@Test(priority = 7)
	public void submitFormWithNoRecommendationWithWhyNot() {
		driver.navigate().refresh();
		jukinMediaHomePage.fillFormWithNoRecommendationWithWhyNot();
		Assert.assertTrue(jukinMediaHomePage.verifySubmitSuccess(), "Submit button not working" );
	}
	@Test(priority = 8)
	public void submitFormWithOutFirstName() {
		driver.navigate().refresh();
		jukinMediaHomePage.fillFormWithOutFirstName();
		Assert.assertTrue(jukinMediaHomePage.verifySubmitFailure(), "First name required validation failed");
	}
	@Test(priority = 9)
	public void submitFormWithOutLastName() {
		driver.navigate().refresh();
		jukinMediaHomePage.fillFormWithoutLastName();
		Assert.assertTrue(jukinMediaHomePage.verifySubmitFailure(), "Last name required validation failed");
	}
	@Test(priority = 10)
	public void submitFormWithOutEmail() {
		driver.navigate().refresh();
		jukinMediaHomePage.fillFormWithOutEmail();
		Assert.assertTrue(jukinMediaHomePage.verifySubmitFailure(), "Email required validation failed");
	}

	@Test(priority = 11)
	public void submitFormWithOutPhone() {
		driver.navigate().refresh();
		jukinMediaHomePage.fillFormPhoneNumber();
		Assert.assertTrue(jukinMediaHomePage.verifySubmitFailure(), "Phone required validation failed");
	}

	@Test(priority = 12)
	public void submitFormWithInvalidPhone() {
		driver.navigate().refresh();
		jukinMediaHomePage.fillFormInvalidPhoneNumber();
		Assert.assertTrue(jukinMediaHomePage.verifySubmitFailure(), "Phone number validation failed");
	}
	@Test(priority = 13)
	public void submitFilledForm() {
		driver.navigate().refresh();
		jukinMediaHomePage.fillForm();
		Assert.assertTrue(jukinMediaHomePage.verifySubmitSuccess());
		jukinMediaHomePage.closeSuccessPopup();
	}
	
	@AfterTest
	public void closeSuccessPopUpIfOpen() {
		try {
			System.out.println("visited********************");
			if (jukinMediaHomePage.verifySubmitSuccess()) {
				System.out.println("close popup");
				jukinMediaHomePage.closeSuccessPopup();
				
			}
		} catch (Exception e) {
			System.out.println("No problem - not on success pop up");
		}
	}
	
}
