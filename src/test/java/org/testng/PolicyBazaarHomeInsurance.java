package org.testng;

import org.helper.BaseClass;
import org.pojo.PolicyBazaarHomeInsurancePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PolicyBazaarHomeInsurance extends BaseClass {

	PolicyBazaarHomeInsurancePage p;
	SoftAssert s;

	@BeforeClass
	public static void startDateAndTime() {
		toGetDateAndTime();
	}

	@BeforeMethod()
	public void initiating() {
		launchBrowser();
		loadUrl("https://www.policybazaar.com");
		maxBrowser();
		p = new PolicyBazaarHomeInsurancePage();
	}

	@Test(groups="sanity")
	public void policyBazaar() {
		p = new PolicyBazaarHomeInsurancePage();
		toImplicitlyWait(10);
		toMoveToElement(p.getInsuranceProduct());
		jsScrollDown(p.getHomeInsurance());
		String text = toGetText(p.getHomeInsurance());
		jsClick(p.getHomeInsurance());
		Assert.assertTrue(text.contains("Home"), "Home Insurance Avaliable Under Insurance Product Dropdown");
		System.out.println("Expected Result : Home Insurance , Actual Result : " + text);
		toApplyFluentWaitVisibility(p.getLable());
		s=new SoftAssert();
		String textLable = toGetText(p.getLable());
		s.assertEquals(textLable,"Please share some basic details", "Given Data Present");
		s.assertAll();
		System.out.println("Expected Result : Please share some basic details , Actual Result : " + textLable);	
	}

	@AfterMethod()
	public void Finish() {
		toCloseTab();
	}

	@AfterClass()
	public static void endDateAndTime() {
		toGetDateAndTime();
	}

}
