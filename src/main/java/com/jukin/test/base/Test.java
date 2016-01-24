package com.jukin.test.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new SafariDriver();
		driver.get("http://qatest.jukinmedia.com/#/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("jukinmedia");
		driver.findElement(By.id("password")).sendKeys("qatest");
		driver.findElement(By.tagName("button")).click();

		WebElement ele1 = driver.findElement(By.xpath("//img"));
		WebElement ele2 = driver.findElement(By.xpath("//h1[contains(text(),'ACME')]"));
		WebElement ele3 = driver.findElement(By.xpath("//p[contains(text(),'ACME')]"));
		WebElement ele4 = driver.findElement(By.className("pointer"));
		WebElement ele5 = driver.findElement(By.xpath("//label[contains(text(),'How did you')]"));
		WebElement ele5a = driver.findElement(By.id("other"));
		WebElement ele6 = driver.findElement(By.xpath("//label[contains(text(),'Rate')]"));
		WebElement ele7 = driver.findElement(By.xpath("//label[contains(text(),'Would')]"));
		WebElement ele8 = driver
				.findElement(By.xpath("//b[contains(text(),'Contact')]/ancestor::form[1]/div[5]/div[1]/input"));
		WebElement ele9 = driver
				.findElement(By.xpath("//b[contains(text(),'Contact')]/ancestor::form[1]/div[5]/div[2]/input"));
		WebElement ele10 = driver
				.findElement(By.xpath("//b[contains(text(),'Contact')]/ancestor::form[1]/div[6]/div[1]/input"));
		WebElement ele11 = driver.findElement(By.id("phone"));
		
		WebElement radio5other = driver.findElement(By.xpath("//input[@value='other']"));
		WebElement radio7Yes = driver.findElement(By.name("14"));
		WebElement radio7No = driver.findElement(By.name("15"));
		WebElement ele7AWhy = driver.findElement(By.xpath("//b[text()='Why']"));
		WebElement ele7Anot = driver.findElement(By.xpath("//label[text()=' not? *']"));
		WebElement text7A = driver.findElement(By.xpath("//textarea"));

		System.out.println(ele1.getCssValue("vertical-align"));
		System.out.println(ele1.getCssValue("padding-left"));
		System.out.println("********************");

		System.out.println(ele2.getCssValue("font-family"));
		System.out.println(ele2.getCssValue("font-size"));
		System.out.println(ele2.getCssValue("text-align"));
		System.out.println("********************");

		System.out.println(ele3.getCssValue("font-family"));
		System.out.println(ele3.getCssValue("font-size"));
		System.out.println(ele3.getCssValue("font-style"));
		System.out.println(ele3.getCssValue("text-align"));
		System.out.println("********************");

		System.out.println(ele5.getCssValue("font-family"));
		System.out.println(ele5.getCssValue("font-size"));
		System.out.println(ele5.getCssValue("font-style"));
		System.out.println(ele5.getCssValue("margin-left"));
		System.out.println(ele5.getCssValue("margin-right"));
		System.out.println(ele5.getCssValue("margin"));

		radio5other.click();
		System.out.println("********************");

		System.out.println(ele5a.getAttribute("placeholder"));
		System.out.println("********************");

		System.out.println(ele6.getCssValue("font-family"));
		System.out.println(ele6.getCssValue("font-size"));
		System.out.println(ele6.getCssValue("font-style"));
		System.out.println(ele6.getCssValue("text-align"));
		System.out.println("********************");

		System.out.println(ele7.getCssValue("font-family"));
		System.out.println(ele7.getCssValue("font-size"));
		System.out.println(ele7.getCssValue("font-style"));
		System.out.println(ele7.getCssValue("text-align"));

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

		System.out.println(ele8.getCssValue("font-family"));
		System.out.println(ele8.getCssValue("font-size"));
		System.out.println(ele8.getCssValue("font-style"));
		System.out.println(ele8.getCssValue("text-align"));

		System.out.println(ele8.getAttribute("placeholder"));
		System.out.println("********************");

		System.out.println(ele9.getCssValue("font-family"));
		System.out.println(ele9.getCssValue("font-size"));
		System.out.println(ele9.getCssValue("font-style"));
		System.out.println(ele9.getCssValue("text-align"));

		System.out.println(ele9.getAttribute("placeholder"));
		System.out.println("********************");

		System.out.println(ele10.getCssValue("font-family"));
		System.out.println(ele10.getCssValue("font-size"));
		System.out.println(ele10.getCssValue("font-style"));
		System.out.println(ele10.getCssValue("text-align"));

		System.out.println(ele10.getAttribute("placeholder"));
		System.out.println("********************");

		System.out.println(ele11.getCssValue("font-family"));
		System.out.println(ele11.getCssValue("font-size"));
		System.out.println(ele11.getCssValue("font-style"));
		System.out.println(ele11.getCssValue("text-align"));

		System.out.println(ele11.getAttribute("placeholder"));
		System.out.println("********************");
		ele4.click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// String mainPage = driver.getWindowHandle();

		// Alert alt = driver.switchTo().alert();

		/*
		 * Set availableWindows = driver.getWindowHandles(); System.out.println(
		 * "Handle Size:" + availableWindows.size()); long timeoutEnd =
		 * System.currentTimeMillis() + 30000; while (availableWindows.size() ==
		 * 1) { Thread.sleep(100); availableWindows = driver.getWindowHandles();
		 * if (System.currentTimeMillis() > timeoutEnd) { System.out.println(
		 * "Comments and Attachments Modal popup TimeOut Occured"); } }
		 * System.out.println("Handle Size:" + availableWindows.size());
		 * 
		 */
		
		int keyInput[] = { KeyEvent.VK_T, KeyEvent.VK_E, KeyEvent.VK_L, KeyEvent.VK_AT, KeyEvent.VK_G, KeyEvent.VK_M,
				KeyEvent.VK_A, KeyEvent.VK_I, KeyEvent.VK_L, KeyEvent.VK_PERIOD, KeyEvent.VK_C, KeyEvent.VK_O,
				KeyEvent.VK_M };	

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		WebElement ele4a = driver.findElement(By.id("myModalLabel"));
		WebElement ele4b = driver

		.findElement(By.xpath("//label[contains(text(),'certify ')]/preceding-sibling::input"));
		WebElement ele4c = driver.findElement(By.xpath("//label[contains(text(),'certify ')]"));

		System.out.println("pop up " + ele4a.getCssValue("font-family"));
		System.out.println("pop up " + ele4a.getCssValue("font-size"));
		System.out.println("pop up " + ele4a.getCssValue("font-style"));
		System.out.println(ele4a.getCssValue("text-align"));
		System.out.println("********************");
		System.out.println(ele4b.getCssValue("font-family"));
		System.out.println(ele4b.getCssValue("font-size"));
		System.out.println(ele4b.getCssValue("font-style"));
		System.out.println(ele4b.getCssValue("text-align"));

		System.out.println(ele4b.getAttribute("placeholder"));
		System.out.println("********************");

		System.out.println(ele4c.getCssValue("font-family"));
		System.out.println(ele4c.getCssValue("font-size"));
		System.out.println(ele4c.getCssValue("font-style"));
		System.out.println(ele4c.getCssValue("text-align"));

		
		for (int i = 0; i < keyInput.length; i++) {
			if (keyInput[i] == 0x0200) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_2);
				robot.keyRelease(KeyEvent.VK_2);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			} else {
				robot.keyPress(keyInput[i]);
				robot.delay(100);
			}
		}
		 

		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);

		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER); // Save Btn

		// alt.accept();
		// driver.switchTo().window(mainPage);nium
		ele4.click();
		
		//WebElement ele13 = driver.findElement(By.xpath("//button[text()='Submit']"));
		//ele13.click();

	}

}
