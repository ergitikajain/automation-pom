package com.jukin.test.base;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Login {
	WebDriver driver; 	
	private static final String arialFontFamily = "Arial,sans-serif";
	
	@Test
	public void validateLogo() {
		WebElement ele1 = driver.findElement(By.xpath("//img"));
		assertEquals(ele1.getCssValue("vertical-align") , "middle");
		System.out.println(ele1.getCssValue("padding-left"));
		System.out.println(ele1.getCssValue("padding-right"));
		System.out.println("********************");
	}
	
	@Test
	public void validateMoto() {
		WebElement ele3 = driver.findElement(By.xpath("//p[contains(text(),'ACME')]"));
		System.out.println(ele3.getCssValue("font-family"));
		System.out.println(ele3.getCssValue("font-size"));
		System.out.println(ele3.getCssValue("font-style"));
		System.out.println(ele3.getCssValue("text-align"));
		System.out.println("********************");
	}
	
	@Test
	public void validateCompanyName() {
		WebElement ele2 = driver.findElement(By.xpath("//h1[contains(text(),'ACME')]"));
		System.out.println(ele2.getCssValue("font-family"));
		System.out.println(ele2.getCssValue("font-size"));
		System.out.println(ele2.getCssValue("text-align"));
		System.out.println("********************");
	}
	
	@Test
	public void validateHowDidYouHearAbout() {
		WebElement ele5 = driver.findElement(By.xpath("//label[contains(text(),'How did you')]"));
		System.out.println(ele5.getCssValue("font-family"));
		System.out.println(ele5.getCssValue("font-size"));
		System.out.println(ele5.getCssValue("font-style"));
		System.out.println(ele5.getCssValue("margin-left"));
		System.out.println(ele5.getCssValue("margin-right"));
		System.out.println(ele5.getCssValue("margin"));
	}
	
	@Test
	public void validateRateYourExperience() {
		WebElement ele6 = driver.findElement(By.xpath("//label[contains(text(),'Rate')]"));
		System.out.println(ele6.getCssValue("font-family"));
		System.out.println(ele6.getCssValue("font-size"));
		System.out.println(ele6.getCssValue("font-style"));
		System.out.println(ele6.getCssValue("text-align"));
		System.out.println("********************");
	}
	
	@Test
	public void validateWouldYouRecommend() {
		WebElement ele7 = driver.findElement(By.xpath("//label[contains(text(),'Would')]"));
		assertEquals(ele7.getCssValue("font-family"), arialFontFamily);
		assertEquals(ele7.getCssValue("font-size"), "18px");
		assertEquals(ele7.getCssValue("text-align"), "start");
	}
	
	@Test
	public void validateWouldYouRecommendOptions() {
		WebElement radio7Yes = driver.findElement(By.name("14"));
		WebElement radio7No = driver.findElement(By.name("15"));
		System.out.println("rssfgfdgf" + radio7Yes.getText());
	}
	
	@Test
	public void validateFirstName() {
		WebElement ele8 = driver
				.findElement(By.xpath("//b[contains(text(),'Contact')]/ancestor::form[1]/div[5]/div[1]/input"));
		System.out.println(ele8.getCssValue("font-family"));
		System.out.println(ele8.getCssValue("font-size"));
		System.out.println(ele8.getCssValue("font-style"));
		System.out.println(ele8.getCssValue("text-align"));
		System.out.println(ele8.getAttribute("placeholder"));
	}
	
	@Test
	public void validateLastName() {
		WebElement ele9 = driver
				.findElement(By.xpath("//b[contains(text(),'Contact')]/ancestor::form[1]/div[5]/div[2]/input"));
		System.out.println(ele9.getCssValue("font-family"));
		System.out.println(ele9.getCssValue("font-size"));
		System.out.println(ele9.getCssValue("font-style"));
		System.out.println(ele9.getCssValue("text-align"));

		System.out.println(ele9.getAttribute("placeholder"));
		System.out.println("********************");
	}
	
	@Test
	public void validateEmail() {
		WebElement ele10 = driver
				.findElement(By.xpath("//b[contains(text(),'Contact')]/ancestor::form[1]/div[6]/div[1]/input"));
		System.out.println(ele10.getCssValue("font-family"));
		System.out.println(ele10.getCssValue("font-size"));
		System.out.println(ele10.getCssValue("font-style"));
		System.out.println(ele10.getCssValue("text-align"));

		System.out.println(ele10.getAttribute("placeholder"));
		System.out.println("********************");
	}	
	
	@Test
	public void validatePhoneNumber() {
		WebElement ele11 = driver.findElement(By.id("phone"));
		System.out.println(ele11.getCssValue("font-family"));
		System.out.println(ele11.getCssValue("font-size"));
		System.out.println(ele11.getCssValue("font-style"));
		System.out.println(ele11.getCssValue("text-align"));

		System.out.println(ele11.getAttribute("placeholder"));
		System.out.println("********************");
	}
	
	@Test
	public void validateSubmit() {
		WebElement ele13 = driver.findElement(By.xpath("//button[text()='Submit']"));
		System.out.println(ele13.getCssValue("font-family"));
		System.out.println(ele13.getCssValue("font-size"));
		System.out.println(ele13.getCssValue("font-style"));
		System.out.println(ele13.getCssValue("text-align"));

		System.out.println(ele13.getAttribute("placeholder"));
		System.out.println("********************");
	}
	
	@Test
	@Deprecated
	public void matchStyles() {
		/*System.out.println(driver.findElement(By.tagName("h1")).getCssValue("font"));
		System.out.println(driver.findElement(By.tagName("h1")).getCssValue("font-size"));
		System.out.println(driver.findElement(By.tagName("p")).getCssValue("font-family"));
		System.out.println(driver.findElement(By.tagName("p")).getCssValue("font-size"));
		System.out.println(driver.findElement(By.tagName("p")).getCssValue("font-style"));
		System.out.println(driver.findElement(By.tagName("p")).getCssValue("font"));*/
		
		WebElement ele4 = driver.findElement(By.className("pointer"));
		
		WebElement ele5a = driver.findElement(By.id("other"));
		
		
		WebElement radio5other = driver.findElement(By.xpath("//input[@value='other']"));
		WebElement radio7Yes = driver.findElement(By.name("14"));
		WebElement radio7No = driver.findElement(By.name("15"));
		WebElement ele7AWhy = driver.findElement(By.xpath("//b[text()='Why']"));
		WebElement ele7Anot = driver.findElement(By.xpath("//label[text()=' not? *']"));
		WebElement text7A = driver.findElement(By.xpath("//textarea"));
		radio5other.click();
		System.out.println("********************");

		System.out.println(ele5a.getAttribute("placeholder"));
		System.out.println("********************");

		radio7Yes.click();
		radio7No.click();
		System.out.println("********************");

		System.out.println(ele7AWhy.getCssValue("font-family"));
		System.out.println(ele7AWhy.getCssValue("font-size"));
		System.out.println(ele7AWhy.getCssValue("font-style"));
		System.out.println(ele7AWhy.getCssValue("text-align"));
		System.out.println("********************");

		System.out.println(ele7Anot.getCssValue("font-family"));
		System.out.println(ele7Anot.getCssValue("font-size"));
		System.out.println(ele7Anot.getCssValue("font-style"));
		System.out.println(ele7Anot.getCssValue("text-align"));
		System.out.println("********************");

		System.out.println(text7A.getCssValue("font-family"));
		System.out.println(text7A.getCssValue("font-size"));
		System.out.println(text7A.getCssValue("font-style"));
		System.out.println(text7A.getCssValue("text-align"));

		System.out.println(text7A.getAttribute("placeholder"));
		System.out.println("********************");

		
		System.out.println("********************");

		
		//Assert.assertEquals("Arial", driver.findElement(By.tagName("h1")).getCssValue("font"));
		
	}

	@BeforeSuite
	public void beforeSuite() {
		driver = new FirefoxDriver();
		driver.get("http://qatest.jukinmedia.com/#/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("jukinmedia");
		driver.findElement(By.id("password")).sendKeys("qatest");
		driver.findElement(By.tagName("button")).click();
	}

	@AfterSuite
	public void afterSuite() {
		driver.close();
		
	}
	
}
