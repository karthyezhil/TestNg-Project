package org.testng;

import java.io.IOException;

import org.helper.BaseClass;
import org.pojo.PolicyBazaarHomeInsurancePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomeInsuranceLoginFunctionalityTestUsingDataProvider extends BaseClass{

	PolicyBazaarHomeInsurancePage p;

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

	@Test(groups="sanity",dataProvider="credentials",dataProviderClass=org.dataprovidertestng.Data.class)
	private void LoginFunctionalityTest(String name,String mobileNo, String emailId) throws IOException {
		p=new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(),name );
		toFillTextBox(p.getMobileEditBox(), mobileNo);
		toFillTextBox(p.getEmailEditBox(), emailId );
		toGetAttributeData();
		xceptionHandling();	
	}

	@AfterMethod()
	private void Finish() {
		toCloseTab();
	}

	@AfterClass()
	private  void endDateAndTime() {
		toGetDateAndTime();
	}

}
