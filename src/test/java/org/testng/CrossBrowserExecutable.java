package org.testng;

import org.helper.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserExecutable extends BaseClass{
	
	WebDriver driver;

	@Parameters({"Browser"})
	@Test
	private void policyBazaar(String brwName) {
		toGetDateAndTime();
		if(brwName.startsWith("chr")) {
			 	launchBrowser();
		}
		else if(brwName.equals("edge")){
			 launchEdgeBrowser();
		}
		else {
			 launchFfBrowser();
		}
		policyHomeInsuranceCrossbrowser();
		toGetDateAndTime();
	}


}
