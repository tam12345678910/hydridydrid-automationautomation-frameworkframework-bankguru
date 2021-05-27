package com.pageObject.bankguru;

import org.openqa.selenium.WebDriver;

import com.pageUIs.bankguru.PaymentTransferPUI;

import commons.BasePage;
import io.qameta.allure.Step;

public class PaymentTransferPO extends BasePage {

	WebDriver driver;
	
	public PaymentTransferPO(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Input to Payers account textbox with value: {0}")
	public void enterToPayersAccountAtFundTransferForm(String accountId) {
		waitForElementVisible(driver, PaymentTransferPUI.PAYERS_ACCOUNT_NO_TEXTBOX_AT_TRANSFER_FORM);
		senkeysToElement(driver, PaymentTransferPUI.PAYERS_ACCOUNT_NO_TEXTBOX_AT_TRANSFER_FORM, accountId);		
	}

	@Step("Input to Payees account textbox with value: {0}")
	public void enterToPayeesAccountAtFundTransferForm(String payeesAccountNo) {
		waitForElementVisible(driver, PaymentTransferPUI.PAYEES_ACCOUNT_NO_TEXTBOX_AT_TRANSFER_FORM);
		senkeysToElement(driver, PaymentTransferPUI.PAYEES_ACCOUNT_NO_TEXTBOX_AT_TRANSFER_FORM, payeesAccountNo);		
	}

	@Step("Input to Amount textbox with value: {0}")
	public void enterToAmountAtFundTransferForm(String amount) {
		waitForElementVisible(driver, PaymentTransferPUI.AMOUNT_TEXTBOX_AT_TRANSFER_FORM);
		senkeysToElement(driver, PaymentTransferPUI.AMOUNT_TEXTBOX_AT_TRANSFER_FORM, amount);		
	}

	@Step("Input to Description textbox with value: {0}")
	public void enterToDescriptionAtFundTransferForm(String description) {
		waitForElementVisible(driver, PaymentTransferPUI.DESCRIPTION_TEXTBOX_AT_TRANSFER_FORM);
		senkeysToElement(driver, PaymentTransferPUI.DESCRIPTION_TEXTBOX_AT_TRANSFER_FORM, description);		
	}
	@Step("Click to submit button at transfer form")
	public void clickToSubmitButtonAtTransferForm() {
		waitForElementClickable(driver, PaymentTransferPUI.SUBMIT_BUTTON_AT_TRANSFER_FORM);
		clickToElement(driver, PaymentTransferPUI.SUBMIT_BUTTON_AT_TRANSFER_FORM);
	}

	@Step("Get tex current amount contents")
	public String getTextCurrentAmountContents() {
		waitForElementVisible(driver, PaymentTransferPUI.GET_TEXT_AMOUNT_AT_TRANSFER_FORM);
		return getElementText(driver, PaymentTransferPUI.GET_TEXT_AMOUNT_AT_TRANSFER_FORM);
	}


}

