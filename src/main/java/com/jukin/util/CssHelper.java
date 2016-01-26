package com.jukin.util;

import org.openqa.selenium.WebElement;

public class CssHelper {

	public static String getFontFamily(WebElement webElement) {
		return webElement.getCssValue("font-family");
	}
	
	public static String getFontSize(WebElement webElement) {
		return webElement.getCssValue("font-size");
	}

	public static String getFontStyle(WebElement webElement) {
		return webElement.getCssValue("font-style");
	}
	
	public static String getTextAlign(WebElement webElement) {
		return webElement.getCssValue("text-align");
	}
	
	public static String getTextboxPlaceholder(WebElement webElement) {
		return webElement.getAttribute("placeholder");
	}
	
	public static String getImageVerticalAlign(WebElement webElement) {
		return webElement.getCssValue("vertical-align");
	}
	
	public static String getImageLeftAlign(WebElement webElement) {
		return webElement.getCssValue("padding-left");
	}
	
	public static String getBtnAlign(WebElement webElement) {
		return webElement.getCssValue("float");
	}
	
}
