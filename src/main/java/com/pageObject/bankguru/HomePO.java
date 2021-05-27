package com.pageObject.bankguru;

import org.openqa.selenium.WebDriver;

import com.pageUIs.bankguru.HomePUI;

import commons.BasePage;
import io.qameta.allure.Step;

public class HomePO extends BasePage {

	WebDriver driver;

	public HomePO(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Get text Home Displayed")
	public String getTextHomeDisPlayed() {
		waitForElementVisible(driver, HomePUI.HOME_PAGE_DISPLAYED);
		return getElementText(driver, HomePUI.HOME_PAGE_DISPLAYED);
	}

}
