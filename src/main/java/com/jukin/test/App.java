package com.jukin.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriver driver = new SafariDriver();
		driver.get(""
				+ "");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("jukinmedia");
		driver.findElement(By.id("password")).sendKeys("qatest");
		driver.findElement(By.tagName("button")).click();
    }
}
