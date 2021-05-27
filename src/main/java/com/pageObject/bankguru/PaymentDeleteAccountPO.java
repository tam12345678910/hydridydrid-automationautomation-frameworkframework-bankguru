package com.pageObject.bankguru;

import org.openqa.selenium.WebDriver;

import com.pageUIs.bankguru.PaymentDeleteAccountPUI;

import commons.BasePage;

public class PaymentDeleteAccountPO extends BasePage {

	WebDriver driver;
	
	public PaymentDeleteAccountPO(WebDriver driver) {
		this.driver = driver;
	}

	public void enterToAccountNoAtDeleteAccountForm(String accountId) {
		waitForElementVisible(driver, PaymentDeleteAccountPUI.ACCOUNT_NO_TEXTBOX_AT_DELETE_FORM);
		senkeysToElement(driver, PaymentDeleteAccountPUI.ACCOUNT_NO_TEXTBOX_AT_DELETE_FORM, accountId);
	}

	public void clickToSubmitButtonAtDeleteAccoutnForm() {
		waitForElementClickable(driver, PaymentDeleteAccountPUI.SUBMIT_BUTTON_AT_DELETE_FORM);
		clickToElement(driver, PaymentDeleteAccountPUI.SUBMIT_BUTTON_AT_DELETE_FORM);		
	}

	public String getMessageAccountDeleteSuccessfully() {
		waitForAlertPresence(driver);
		return getAlertText(driver);
	}

}

