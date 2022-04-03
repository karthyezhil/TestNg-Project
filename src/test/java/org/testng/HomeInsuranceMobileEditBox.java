package org.testng;

import org.helper.BaseClass;
import org.pojo.PolicyBazaarHomeInsurancePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeInsuranceMobileEditBox extends BaseClass {

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
		PolicyBazaarHomeInsurancePage p = new PolicyBazaarHomeInsurancePage();
		toMoveToElement(p.getInsuranceProduct());
		jsClick(p.getHomeInsurance());
	}

	@Parameters({ "mobileNo1" })
	@Test()
	private void testCase1(@Optional("6654898899") String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo2" })
	@Test()
	private void testCase2(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo3" })
	@Test()
	private void testCase3(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo4" })
	@Test()
	private void testCase4(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo5" })
	@Test()
	private void testCase5(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo6" })
	@Test()
	private void testCase6(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo7" })
	@Test()
	private void testCase7(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo8" })
	@Test()
	private void testCase8(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo9" })
	@Test()
	private void testCase9(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo10" })
	@Test()
	private void testCase10(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo11" })
	@Test()
	private void testCase11(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo12" })
	@Test()
	private void testCase12(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo13" })
	@Test()
	private void testCase13(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo14" })
	@Test()
	private void testCase14(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo15" })
	@Test()
	private void testCase15(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo16" })
	@Test()
	private void testCase16(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo17" })
	@Test()
	private void testCase17(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo18" })
	@Test()
	private void testCase18(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo19" })
	@Test()
	private void testCase19(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo20" })
	@Test()
	private void testCase20(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
	}
	
	@Parameters({ "mobileNo21" })
	@Test()
	private void testCase21(String phnNo) {
		System.out.println("\nMobile EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getMobileEditBox(), phnNo);
		mobileEditBoxCommand();
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
