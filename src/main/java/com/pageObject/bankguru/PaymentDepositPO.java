package com.pageObject.bankguru;

import org.openqa.selenium.WebDriver;

import com.pageUIs.bankguru.PaymentDepositPUI;

import commons.BasePage;
import io.qameta.allure.Step;

public class PaymentDepositPO extends BasePage {

	WebDriver driver;

	public PaymentDepositPO(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Input to AccountNo textbox with value: {0}")
	public void enterToAccountNoAtDepositForm(String accountId) {
		waitForElementVisible(driver, PaymentDepositPUI.ACCOUNT_NO_AT_DEPOSIT_FORM);
		senkeysToElement(driver, PaymentDepositPUI.ACCOUNT_NO_AT_DEPOSIT_FORM, accountId);		
	}

	@Step("Input to Amount textbox with value: {0}")
	public void enterToAmountAtDepositForm(String amount) {
		waitForElementVisible(driver, PaymentDepositPUI.AMOUNT_AT_DEPOSIT_FORM);
		senkeysToElement(driver, PaymentDepositPUI.AMOUNT_AT_DEPOSIT_FORM, amount);
	}

	@Step("Input to Description textbox with value: {0}")
	public void enterToDescriptionAtDepositForm(String description) {
		waitForElementVisible(driver, PaymentDepositPUI.DESCRIPTION_AT_DEPOSIT_FORM);
		senkeysToElement(driver, PaymentDepositPUI.DESCRIPTION_AT_DEPOSIT_FORM, description);
	}

	@Step("Click to submit button at deposit form")
	public void clickToSubmitButtonAtDepositForm() {
		waitForElementClickable(driver, PaymentDepositPUI.SUBMIT_BUTTON_AT_DEPOSIT_FORM);
		clickToElement(driver, PaymentDepositPUI.SUBMIT_BUTTON_AT_DEPOSIT_FORM);
	}

	@Step("Get message displayed contents")
	public String getMessageDisplayedContents() {
		waitForElementVisible(driver, PaymentDepositPUI.GET_MESSAGE_DEPOSIT_SUCCESSFULLY);
		return getElementText(driver, PaymentDepositPUI.GET_MESSAGE_DEPOSIT_SUCCESSFULLY);
	}

}
