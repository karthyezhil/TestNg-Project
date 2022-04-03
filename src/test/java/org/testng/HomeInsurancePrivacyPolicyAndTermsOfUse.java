package org.testng;

import org.pojo.PolicyBazaarHomeInsurancePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

import org.helper.BaseClass;
public class HomeInsurancePrivacyPolicyAndTermsOfUse extends BaseClass{

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
	private void homeInsurancePrivacyPolicyContentCheck() {
		p = new PolicyBazaarHomeInsurancePage();
		toImplicitlyWait(10);
		jsClick(p.getBtnPrivacyPolicy());
		toHandleWindows();
		policyContent("Privacy Policy");
		
	}
	
	@Test(groups="sanity")
	private void homeInsuranceTermsOfUseContentCheck() {
		p = new PolicyBazaarHomeInsurancePage();
		toImplicitlyWait(10);
		jsClick(p.getBtnTermsOfUse());
		toHandleWindows();
		policyContent("Terms of Use");	
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
