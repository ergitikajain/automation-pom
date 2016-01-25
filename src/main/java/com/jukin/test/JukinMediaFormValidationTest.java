package com.jukin.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
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
	public void submitFilledForm() {
		jukinMediaForm.clickSubmit();
		assertEquals(jukinMediaForm.getPhoneError(), "Please enter phone number.");
	}
}
