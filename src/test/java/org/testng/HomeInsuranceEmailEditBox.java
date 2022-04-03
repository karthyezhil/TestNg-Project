package org.testng;

import org.pojo.PolicyBazaarHomeInsurancePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.helper.BaseClass;


public class HomeInsuranceEmailEditBox extends BaseClass{

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
		jsClick(p.getHomeInsurance());
	}

	@Parameters({"emailId1"})
	@Test()
	private void testCase1(@Optional("iytjddx@yahoo.com")String email) {
		System.out.println("EmailId EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		jssetAttribute(email, p.getEmailEditBox());
		emailIdEditBoxCommand();
	}
	
	@Parameters({"emailId2"})
	@Test()
	private void testCase2(String email) {
		System.out.println("EmailId EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		jssetAttribute(email, p.getEmailEditBox());
		emailIdEditBoxCommand();
	}
	
	@Parameters({"emailId3"})
	@Test()
	private void testCase3(String email) {
		System.out.println("EmailId EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		jssetAttribute(email, p.getEmailEditBox());
		emailIdEditBoxCommand();
	}
	
	@Parameters({"emailId4"})
	@Test()
	private void testCase4(String email) {
		System.out.println("EmailId EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();jssetAttribute(email, p.getEmailEditBox());
		toFillTextBox(p.getEmailEditBox(), email);
		emailIdEditBoxCommand();
	}
	
	@Parameters({"emailId5"})
	@Test()
	private void testCase5(String email) {
		System.out.println("EmailId EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		jssetAttribute(email, p.getEmailEditBox());
		emailIdEditBoxCommand();
	}
	
	@Parameters({"emailId6"})
	@Test()
	private void testCase6(String email) {
		System.out.println("EmailId EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		jssetAttribute(email, p.getEmailEditBox());
		emailIdEditBoxCommand();
	}
	
	@Parameters({"emailId7"})
	@Test()
	private void testCase7(String email) {
		System.out.println("EmailId EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		jssetAttribute(email, p.getEmailEditBox());
		emailIdEditBoxCommand();
	}
	
	@Parameters({"emailId8"})
	@Test()
	private void testCase8(String email) {
		System.out.println("EmailId EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		jssetAttribute(email, p.getEmailEditBox());
		emailIdEditBoxCommand();
	}
	
	@Parameters({"emailId9"})
	@Test()
	private void testCase9(String email) {
		System.out.println("EmailId EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		jssetAttribute(email, p.getEmailEditBox());
		emailIdEditBoxCommand();
	}
	
	@Parameters({"emailId10"})
	@Test()
	private void testCase10(String email) {
		System.out.println("EmailId EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		jssetAttribute(email, p.getEmailEditBox());
		emailIdEditBoxCommand();
	}
	
	@Parameters({"emailId11"})
	@Test()
	private void testCase11(String email) {
		System.out.println("EmailId EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		jssetAttribute(email, p.getEmailEditBox());
		emailIdEditBoxCommand();
	}
	
	
	@AfterMethod()
	private void Finish() {
		//toCloseTab();
	}

	@AfterClass()
	private static void endDateAndTime() {
		toGetDateAndTime();
	}
}
