package com.jukin.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.jukin.pageobjects.EmailValidator;

public class EmailValidatorTest {

	private EmailValidator emailValidator;

	SoftAssert softAssert;

	@BeforeClass
	public void initData() {
		emailValidator = new EmailValidator();
	}

	@DataProvider
	public Object[][] ValidEmailProvider() {
		return new Object[][] { { new String[] { "jvarsada@yahoo.com", "jvarsada-100@yahoo.com",
				"jvarsada111@jvarsada.com", "jvarsada-100@jvarsada.net", 
				 "jvarsada^100@gmail.com", "jvarsada-100@yahoo-test.com",
				"email@example.com", "firstname#lastname@example.com", "email@subdomain.example.com",
				"firstname$lastname@example.com", "1234567890@example.com",
				"email@example-one.com", "_______@example.com", "email@example.name", "email@example.museum",
				"email@example.co.jp", "firstname-lastname@example.com",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@test.com" } } };
	}

	@DataProvider
	public Object[][] InvalidEmailProvider() {
		return new Object[][] {
				{ new String[] { "jvarsada", "jvarsada@.com.my", "jvarsada123@gmail.a", "jvarsada123@.com",
						"jvarsada123@.com.com", ".jvarsada@jvarsada.com", "jvarsada()*@gmail.com", "jvarsada@%*.com",
						"jvarsada..2002@gmail.com", "jvarsada.@gmail.com", "jvarsada@jvarsada@gmail.com",
						"jvarsada@gmail.com.1a", "plainaddress", "#@%^%#$@#$@#.com", "@example.com",
						"Joe Smith <email@example.com>", "email.example.com", "email@example@example.com",
						".email@example.com", "email.@example.com", "email..email@example.com", "あいうえお@example.com",
						"email@example.com (Joe Smith)", "email@example", 
						"email@111.222.333.44444", "email@example..com", "Abc..123@example.com",
						"\"(),:;<>[\\]@example.com", "just\"not\"right@example.com",
						"this\\ is\\\"really\"not\\\\allowed@example.com",
						"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbffsdfsdfs@test.com" } } };
	}

	@Test(dataProvider = "ValidEmailProvider", priority=0)
	public void ValidEmailTest(String[] Email) {
		softAssert = new SoftAssert();
		for (String temp : Email) {
			boolean valid = emailValidator.validate(temp);
			System.out.println("Email is valid : " + temp + " , " + valid);
			softAssert.assertEquals(valid, true);
		}
		softAssert.assertAll();
	}

	@Test(dataProvider = "InvalidEmailProvider", priority=1)
	public void InValidEmailTest(String[] Email) {
		softAssert = new SoftAssert();
		for (String temp : Email) {
			boolean valid = emailValidator.validate(temp);
			System.out.println("Email is Invalid : " + temp + " , " + valid);
			Assert.assertEquals(valid, false);
		}
		softAssert.assertAll();
	}
}
