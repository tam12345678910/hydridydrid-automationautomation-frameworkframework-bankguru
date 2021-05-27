package com.pageObject.bankguru;

import org.openqa.selenium.WebDriver;

import com.pageUIs.bankguru.PaymentWithdrawalPUI;

import commons.BasePage;
import io.qameta.allure.Step;

public class PaymentWithdrawalPO extends BasePage {

	WebDriver driver;
	
	public PaymentWithdrawalPO(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Input to AccountNo textbox with value: {0}")
	public void enterToAccountNoAtWithdrawalForm(String accountId) {
		waitForElementVisible(driver, PaymentWithdrawalPUI.ACCOUNT_NO_TEXTBOX_AT_WITHDRAWAL_FORM);
		senkeysToElement(driver, PaymentWithdrawalPUI.ACCOUNT_NO_TEXTBOX_AT_WITHDRAWAL_FORM, accountId);
	}

	@Step("Input to Amount textbox with value: {0}")
	public void enterToAmountAtWithdrawalForm(String amountWithdrawal) {
		waitForElementVisible(driver, PaymentWithdrawalPUI.AMOUNT_TEXTBOX_AT_WITHDRAWAL_FORM);
		senkeysToElement(driver, PaymentWithdrawalPUI.AMOUNT_TEXTBOX_AT_WITHDRAWAL_FORM, amountWithdrawal);		
	}

	@Step("Input to UserID textbox with value: {0}")
	public void enterToDescriptionAtWithdrawalForm(String descriptionWithdrawal) {
		waitForElementVisible(driver, PaymentWithdrawalPUI.DESCRIPTION_TEXTBOX_AT_WITHDRAWAL_FORM);
		senkeysToElement(driver, PaymentWithdrawalPUI.DESCRIPTION_TEXTBOX_AT_WITHDRAWAL_FORM, descriptionWithdrawal);			
	}

	@Step("Click to submit button at withdrawal form")
	public void clickToSubmitButtonAtWithdrawalForm() {
		waitForElementClickable(driver, PaymentWithdrawalPUI.SUBMIT_BUTTON_AT_WITHDRAWAL_FORM);
		clickToElement(driver, PaymentWithdrawalPUI.SUBMIT_BUTTON_AT_WITHDRAWAL_FORM);		
	}

	@Step("Get text current amount contents")
	public String getTextCurrentAmountContents() {
		waitForElementVisible(driver, PaymentWithdrawalPUI.GET_TEXTCURRENT_AMOUNT__WITHDRAWAL_SUCCESSFULLY);
		return getElementText(driver, PaymentWithdrawalPUI.GET_TEXTCURRENT_AMOUNT__WITHDRAWAL_SUCCESSFULLY);
	}

}

