package com.jukin.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jukin.pageobjects.JukinMediaLogin;
import com.jukin.test.base.TestBaseSetup;

public class JukinMediaLoginTest extends TestBaseSetup {

	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
	}

	@Test
	public void loginTest() {
		System.out.println("Login page test...");
		JukinMediaLogin loginPage = new JukinMediaLogin(driver);
		Assert.assertEquals(loginPage.getLoginTitle(),
				"Login");
		loginPage.loginToJukinMedia("jukinmedia", "qatest");
	}

}
