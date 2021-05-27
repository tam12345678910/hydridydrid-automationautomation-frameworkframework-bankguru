package com.pageObject.bankguru;

import org.openqa.selenium.WebDriver;

import com.pageUIs.bankguru.PaymentBalanceEnquiryPUI;

import commons.BasePage;
import io.qameta.allure.Step;

public class PaymentBalanceEnquiryPO extends BasePage {

	WebDriver driver;

	public PaymentBalanceEnquiryPO(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Input to Account No textbox with value: {0}")
	public void enterToAccountNoAtBalanceEnquiryForm(String accountId) {
		waitForElementVisible(driver, PaymentBalanceEnquiryPUI.ACCOUNT_NO_TEXTBOX_AT_BALANCE_FORM);
		senkeysToElement(driver, PaymentBalanceEnquiryPUI.ACCOUNT_NO_TEXTBOX_AT_BALANCE_FORM, accountId);
	}

	@Step("Click to submit button at balance enquiry form")
	public void clickToSubmitButtonAtBalanceEnquiryForm() {
		waitForElementClickable(driver, PaymentBalanceEnquiryPUI.SUBMIT_BUTTON_AT_BALANCE_FORM);
		clickToElement(driver, PaymentBalanceEnquiryPUI.SUBMIT_BUTTON_AT_BALANCE_FORM);
	}

	@Step("Get text balance contents")
	public String getTextBalanceContents() {
		waitForElementVisible(driver, PaymentBalanceEnquiryPUI.GET_TEXT_BALANCE_AT_BALANCE_FORM);
		return getElementText(driver, PaymentBalanceEnquiryPUI.GET_TEXT_BALANCE_AT_BALANCE_FORM);
	}

}
