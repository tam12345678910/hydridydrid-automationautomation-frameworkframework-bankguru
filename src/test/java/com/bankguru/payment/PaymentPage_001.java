package com.bankguru.payment;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bankguru.data.Payment;
import com.pageObject.bankguru.HomePO;
import com.pageObject.bankguru.LoginPO;
import com.pageObject.bankguru.PageGeneratorManager;
import com.pageObject.bankguru.PaymentBalanceEnquiryPO;
import com.pageObject.bankguru.PaymentDeleteAccountPO;
import com.pageObject.bankguru.PaymentDeleteCustomerPO;
import com.pageObject.bankguru.PaymentDepositPO;
import com.pageObject.bankguru.PaymentEditAccountPO;
import com.pageObject.bankguru.PaymentEditCustomerPO;
import com.pageObject.bankguru.PaymentNewAccountPO;
import com.pageObject.bankguru.PaymentNewCustomerPO;
import com.pageObject.bankguru.PaymentTransferPO;
import com.pageObject.bankguru.PaymentWithdrawalPO;

import commons.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Regression Tests")
@Feature("Payment")
public class PaymentPage_001 extends BaseTest {

	WebDriver driver;
	LoginPO loginPO;
	HomePO homePO;
	PaymentNewCustomerPO paymentNewCustomerPO;
	PaymentEditCustomerPO paymentEditCustomerPO;
	PaymentNewAccountPO paymentNewAccountPO;
	PaymentEditAccountPO paymentEditAccountPO;
	PaymentDepositPO paymentDepositPO;
	PaymentWithdrawalPO paymentWithdrawalPO;
	PaymentTransferPO paymentTransferPO;
	PaymentBalanceEnquiryPO paymentBalanceEnquiryPO;
	PaymentDeleteAccountPO paymentDeleteAccountPO;
	PaymentDeleteCustomerPO patmentDeleteCustomerPO;
	String randomNumber = getRandomEmail();
	String userId, accountId,messageDeletedSuccess;

	@Parameters({ "browser", "url" })
	@BeforeClass(alwaysRun = true)
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		loginPO = PageGeneratorManager.getLoginPage(driver);

		log.info("Pre-Condition - Step 01: Enter to UserID textbox" + Payment.Login.USER_ID);
		loginPO.enterToUserIDTextBox(Payment.Login.USER_ID);

		log.info("Pre-Condition - Step 02: Enter to Password textbox" + Payment.Login.PASSWORD);
		loginPO.enterToPassword(Payment.Login.PASSWORD);

		log.info("Pre-Condition - Step 03: Click To Login Button");
		homePO = loginPO.clickToLoginButton();

		log.info("Pre-Condition - Step 04: Verify Home Page Displayed");
		verifyEquals(homePO.getTextHomeDisPlayed(), "Welcome To Manager's Page of Guru99 Bank");

	}

	@Description("Payment 01 - Create New Customer And Check Create Message SuccessFully")
	@Story("Create New Customer to system")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void TC_01_Create_New_Customer_Checked_Create_Successfully() {

		log.info("New Customer - Step 01: Open 'New Customer' page Menu");
		homePO.openMenuPageByName(driver, "New Customer");
		paymentNewCustomerPO = PageGeneratorManager.getPaymentNewCustomerPage(driver);

		log.info("New Customer - Step 02: Enter to CustomerName textbox: " + Payment.Create_New_Customer.CUSTOMER_NAME);
		paymentNewCustomerPO.enterToCustomerNameTextBox(Payment.Create_New_Customer.CUSTOMER_NAME);

		log.info("New Customer - Step 03: Enter to Date Of Birth textbox: " + Payment.Create_New_Customer.DATE_OF_BIRTH);
		paymentNewCustomerPO.enterToDateOfBirth(Payment.Create_New_Customer.DATE_OF_BIRTH);

		log.info("New Customer - Step 04: Enter to Address textbox: " + Payment.Create_New_Customer.ADDRESS);
		paymentNewCustomerPO.enterToAddressTextBox(Payment.Create_New_Customer.ADDRESS);

		log.info("New Customer - Step 05: Enter to City textbox: " + Payment.Create_New_Customer.CITY);
		paymentNewCustomerPO.enterToCityTextbox(Payment.Create_New_Customer.CITY);

		log.info("New Customer - Step 06: Enter to State textbox: " + Payment.Create_New_Customer.STATE);
		paymentNewCustomerPO.enterToStateTextbox(Payment.Create_New_Customer.STATE);

		log.info("New Customer - Step 07: Enter to PIN textbox: " + Payment.Create_New_Customer.PIN);
		paymentNewCustomerPO.enterToPINTextbox(Payment.Create_New_Customer.PIN);

		log.info("New Customer - Step 08: Enter to Mobile textbox: " + Payment.Create_New_Customer.MOBILE_NAME);
		paymentNewCustomerPO.enterToMobileTextbox(Payment.Create_New_Customer.MOBILE_NAME);

		log.info("New Customer - Step 09: Enter to Email textbox: " + Payment.Create_New_Customer.EMAIL + randomNumber);
		paymentNewCustomerPO.entertToEmailTextbox(Payment.Create_New_Customer.EMAIL + randomNumber);

		log.info("New Customer - Step 10: Enter to NewPassword textbox: " + Payment.Create_New_Customer.PASSWORDNAME);
		paymentNewCustomerPO.entertoNewPasswordTextBox(Payment.Create_New_Customer.PASSWORDNAME);

		log.info("New Customer - Step 11: Click to Submit Button");
		paymentNewCustomerPO.clickToSubmitButton();

		log.info("New Customer - Step 12: Verify Message Register successfully");
		verifyEquals(paymentNewCustomerPO.getMessageCreateSuccessFully(), "Customer Registered Successfully!!!");

		log.info("New Customer - Step 13: Get text UserId");
		userId = paymentNewCustomerPO.getUserIdText();

	}

	@Description("Payment 02 - Edit New Customer And Check Edit Message SuccessFully")
	@Story("Edit New Customer to system")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void TC_02_Edit_Customer_Check_Edited_Successfully() {

		log.info("Edit Customer - Step 01: Open 'Edit Customer' Page Menu");
		paymentNewCustomerPO.openMenuPageByName(driver, "Edit Customer");
		paymentEditCustomerPO = PageGeneratorManager.getPaymentEditCustomerPage(driver);

		log.info("Edit Customer - Step 02: Enter to UserId Textbox: " + userId);
		paymentEditCustomerPO.enterToUserIDTextBox(userId);

		log.info("Edit Customer - Step 03: Click to Submit Button");
		paymentEditCustomerPO.clickToSubmitButton();

		log.info("Edit Customer - Step 04: Enter to Address TextBox: " + Payment.Edit_New_Customer.EDIT_ADDRESS);
		paymentEditCustomerPO.enterToAddressTextBox(Payment.Edit_New_Customer.EDIT_ADDRESS);

		log.info("Edit Customer - Step 05: Enter to City TextBox: " + Payment.Edit_New_Customer.EDIT_CITY);
		paymentEditCustomerPO.enterToCityTextBox(Payment.Edit_New_Customer.EDIT_CITY);

		log.info("Edit Customer - Step 06: Enter to State TextBox: " + Payment.Edit_New_Customer.EDIT_SATE);
		paymentEditCustomerPO.enterToStateTextBox(Payment.Edit_New_Customer.EDIT_SATE);

		log.info("Edit Customer - Step 07: Enter to Pin TextBox: " + Payment.Edit_New_Customer.PIN);
		paymentEditCustomerPO.enterToPinTextBox(Payment.Edit_New_Customer.PIN);

		log.info("Edit Customer - Step 08: Click to Submit Button");
		paymentEditCustomerPO.clickToSubmitEditButton();

		log.info("Edit Customer - Step 09: Verify Message E dit successfully");
		verifyEquals(paymentEditCustomerPO.getMessageEditSuccessFully(), "Customer details updated Successfully!!!");
	}

	@Description("Payment 03 - Add new account And Check Add New Account Message SuccessFully")
	@Story("Add new account to system")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void TC_03_Add_New_Account_Check_Mess_SuccessFully() {

		log.info("Add New Account - Step 01: Open 'New Account' Page Menu");
		paymentEditCustomerPO.openMenuPageByName(driver, "New Account");
		paymentNewAccountPO = PageGeneratorManager.getPaymentNewAccountPage(driver);

		log.info("Add New Account - Step 02: Enter to CustomerId Textbox: " + userId);
		paymentNewAccountPO.enterToCustomerIDTexbox(userId);

		log.info("Add New Account - Step 03: Select to 'Account type' dropdown with value: " + Payment.Create_New_Account.ACCOUNT_TYPE);
		paymentNewAccountPO.selectAccountTypeAtAddNewAccountForm(Payment.Create_New_Account.ACCOUNT_TYPE);

		log.info("Add New Account - Step 04: Enter to 'Initial deposit' with value: " + Payment.Create_New_Account.INITIAL_DEPOSIT);
		paymentNewAccountPO.enterToInitialDepositAtAddNewAccountForm(Payment.Create_New_Account.INITIAL_DEPOSIT);

		log.info("Add New Account - Step 05: Click to Submit Button");
		paymentNewAccountPO.clickToSubmitButtonAtAddNewAccountForm();

		log.info("Add New Account - Step 06: Verify Account Type are displayed with value: " + Payment.Create_New_Account.ACCOUNT_TYPE);
		verifyEquals(paymentNewAccountPO.getAccountTypeValueAtAddNewAccountForm(), Payment.Create_New_Account.ACCOUNT_TYPE);

		log.info("Add New Account - Step 07: Verify Initial Deposit are displayed with value: " + Payment.Create_New_Account.INITIAL_DEPOSIT);
		verifyEquals(paymentNewAccountPO.getDepositValueAtAddNewAccountForm(), Payment.Create_New_Account.INITIAL_DEPOSIT);

		log.info("Add New Account - Step 08: Get text Account ID");
		accountId = paymentNewAccountPO.getACcountIdText();

	}

	@Description("Payment 04 - Edit new account And Check Edit New Account Message SuccessFully")
	@Story("Edit new account to system")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void TC_04_Edit_Account_Check_Mess_Update_Successfully() {

		log.info("Edit Account - Step 01: Open 'Edit Account' Page Menu");
		paymentNewAccountPO.openMenuPageByName(driver, "Edit Account");
		paymentEditAccountPO = PageGeneratorManager.getPaymentEditAccountPage(driver);

		log.info("Edit Account - Step 02: Enter to Account Id Textbox: " + accountId);
		paymentEditAccountPO.enterToAccountIDTexbox(accountId);

		log.info("Edit Account - Step 03: Click Submit Button");
		paymentEditAccountPO.clickToSubmiButtonAtEditAccountForm();

		log.info("Edit Account - Step 04: Select to 'Account type' dropdown with value: " + Payment.Edit_Account.EDIT_ACCOUNT_TYPE);
		paymentEditAccountPO.selectAccountTypeAtAddEditAccountForm(Payment.Edit_Account.EDIT_ACCOUNT_TYPE);

		log.info("Edit Account - Step 05: Click Submit Button");
		paymentEditAccountPO.clickToSubmiButtonAtEditAccountEntryForm();

		log.info("Edit Account - Step 06: Verify Message Account details updated Successfully!!!");
		verifyEquals(paymentEditAccountPO.getMessageEditSuccessFully(), "Account details updated Successfully!!!");
	}

	@Description("Payment 05 - Transfer money into a current account and check account")
	@Story("Deposit to system")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void TC_05_Deposit() {

		log.info("Deposit - Step 01: Open 'Deposit' Page Menu");
		paymentEditAccountPO.openMenuPageByName(driver, "Deposit");
		paymentDepositPO = PageGeneratorManager.getPaymentDepositPage(driver);

		log.info("Deposit - Step 02: Enter to Accont No with value: " + accountId);
		paymentDepositPO.enterToAccountNoAtDepositForm(accountId);

		log.info("Deposit - Step 03: Enter to Amount with value: " + Payment.Deposit.AMOUNT);
		paymentDepositPO.enterToAmountAtDepositForm(Payment.Deposit.AMOUNT);

		log.info("Deposit - Step 04: Enter to Description with value: " + Payment.Deposit.DESCRIPTION);
		paymentDepositPO.enterToDescriptionAtDepositForm(Payment.Deposit.DESCRIPTION);

		log.info("Deposit - Step 05: Click to Submit Button At Amount Deposit Form");
		paymentDepositPO.clickToSubmitButtonAtDepositForm();

		log.info("Deposit - Step 06: Verify Message Displayed with contens 'Transaction details of Deposit'");
		verifyEquals(paymentDepositPO.getMessageDisplayedContents(), "Transaction details of Deposit for Account " + accountId);

	}
	
	@Description("Payment 06 - Withdrawal money from current account and check account balance equal 40.000")
	@Story("Withdrawal to system")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void TC_06_Withdraw() {

		log.info("Withdrawal - Step 01: Open 'Withdrawal' Page Menu");
		paymentDepositPO.openMenuPageByName(driver, "Withdrawal");
		paymentWithdrawalPO = PageGeneratorManager.getPaymentWithdrawalPage(driver);
		
		log.info("Withdrawal - Step 02: Enter to Account No with value: " + accountId);
		paymentWithdrawalPO.enterToAccountNoAtWithdrawalForm(accountId);
		
		log.info("Withdrawal - Step 03: Enter to Amount with value: " + Payment.Withdrawal.AMOUNT_WITHDRAWAL);
		paymentWithdrawalPO.enterToAmountAtWithdrawalForm(Payment.Withdrawal.AMOUNT_WITHDRAWAL);

		log.info("Withdrawal - Step 04: Enter to Description with value: " + Payment.Withdrawal.DESCRIPTION_WITHDRAWAL);
		paymentWithdrawalPO.enterToDescriptionAtWithdrawalForm(Payment.Withdrawal.DESCRIPTION_WITHDRAWAL);
		
		log.info("Withdrawal - Step 05: Click to Submit Button At Amount Withdrawal Form");
		paymentWithdrawalPO.clickToSubmitButtonAtWithdrawalForm();
		
		log.info("Withdrawal - Step 06: Verify Message Displayed with contens 'Transaction details of Withdrawal'");
		verifyEquals(paymentWithdrawalPO.getTextCurrentAmountContents(), Payment.Withdrawal.AMOUNT_WITHDRAWAL);

	}
	
	@Description("Payment 07 - Transfer the money into another account and check amount equal 10.000")
	@Story("Transfer to system")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void TC_07_Transfer() {
	
		log.info("Transfer - Step 01: Open 'Fund Transfer' Page Menu");
		paymentWithdrawalPO.openMenuPageByName(driver, "Fund Transfer");
		paymentTransferPO = PageGeneratorManager.getPaymentTransferPage(driver);
		
		log.info("Transfer - Step 02: Enter to Payers account no with value: " + accountId);
		paymentTransferPO.enterToPayersAccountAtFundTransferForm(accountId);
		
		log.info("Transfer - Step 03: Enter to Payees account no with value: " + Payment.Transfer.PAYEES_ACCOUNT_NO);
		paymentTransferPO.enterToPayeesAccountAtFundTransferForm(Payment.Transfer.PAYEES_ACCOUNT_NO);
		
		log.info("Transfer - Step 04: Enter to Amount with value: " + Payment.Transfer.AMOUNT);
		paymentTransferPO.enterToAmountAtFundTransferForm(Payment.Transfer.AMOUNT);
		
		log.info("Transfer - Step 05: Enter to Description with value: " + Payment.Transfer.DESCRIPTION);
		paymentTransferPO.enterToDescriptionAtFundTransferForm(Payment.Transfer.DESCRIPTION);
		
		log.info("Transfer - Step 06: Click to Submit Button At Fund Transfer Form");
		paymentTransferPO.clickToSubmitButtonAtTransferForm();
		
		log.info("Transfer - Step 07: Verify Message Displayed with contens 'Balance details for account' " + accountId);
		verifyEquals(paymentTransferPO.getTextCurrentAmountContents(), Payment.Transfer.AMOUNT);
		
	}
	
	@Description("Payment 08 - Check current account balence equal 300,000")
	@Story("Balance to system")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void TC_08_Balance_Enquiry() {
	
		log.info("Balance Enquiry - Step 01: Open 'Balance Enquiry' Page Menu");
		paymentTransferPO.openMenuPageByName(driver, "Balance Enquiry");
		paymentBalanceEnquiryPO = PageGeneratorManager.getPaymentBalanceEnquiryPage(driver);
		
		log.info("Balance Enquiry - Step 02: Enter to Account no with value: " + accountId);
		paymentBalanceEnquiryPO.enterToAccountNoAtBalanceEnquiryForm(accountId);
		
		log.info("Balance Enquiry - Step 03: Click to Submit Button At Balance Enquiry Form");
		paymentBalanceEnquiryPO.clickToSubmitButtonAtBalanceEnquiryForm();
		
		log.info("Balance Enquiry - Step 04: Verify get text balance dislayed");
		verifyEquals(paymentBalanceEnquiryPO.getTextBalanceContents(), Payment.Balance.BALANCE);
		
	}
	
	@Description("Payment 09 - Delete all account of this customer account and check deleted successfully")
	@Story("Delete Account to system")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void TC_09_Delete_Account_Page() {
		
		log.info("Delete - Step 01: Open 'Delete Account' Page Menu");
		paymentBalanceEnquiryPO.openMenuPageByName(driver, "Delete Account");
		paymentDeleteAccountPO = PageGeneratorManager.getPaymentDeleteAccountPage(driver);
		
		log.info("Delete - Step 02: Enter to Account no with value: " + accountId);
		paymentDeleteAccountPO.enterToAccountNoAtDeleteAccountForm(accountId);
		
		log.info("Delete - Step 03: Click to Submit Button At Balance Enquiry Form");
		paymentDeleteAccountPO.clickToSubmitButtonAtDeleteAccoutnForm();
		
		log.info("Delete - Step 04: Click accept alert");
		paymentDeleteAccountPO.acceptAlert(driver);
		
		log.info("Delete - Step 05: Verify message account deleted successfully");
		verifyEquals(paymentDeleteAccountPO.getMessageAccountDeleteSuccessfully(), "Account Deleted Sucessfully");
		
		log.info("Delete - Step 06: Click accept alert");
		paymentDeleteAccountPO.acceptAlert(driver);
		
	}
	
	@Description("Payment 10 - Delete exist customer account and check deleted successfully")
	@Story("Delete Customer to system")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void TC_10_Delete_Cusomter_Page() {
		
		log.info("Delete Customer - Step 01: Open 'Delete Customer' Page Menu");
		paymentDeleteAccountPO.openMenuPageByName(driver, "Delete Customer");
		patmentDeleteCustomerPO = PageGeneratorManager.getPaymentDeleteCustomerPage(driver);
		
		log.info("Delete Customer - Step 02: Enter to CustomerID no with value: " + userId);
		patmentDeleteCustomerPO.enterToCustomerIdAtDeleteAccountForm(userId);
		
		log.info("Delete Customer - Step 03: Click to Submit Button At Delete Customer Form");
		patmentDeleteCustomerPO.clickToSubmitButtonAtDeleteCustomerForm();
		
		log.info("Delete Customer - Step 04: Click accept alert");
		patmentDeleteCustomerPO.acceptAlert(driver);
		
		log.info("Delete Customer - Step 06: Verify message customer deleted successfully");
		verifyEquals(patmentDeleteCustomerPO.getMessageCustomerDeleteSuccessfully(), "Customer deleted Successfully");
		
		log.info("Delete Customer - Step 07: Click accept alert");
		patmentDeleteCustomerPO.acceptAlert(driver);
		
		log.info("Delete Customer - Step 08: Open 'Edit Customer' Page Menu");
		patmentDeleteCustomerPO.openMenuPageByName(driver, "Edit Customer");
		paymentEditCustomerPO = PageGeneratorManager.getPaymentEditCustomerPage(driver);
		
		log.info("Delete Customer - Step 09: Enter to UserId Textbox: " + userId);
		paymentEditCustomerPO.enterToUserIDTextBox(userId);

		log.info("Delete Customer - Step 10: Click to Submit Button");
		paymentEditCustomerPO.clickToSubmitButton();
		
		log.info("Delete Customer - Step 11: Verify message displayed with content 'Customer does not exist!!' ");
		verifyEquals(paymentEditCustomerPO.getMessageCustomerDoesNotExist(), "Customer does not exist!!");
		
		log.info("Delete Customer - Step 12: Click accept alert");
		paymentEditCustomerPO.acceptAlert(driver);
	}
	

	public String getRandomEmail() {
		Random rand = new Random();
		return rand.nextInt(99999) + "@gmail.com";
	}

	@AfterClass(alwaysRun = true)
	public void cleanBrowser() {
		closeBrowserAndDriver(driver);
	}
}
