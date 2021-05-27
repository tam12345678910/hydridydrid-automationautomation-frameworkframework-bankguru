package com.pageObject.bankguru;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public static LoginPO getLoginPage(WebDriver driver) {
		return new LoginPO(driver);
	}

	public static HomePO getHomePage(WebDriver driver) {
		return new HomePO(driver);
	}

	public static PaymentNewCustomerPO getPaymentNewCustomerPage(WebDriver driver) {
		return new PaymentNewCustomerPO(driver);
	}

	public static PaymentEditCustomerPO getPaymentEditCustomerPage(WebDriver driver) {
		return new PaymentEditCustomerPO(driver);
	}

	public static PaymentNewAccountPO getPaymentNewAccountPage(WebDriver driver) {
		return new PaymentNewAccountPO(driver);
	}

	public static PaymentEditAccountPO getPaymentEditAccountPage(WebDriver driver) {
		return new PaymentEditAccountPO(driver);
	}

	public static PaymentDepositPO getPaymentDepositPage(WebDriver driver) {
		return new PaymentDepositPO(driver);
	}

	public static PaymentWithdrawalPO getPaymentWithdrawalPage(WebDriver driver) {
		return new PaymentWithdrawalPO(driver);
	}
	
	public static PaymentTransferPO getPaymentTransferPage(WebDriver driver) {
		return new PaymentTransferPO(driver);
	}
	
	public static PaymentBalanceEnquiryPO getPaymentBalanceEnquiryPage(WebDriver driver) {
		return new PaymentBalanceEnquiryPO(driver);
	}
	
	public static PaymentDeleteAccountPO getPaymentDeleteAccountPage(WebDriver driver) {
		return new PaymentDeleteAccountPO(driver);
	}
	
	public static PaymentDeleteCustomerPO getPaymentDeleteCustomerPage(WebDriver driver) {
		return new PaymentDeleteCustomerPO(driver);
	}
	
}
