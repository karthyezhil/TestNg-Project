package org.testng;

import java.io.IOException;
import java.sql.SQLException;

import org.database.HomeInsuranceData;
import org.helper.BaseClass;
import org.pojo.PolicyBazaarHomeInsurancePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeInsuranceLoginFunctionalityTestUsingScanner extends BaseClass {

	
	PolicyBazaarHomeInsurancePage p;
	HomeInsuranceData h;

	@BeforeClass
	private static void startDateAndTime() {
		toGetDateAndTime();
	}

	@BeforeMethod()
	private void initiating() {
		launchBrowser();
		loadUrl("https://www.policybazaar.com");
		maxBrowser();
		p = new PolicyBazaarHomeInsurancePage();
		toMoveToElement(p.getInsuranceProduct());
		toClick(p.getHomeInsurance());
		
	}

	@Test(groups="regression")
	private void loginFunctionalityTestUsingScanner() throws IOException, ClassNotFoundException, SQLException {
		p=new PolicyBazaarHomeInsurancePage();
		toImplicitlyWait(8);
		driver.manage().window().minimize();
		toFillTextBox(p.getNameEditBox(), scanName());
		toFillTextBox(p.getMobileEditBox(), scanMobileNo());
		toFillTextBox(p.getEmailEditBox(), scanEmailId());
		toGetAttributeData();
		xceptionHandling();	
		toClick(p.getContinueButton());
		h =new HomeInsuranceData();
		h.sendingValuesToDatabase("home_insurance_enquiry", "first_name", "mobile_no", "email_id");
	}
	
	@AfterMethod()
	private void Finish() {
		toCloseTab();
	}

	@AfterClass()
	private static void endDateAndTime() {
		toGetDateAndTime();
	}
	
	
	
}
