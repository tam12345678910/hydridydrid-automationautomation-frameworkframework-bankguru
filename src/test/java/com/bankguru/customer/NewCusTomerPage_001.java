package com.bankguru.customer;

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
import com.pageObject.bankguru.PaymentNewCustomerPO;

import commons.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Regression Tests")
@Feature("New Customer")
public class NewCusTomerPage_001 extends BaseTest {

	WebDriver driver;
	LoginPO loginPO;
	HomePO homePO;
	PaymentNewCustomerPO paymentNewCustomerPO;
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
	
	@Description("NC1 - Verify Name Field Name Cannot Be Empty")
	@Story("Verify name field name cannot be empty")
	@Severity(SeverityLevel.NORMAL)
	@Test
	public void TC_01_Verify_Name_Filed_Name_Cannot_Be_Empty() {
		
		log.info("New Customer - Step 01: Open 'New Customer' page Menu");
		homePO.openMenuPageByName(driver, "New Customer");
		paymentNewCustomerPO = PageGeneratorManager.getPaymentNewCustomerPage(driver);

		log.info("New Customer - Step 02: Enter to CustomerName textbox: " + "");
		paymentNewCustomerPO.pressKeyToTab();

		log.info("New Customer - Step 03: Verify Message Customer name must not be blank");
		verifyEquals(paymentNewCustomerPO.getMessageCustomerNameMustNotBeBlank(), "Customer name must not be blank");
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
