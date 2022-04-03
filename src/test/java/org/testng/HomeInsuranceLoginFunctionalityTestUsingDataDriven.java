package org.testng;

import java.io.IOException;

import org.helper.BaseClass;
import org.pojo.PolicyBazaarHomeInsurancePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomeInsuranceLoginFunctionalityTestUsingDataDriven extends BaseClass {
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

	@Test(groups="smoke")
	private void tc1LoginFunctionalityTest() throws IOException {
		p=new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(),readFromExcel(1, 0));
		toFillTextBox(p.getMobileEditBox(), readFromExcel(1, 1));
		toFillTextBox(p.getEmailEditBox(), readFromExcel(1, 2));
		toGetAttributeData();
		xceptionHandling();	
	}
	
	@Test(groups="smoke")
	private void tc2LoginFunctionalityTest() throws IOException {
		p=new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(),readFromExcel(2, 0));
		toFillTextBox(p.getMobileEditBox(), readFromExcel(2, 1));
		toFillTextBox(p.getEmailEditBox(), readFromExcel(2, 2));
		toGetAttributeData();
		xceptionHandling();	
	}
	
	@Test(groups="smoke")
	private void tc3LoginFunctionalityTest() throws IOException {
		p=new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(),readFromExcel(3, 0));
		toFillTextBox(p.getMobileEditBox(), readFromExcel(3, 1));
		toFillTextBox(p.getEmailEditBox(), readFromExcel(3, 2));
		toGetAttributeData();
		xceptionHandling();	
	}
	
	@Test(groups="smoke")
	private void tc4LoginFunctionalityTest() throws IOException {
		p=new PolicyBazaarHomeInsurancePage();
		toFillTextBox(p.getNameEditBox(),readFromExcel(4, 0));
		toFillTextBox(p.getMobileEditBox(), readFromExcel(4, 1));
		toFillTextBox(p.getEmailEditBox(), readFromExcel(4, 2));
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
