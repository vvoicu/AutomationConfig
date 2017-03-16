package com.tests;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Managed;

public class BaseTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Before
	public void variableSetup() {
//		System.setProperty("webdriver.chrome.driver", ConfigUtils.getChromePath());
	}
}
