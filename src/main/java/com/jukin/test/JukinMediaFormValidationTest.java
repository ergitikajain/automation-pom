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

public class JukinMediaFormValidationTest extends TestBaseSetup {


	private WebDriver driver;
	JukinMediaForm jukinMediaForm;
	JukinMediaPopup jukinMediaPopup;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		JukinMediaLogin loginPage = new JukinMediaLogin(driver);
		loginPage.loginToJukinMedia("jukinmedia", "qatest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		jukinMediaForm = new JukinMediaForm(driver);
	}

	@Test(priority=0)
	public void submitBlankForm() {
		jukinMediaForm.clickSubmit();
		assertEquals(jukinMediaForm.getPhoneError(), "Please enter phone number.");
	}
	
	@Test(priority=3)
	public void submitFilledForm() {
		jukinMediaForm.fillForm();
		jukinMediaForm.clickSubmit();

		Assert.assertTrue(jukinMediaForm.verifySubmitButton());
	}
	
	@Test
	public void verifyPopUpCloseBtn(){
		jukinMediaForm.clickMailingList();
		jukinMediaPopup = new JukinMediaPopup(driver);
		assertEquals(jukinMediaPopup.getSignUpLabelText(),
				"Sign Up for Out Newsleter");
		jukinMediaPopup.clickCloseBtn();
		assertEquals(jukinMediaForm.getCompanyNameText(),
				"ACME Vacuum Cleaner & Anvil Co.");
			
	}
	
	@Test
	public void verifyPopUpSignUpBtn(){
		jukinMediaForm.clickMailingList();
		jukinMediaPopup = new JukinMediaPopup(driver);
		assertEquals(jukinMediaPopup.getSignUpLabelText(),
				"Sign Up for Out Newsleter");
		jukinMediaPopup.clickSignupBtn();
		assertEquals(jukinMediaForm.getCompanyNameText(),
				"ACME Vacuum Cleaner & Anvil Co.");
			
	}
}
