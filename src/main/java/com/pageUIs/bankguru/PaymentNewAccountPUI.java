package com.pageUIs.bankguru;

public class PaymentNewAccountPUI {

	public static final String CUSTOMER_ID_ADD_NEW_ACCOUNT_FORM_TEXTBOX = "//input[@name='cusid']";
	public static final String ACCOUNT_TYPE_ADD_NEW_ACCOUNT_FORM_DROPDOWN = "//select[@name='selaccount']";
	public static final String INITIAL_DEPOSIT_ADD_NEW_ACCOUNT_FORM_TEXTBOX = "//input[@name='inideposit']";
	public static final String SUBMIT_ADD_NEW_ACCOUNT_FORM_BUTTON = "//input[@type='submit']";
	public static final String GET_ACCOUNT_TYPE_VALUE = "//td[text()='Account Type']/following-sibling::td[text()='Savings']";
	public static final String GET_DEPOSIT_VALUE = "//td[text()='Current Amount']/following-sibling::td[text()='50000']";
	public static final String GET_ACCOUNT_ID = "//td[text()='Account ID']/following-sibling::td";
}
