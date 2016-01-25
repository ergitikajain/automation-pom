package com.jukin.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jukin.pageobjects.JukinMediaForm;
import com.jukin.pageobjects.JukinMediaLogin;
import com.jukin.test.base.TestBaseSetup;

public class JukinMediaFormValidationTest extends TestBaseSetup {


	private WebDriver driver;
	JukinMediaForm jukinMediaForm;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		JukinMediaLogin loginPage = new JukinMediaLogin(driver);
		loginPage.loginToJukinMedia("jukinmedia", "qatest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		jukinMediaForm = new JukinMediaForm(driver);
	}

	@Test
	public void submitBlankForm() {
		jukinMediaForm.clickSubmit();
		assertEquals(jukinMediaForm.getPhoneError(), "Please enter phone number.");
	}
	
	@Test
	public void verifyNoReccommendation() {
		jukinMediaForm.getRecommendRadioButtons().get(0).click();
		Assert.assertFalse(jukinMediaForm.isDisplayedWhy());
		Assert.assertFalse(jukinMediaForm.isDisplayedNot());
		Assert.assertFalse(jukinMediaForm.isDisplayedTextArea());
		
		jukinMediaForm.getRecommendRadioButtons().get(1).click();
		Assert.assertTrue(jukinMediaForm.isDisplayedWhy());
		Assert.assertTrue(jukinMediaForm.isDisplayedNot());
		Assert.assertTrue(jukinMediaForm.isDisplayedTextArea());
		
	}
	

	@Test
	public void submitFilledForm() {
		jukinMediaForm.fillForm();
		jukinMediaForm.clickSubmit();

		Assert.assertTrue(jukinMediaForm.verifySubmitButton());
	}
}
