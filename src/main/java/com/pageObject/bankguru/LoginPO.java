package com.pageObject.bankguru;

import org.openqa.selenium.WebDriver;

import com.pageUIs.bankguru.LoginPUI;

import commons.BasePage;
import io.qameta.allure.Step;

public class LoginPO extends BasePage {

	WebDriver driver;

	public LoginPO(WebDriver driver) {
		this.driver = driver;
	}
	
	@Step("Input to UserID textbox with value: {0}")
	public void enterToUserIDTextBox(String userID) {
		waitForElementVisible(driver, LoginPUI.USER_ID_TEXTBOX);
		senkeysToElement(driver, LoginPUI.USER_ID_TEXTBOX, userID);
	}

	@Step("Input to Password textbox with value: {0}")
	public void enterToPassword(String password) {
		waitForElementVisible(driver, LoginPUI.PASSWORD);
		senkeysToElement(driver, LoginPUI.PASSWORD, password);
	}

	@Step("Click To Submit Button")
	public HomePO clickToLoginButton() {
		waitForElementClickable(driver, LoginPUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPUI.LOGIN_BUTTON);
		return PageGeneratorManager.getHomePage(driver);
	}
}
