package com.jukin.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jukin.pageobjects.JukinMediaLogin;
import com.jukin.test.base.TestBaseSetup;

public class LoginTest extends TestBaseSetup {

	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
	}

	@Test
	public void loginTest() {
		System.out.println("Login page test...");
		JukinMediaLogin loginPage = new JukinMediaLogin(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(loginPage.getLoginTitle(), "Login");
		loginPage.login("jukinmedia", "qatest");
	}
}
