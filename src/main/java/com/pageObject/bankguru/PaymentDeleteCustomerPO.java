package com.pageObject.bankguru;

import org.openqa.selenium.WebDriver;

import com.pageUIs.bankguru.PaymentDeleteAccountPUI;
import com.pageUIs.bankguru.PaymentDeleteCustomerPUI;

import commons.BasePage;

public class PaymentDeleteCustomerPO extends BasePage {

	WebDriver driver;
	
	public PaymentDeleteCustomerPO(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickToSubmitButtonAtDeleteAccoutnForm() {
		waitForElementClickable(driver, PaymentDeleteAccountPUI.SUBMIT_BUTTON_AT_DELETE_FORM);
		clickToElement(driver, PaymentDeleteAccountPUI.SUBMIT_BUTTON_AT_DELETE_FORM);		
	}

	public String getMessageAccountDeleteSuccessfully() {
		waitForAlertPresence(driver);
		return getAlertText(driver);
	}

	public void enterToCustomerIdAtDeleteAccountForm(String accountId) {
		waitForElementVisible(driver, PaymentDeleteCustomerPUI.CUSTOMER_ID_TEXTBOX_AT_DELETE_FORM);
		senkeysToElement(driver, PaymentDeleteCustomerPUI.CUSTOMER_ID_TEXTBOX_AT_DELETE_FORM, accountId);
	}

	public void clickToSubmitButtonAtDeleteCustomerForm() {
		waitForElementClickable(driver, PaymentDeleteCustomerPUI.SUBMIT_BUTTON_AT_DELETE_FORM);
		clickToElement(driver, PaymentDeleteCustomerPUI.SUBMIT_BUTTON_AT_DELETE_FORM);		
	}

	public String getMessageCustomerDeleteSuccessfully() {
		waitForAlertPresence(driver);
		return getAlertText(driver);
	}

}

