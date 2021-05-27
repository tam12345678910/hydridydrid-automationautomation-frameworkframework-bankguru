package com.pageObject.bankguru;

import org.openqa.selenium.WebDriver;

import com.pageUIs.bankguru.PaymentEditAccountPUI;

import commons.BasePage;
import io.qameta.allure.Step;

public class PaymentEditAccountPO extends BasePage {

	WebDriver driver;
	
	public PaymentEditAccountPO(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Input to AccountId textbox with value: {0}")
	public void enterToAccountIDTexbox(String accountId) {
		waitForElementVisible(driver, PaymentEditAccountPUI.ACCOUNT_ID_EDIT_ACCOUNT_FORM_TEXTBOX);
		senkeysToElement(driver, PaymentEditAccountPUI.ACCOUNT_ID_EDIT_ACCOUNT_FORM_TEXTBOX, accountId);		
	}

	@Step("Click to submit button at edit account form")
	public void clickToSubmiButtonAtEditAccountForm() {
		waitForElementClickable(driver, PaymentEditAccountPUI.SUBMIT_EDIT_ACCOUNT_FORM_BUTTON);
		clickToElement(driver, PaymentEditAccountPUI.SUBMIT_EDIT_ACCOUNT_FORM_BUTTON);		
	}

	@Step("Select account type at add edit account form")
	public void selectAccountTypeAtAddEditAccountForm(String editAccountType) {
		waitForElementClickable(driver, PaymentEditAccountPUI.ACCOUNT_TYPE_EDIT_ACCOUNT_FORM_DROPDOWN);
		selectDropdownByText(driver,PaymentEditAccountPUI.ACCOUNT_TYPE_EDIT_ACCOUNT_FORM_DROPDOWN, editAccountType);
	}

	@Step("Get message edit successfully")
	public String getMessageEditSuccessFully() {
		waitForElementVisible(driver, PaymentEditAccountPUI.GET_MESSAGE_EDIT_SUCCESSFULLY);
		return getElementText(driver, PaymentEditAccountPUI.GET_MESSAGE_EDIT_SUCCESSFULLY);
	}

	@Step("Click to submit button at edit account entry form")
	public void clickToSubmiButtonAtEditAccountEntryForm() {
		waitForElementClickable(driver, PaymentEditAccountPUI.SUBMIT_EDIT_ACCOUNT_FORM_BUTTON);
		clickToElement(driver, PaymentEditAccountPUI.SUBMIT_EDIT_ACCOUNT_FORM_BUTTON);		
	}
}

