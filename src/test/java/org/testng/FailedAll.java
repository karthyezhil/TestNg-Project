package org.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;

public class FailedAll implements IAnnotationTransformer {

	public void transform(ITestAnnotation a, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer r = a.getRetryAnalyzer();
		if (r==null) {
			a.setRetryAnalyzer(SupportFailedAll.class);
		}
	}

}