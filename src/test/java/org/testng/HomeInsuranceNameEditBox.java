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

public class HomeInsuranceNameEditBox extends BaseClass {

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

	@Parameters({"Username1"})
	@Test(retryAnalyzer=Failed.class)
	private void testCase1(@Optional("henry")String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username2"})
	@Test(retryAnalyzer=Failed.class)
	private void testCase2(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username3"})
	@Test(retryAnalyzer=Failed.class)
	private void testCase3(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username4"})
	@Test()
	private void testCase4(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username5"})
	@Test()
	private void testCase5(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username6"})
	@Test()
	private void testCase6(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username7"})
	@Test()
	private void testCase7(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username8"})
	@Test()
	private void testCase8(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username9"})
	@Test()
	private void testCase9(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username10"})
	@Test()
	private void testCase10(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username11"})
	@Test()
	private void testCase11(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username12"})
	@Test()
	private void testCase12(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username13"})
	@Test()
	private void testCase13(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username14"})
	@Test()
	private void testCase14(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username15"})
	@Test()
	private void testCase15(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username16"})
	@Test(priority=16, invocationCount=2)
	private void testCase16(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
	}
	
	@Parameters({"Username17"})
	@Test(enabled=true)
	private void testCase17(String user) {
		System.out.println("\nName EditBox Validation Using Different Possible TestData");
		p = new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(), user);
		nameEditBoxCommand();
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
