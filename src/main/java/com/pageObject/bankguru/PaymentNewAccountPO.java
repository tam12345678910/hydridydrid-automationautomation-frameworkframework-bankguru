package com.pageObject.bankguru;

import org.openqa.selenium.WebDriver;

import com.pageUIs.bankguru.PaymentNewAccountPUI;

import commons.BasePage;
import io.qameta.allure.Step;

public class PaymentNewAccountPO extends BasePage {

	WebDriver driver;
	
	public PaymentNewAccountPO(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Input to CustomerID textbox with value: {0}")
	public void enterToCustomerIDTexbox(String userId) {
		waitForElementVisible(driver, PaymentNewAccountPUI.CUSTOMER_ID_ADD_NEW_ACCOUNT_FORM_TEXTBOX);
		senkeysToElement(driver, PaymentNewAccountPUI.CUSTOMER_ID_ADD_NEW_ACCOUNT_FORM_TEXTBOX, userId);			
	}

	@Step("Select account type add new account form")
	public void selectAccountTypeAtAddNewAccountForm(String accountType) {
		waitForElementClickable(driver, PaymentNewAccountPUI.ACCOUNT_TYPE_ADD_NEW_ACCOUNT_FORM_DROPDOWN);
		selectDropdownByText(driver,PaymentNewAccountPUI.ACCOUNT_TYPE_ADD_NEW_ACCOUNT_FORM_DROPDOWN, accountType);
	}

	@Step("Input to Initia textbox with value: {0}")
	public void enterToInitialDepositAtAddNewAccountForm(String initialDeposit) {
		waitForElementVisible(driver, PaymentNewAccountPUI.INITIAL_DEPOSIT_ADD_NEW_ACCOUNT_FORM_TEXTBOX);
		senkeysToElement(driver, PaymentNewAccountPUI.INITIAL_DEPOSIT_ADD_NEW_ACCOUNT_FORM_TEXTBOX, initialDeposit);					
	}

	@Step("Click to submit button at add new account form")
	public void clickToSubmitButtonAtAddNewAccountForm() {
		waitForElementClickable(driver, PaymentNewAccountPUI.SUBMIT_ADD_NEW_ACCOUNT_FORM_BUTTON);
		clickToElement(driver, PaymentNewAccountPUI.SUBMIT_ADD_NEW_ACCOUNT_FORM_BUTTON);			
	}

	@Step("Get Account type value add new account form")
	public String getAccountTypeValueAtAddNewAccountForm() {
		waitForElementVisible(driver, PaymentNewAccountPUI.GET_ACCOUNT_TYPE_VALUE);
		return getElementText(driver, PaymentNewAccountPUI.GET_ACCOUNT_TYPE_VALUE);
	}

	@Step("Get deposit value at add new account form")
	public String getDepositValueAtAddNewAccountForm() {
		waitForElementVisible(driver, PaymentNewAccountPUI.GET_DEPOSIT_VALUE);
		return getElementText(driver, PaymentNewAccountPUI.GET_DEPOSIT_VALUE);
	}

	@Step("Get accountId text")
	public String getACcountIdText() {
		waitForElementVisible(driver, PaymentNewAccountPUI.GET_ACCOUNT_ID);
		return getElementText(driver, PaymentNewAccountPUI.GET_ACCOUNT_ID);
	}
}

