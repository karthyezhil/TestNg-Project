package org.testng;

public class SupportFailedAll implements IRetryAnalyzer {
	int min = 0, max = 3;

	public boolean retry(ITestResult arg0) {
		if (min < max) {
			return true;
		}
		return false;
	}

}
