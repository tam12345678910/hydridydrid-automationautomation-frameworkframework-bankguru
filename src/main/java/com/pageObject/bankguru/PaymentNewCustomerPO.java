package com.pageObject.bankguru;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.pageUIs.bankguru.PaymentNewCustomerPUI;

import commons.BasePage;
import io.qameta.allure.Step;

public class PaymentNewCustomerPO extends BasePage {

	WebDriver driver;
	
	public PaymentNewCustomerPO(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Input to Customer Name textbox with value: {0}")
	public void enterToCustomerNameTextBox(String customerName) {
		waitForElementVisible(driver, PaymentNewCustomerPUI.CUSTOMER_NAME_TEXTBOX);
		senkeysToElement(driver, PaymentNewCustomerPUI.CUSTOMER_NAME_TEXTBOX, customerName);	
	}

	@Step("Input to Date Of Birth textbox with value: {0}")
	public void enterToDateOfBirth(String dateOfBirth) {
		waitForElementVisible(driver, PaymentNewCustomerPUI.DATE_OF_BIRTH_TEXTBOX);
		removeAttributeInDOM(driver, PaymentNewCustomerPUI.DATE_OF_BIRTH_TEXTBOX, "type");
		senkeysToElement(driver, PaymentNewCustomerPUI.DATE_OF_BIRTH_TEXTBOX, dateOfBirth);	
	}

	@Step("Input to Address textbox with value: {0}")
	public void enterToAddressTextBox(String address) {
		waitForElementVisible(driver, PaymentNewCustomerPUI.ADDRESS_TEXTBOX);
		senkeysToElement(driver, PaymentNewCustomerPUI.ADDRESS_TEXTBOX, address);	
	}

	@Step("Input to City textbox with value: {0}")
	public void enterToCityTextbox(String city) {
		waitForElementVisible(driver, PaymentNewCustomerPUI.CITY_TEXTBOX);
		senkeysToElement(driver, PaymentNewCustomerPUI.CITY_TEXTBOX, city);			
	}

	@Step("Input to State textbox with value: {0}")
	public void enterToStateTextbox(String state) {
		waitForElementVisible(driver, PaymentNewCustomerPUI.STATE_TEXTBOX);
		senkeysToElement(driver, PaymentNewCustomerPUI.STATE_TEXTBOX, state);			
	}

	@Step("Input to PIN textbox with value: {0}")
	public void enterToPINTextbox(String pin) {
		waitForElementVisible(driver, PaymentNewCustomerPUI.PIN_TEXTBOX);
		senkeysToElement(driver, PaymentNewCustomerPUI.PIN_TEXTBOX, pin);			
	}

	@Step("Input to Mobile textbox with value: {0}")
	public void enterToMobileTextbox(String mobileName) {
		waitForElementVisible(driver, PaymentNewCustomerPUI.MOBILE_TEXTBOX);
		senkeysToElement(driver, PaymentNewCustomerPUI.MOBILE_TEXTBOX, mobileName);			
	}

	@Step("Input to Email textbox with value: {0}")
	public void entertToEmailTextbox(String email) {
		waitForElementVisible(driver, PaymentNewCustomerPUI.EMAI_TEXTBOX);
		senkeysToElement(driver, PaymentNewCustomerPUI.EMAI_TEXTBOX, email);			
	}

	@Step("Input to New Password textbox with value: {0}")
	public void entertoNewPasswordTextBox(String passwordname) {
		waitForElementVisible(driver, PaymentNewCustomerPUI.NEW_PASSWORD_TEXTBOX);
		senkeysToElement(driver, PaymentNewCustomerPUI.NEW_PASSWORD_TEXTBOX, passwordname);			
	}

	@Step("Click To Submit Button")
	public void clickToSubmitButton() {
		waitForElementClickable(driver, PaymentNewCustomerPUI.SUBMIT_BUTTON);
		clickToElement(driver, PaymentNewCustomerPUI.SUBMIT_BUTTON);	
	}

	@Step("Get Message Create Successfully")
	public String getMessageCreateSuccessFully() {
		waitForElementVisible(driver, PaymentNewCustomerPUI.MESSAGE_SUCCESSFULLY);
		return getElementText(driver, PaymentNewCustomerPUI.MESSAGE_SUCCESSFULLY);
	}

	@Step("Get text UserId")
	public String getUserIdText() {
		waitForElementVisible(driver, PaymentNewCustomerPUI.GET_USERID);
		return getElementText(driver, PaymentNewCustomerPUI.GET_USERID);
	}

	public void pressKeyToTab() {
		waitForElementVisible(driver, PaymentNewCustomerPUI.CUSTOMER_NAME_TEXTBOX);
		pressKeyToElement(driver, PaymentNewCustomerPUI.CUSTOMER_NAME_TEXTBOX, Keys.TAB);
	}

	public String getMessageCustomerNameMustNotBeBlank() {
		waitForElementVisible(driver, PaymentNewCustomerPUI.MESSAGE_NAME_MUST_NOT_BE_BLANK);
		return getElementText(driver, PaymentNewCustomerPUI.MESSAGE_NAME_MUST_NOT_BE_BLANK);
	}
}

