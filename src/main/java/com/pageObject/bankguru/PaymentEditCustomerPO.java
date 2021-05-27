package com.pageObject.bankguru;

import org.openqa.selenium.WebDriver;

import com.pageUIs.bankguru.PaymentEditCustomerPUI;

import commons.BasePage;
import io.qameta.allure.Step;

public class PaymentEditCustomerPO extends BasePage {

	WebDriver driver;

	public PaymentEditCustomerPO(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Input to UserID textbox with value: {0}")
	public void enterToUserIDTextBox(String userId) {
		waitForElementVisible(driver, PaymentEditCustomerPUI.EDIT_USERID_TEXTBOX);
		senkeysToElement(driver, PaymentEditCustomerPUI.EDIT_USERID_TEXTBOX, userId);
	}

	@Step("Click to submit button")
	public void clickToSubmitButton() {
		waitForElementVisible(driver, PaymentEditCustomerPUI.EDIT_SUBMIT_BUTTON);
		clickToElement(driver, PaymentEditCustomerPUI.EDIT_SUBMIT_BUTTON);
	}

	@Step("Input to Address textbox with value: {0}")
	public void enterToAddressTextBox(String editAddress) {
		waitForElementVisible(driver, PaymentEditCustomerPUI.EDIT_ADDRESS_TEXTBOX);
		senkeysToElement(driver, PaymentEditCustomerPUI.EDIT_ADDRESS_TEXTBOX, editAddress);
	}

	@Step("Input to City textbox with value: {0}")
	public void enterToCityTextBox(String editCity) {
		waitForElementVisible(driver, PaymentEditCustomerPUI.EDIT_CITY_TEXTBOX);
		senkeysToElement(driver, PaymentEditCustomerPUI.EDIT_CITY_TEXTBOX, editCity);
	}

	@Step("Input to State textbox with value: {0}")
	public void enterToStateTextBox(String editSate) {
		waitForElementVisible(driver, PaymentEditCustomerPUI.EDIT_STATE_TEXTBOX);
		senkeysToElement(driver, PaymentEditCustomerPUI.EDIT_STATE_TEXTBOX, editSate);
	}

	@Step("Input to Pin textbox with value: {0}")
	public void enterToPinTextBox(String pin) {
		waitForElementVisible(driver, PaymentEditCustomerPUI.EDIT_PIN_TEXTBOX);
		senkeysToElement(driver, PaymentEditCustomerPUI.EDIT_PIN_TEXTBOX, pin);
	}

	@Step("Click To Submit Edit button")
	public void clickToSubmitEditButton() {
		waitForElementVisible(driver, PaymentEditCustomerPUI.SUBMIT_BUTTON);
		clickToElement(driver, PaymentEditCustomerPUI.SUBMIT_BUTTON);
	}

	@Step("Get message Edit Successfully")
	public String getMessageEditSuccessFully() {
		waitForElementVisible(driver, PaymentEditCustomerPUI.GET_MESSAGE_EDIT_SUCCESSFULLY);
		return getElementText(driver, PaymentEditCustomerPUI.GET_MESSAGE_EDIT_SUCCESSFULLY);
	}

	@Step("Get message Edit dose not exist")
	public String getMessageCustomerDoesNotExist() {
		waitForAlertPresence(driver);
		return getAlertText(driver);
	}
}
