package org.helper;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.datadriven.DataDriven;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojo.PolicyBazaarHomeInsurancePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends DataDriven {

	public static WebDriver driver;
	public static PolicyBazaarHomeInsurancePage p;
	public static Scanner s;
	public static JavascriptExecutor js;
	public static SoftAssert s1;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void launchEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}

	public static void launchFfBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void maxBrowser() {
		driver.manage().window().maximize();
	}

	public static void minBrowser() {
		driver.manage().window().minimize();
	}

	public static void toGetPageTitle() {
		String title = driver.getTitle();
		System.out.println("Current page title : " + title);
	}

	public static String toGetCurrentUrl() {
		String pageUrl = driver.getCurrentUrl();
		return pageUrl;
	}

	public static void toGetDateAndTime() {
		Date d = new Date();
		System.out.println(d);
	}

	public static void toClick(WebElement e) {
		e.click();
	}

	public static String toGetText(WebElement e) {
		String text = e.getText();
		return text;
	}

	public static void toMoveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();

	}

	public static void toGetAttribute(WebElement e) {
		String attText = e.getAttribute("value");
		System.out.println("Entered value : " + attText);

	}

	public static String toGetAttributeWithReturn(WebElement e) {
		String attText = e.getAttribute("value");
		System.out.println("Entered value : " + attText);
		return attText;
	}

	public static void toFillTextBox(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void nameEditBoxCommand() {

		p = new PolicyBazaarHomeInsurancePage();
		toGetAttribute(p.getNameEditBox());
		try {
			if (p.getCheckFormatName().isDisplayed()) {
				System.out.println("Entered Name accepted ");
			} else if (p.getNameErrorCommand().isDisplayed()) {
				String errorText = toGetText(p.getNameErrorCommand());
				System.out.println("Error Message : " + errorText);
			} else if (p.getNameRequired().isDisplayed()) {
				String err = toGetText(p.getNameRequired());
				System.out.println("Error Message : " + err);
			}
		} catch (NullPointerException e) {
			System.out.println("Enter valid name");
		}
	}

	public static void mobileEditBoxCommand() {

		p = new PolicyBazaarHomeInsurancePage();
		toGetAttribute(p.getMobileEditBox());
		try {
			if (p.getCheckFormatMobile().isDisplayed()) {
				System.out.println("Entered Phone Number accepted ");
			} else if (p.getMobileErrorCommand().isDisplayed()) {
				String errorText = toGetText(p.getMobileErrorCommand());
				System.out.println("Error Message : " + errorText);
			} else if (p.getErrorMobileMessage().isDisplayed()) {
				String errorText = toGetText(p.getErrorMobileMessage());
				System.out.println("Error Message : " + errorText);
			}
		} catch (NullPointerException e) {
			System.out.println("Enter valid Mobile Number");
		}

	}

	public static void emailIdEditBoxCommand() {

		p = new PolicyBazaarHomeInsurancePage();
		toGetAttribute(p.getEmailEditBox());
		try {
			if (p.getCheckFormateEmail().isDisplayed()) {
				System.out.println("Entered EmailId accepted ");
			} else if (p.getEmailErrorCommand().isDisplayed()) {
				String errorText = toGetText(p.getEmailErrorCommand());
				System.out.println("Error Message : " + errorText);
			} else if (p.getErrorEmailMessage().isDisplayed()) {
				String errorText = toGetText(p.getErrorEmailMessage());
				System.out.println("Error Message : " + errorText);
			}
		} catch (NullPointerException e) {
			System.out.println("Enter valid name");
		}
	}

	public static void xceptionHandling() {
		try {
			if (p.getMobileErrorCommand().isDisplayed()) {
				System.out.println("CONTINUE button not Enabled");
			} else if (p.getErrorMobileMessage().isDisplayed()) {
				System.out.println("CONTINUE button not Enabled");
			} else if (p.getEmailErrorCommand().isDisplayed()) {
				System.out.println("CONTINUE button not Enabled");
			} else if (p.getErrorEmailMessage().isDisplayed()) {
				System.out.println("CONTINUE button not Enabled");
			} else {
				System.out.println("CONTINUE button Enabled");
			}

		}

		catch (NullPointerException e) {
			System.out.println("CONTINUE button not Enabled");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("CONTINUE button Enabled");
		}

		catch (NoSuchElementException e) {
			System.out.println("CONTINUE button Enabled");
		}

		catch (Exception e) {
			System.out.println("CONTINUE button Enabled");
		}

	}

	public static void toGetAttributeData() {
		p = new PolicyBazaarHomeInsurancePage();
		toGetAttributeWithReturn(p.getNameEditBox());
		toGetAttributeWithReturn(p.getMobileEditBox());
		toGetAttributeWithReturn(p.getEmailEditBox());

	}

	public static void toImplicitlyWait(int timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}

	public static void toApplyWebDriverWait(int timeout, WebElement e) {
		WebDriverWait w = new WebDriverWait(driver, timeout);
		w.until(ExpectedConditions.visibilityOf(e));
	}
	
	public static void toApplyFluentWaitClick(WebElement e) {
		FluentWait<WebDriver> f=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(1)).ignoring(Throwable.class);
		f.until(ExpectedConditions.elementToBeClickable(e));
	}
	
	public static void toApplyFluentWaitVisibility(WebElement e) {
		FluentWait<WebDriver> f=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(1)).ignoring(Throwable.class);
		f.until(ExpectedConditions.visibilityOf(e));
	}
	

	public static void toHandleWindows() {
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		for (String eachWindowId : allWindowId) {
			if (!eachWindowId.equals(parentWindowId)) {
				driver.switchTo().window(eachWindowId);
			}
		}
	}

	public static void toHandleWindows(int windowNo) {
		Set<String> allWindowId = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(allWindowId);
		driver.switchTo().window(li.get(windowNo));

	}

	public static void jsClick(WebElement e) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", e);
	}

	public static String jsGetAttribute(WebElement e) {
		js = (JavascriptExecutor) driver;
		Object executeAsyncScript = js.executeScript("returnarguments[0].getAttribute('value')", e);
		// String s=(String)executeAsyncScript;
		String v = String.valueOf(executeAsyncScript);
		return v;
	}

	public static void jssetAttribute(String val, WebElement e) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', '" + val + "' )", e);

	}
	
	public static void jsScrollDown(WebElement e) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}

	public static void policyContent(String name) {
		p = new PolicyBazaarHomeInsurancePage();
		System.out.println("\nAvaliable content Under " + name + " :  \n" +toGetText(p.getPrivacypolicy()) + "\n"
				+ toGetText(p.getTermsOfUse()) + "\n" + toGetText(p.getIntellectualPropertyPolicy()) + "\n"
				+ toGetText(p.getDisclaimer()) + "\n" + toGetText(p.getIsnp()));

	}

	public static String scanName() {
		s = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName = s.nextLine();
		return firstName;
	}

	public static String scanMobileNo() {
		s = new Scanner(System.in);
		System.out.println("Enter Mobile No:");
		long num = s.nextLong();
		String mobileNo = String.valueOf(num);
		return mobileNo;
	}

	public static String scanEmailId() {
		s = new Scanner(System.in);
		System.out.println("Enter Email Id:");
		String emailId = s.next();
		return emailId;
	}

	public static void policyHomeInsuranceCrossbrowser() {

		loadUrl("https://www.policybazaar.com");
		toImplicitlyWait(10);
		maxBrowser();
		p = new PolicyBazaarHomeInsurancePage();
		toMoveToElement(p.getInsuranceProduct());
		String text = toGetText(p.getHomeInsurance());
		jsClick(p.getHomeInsurance());
		Assert.assertTrue(text.contains("Home"), "Home Insurance Avaliable Under Insurance Product Dropdown");
		System.out.println("Expected Result : Home Insurance , Actual Result : " + text);
		String textLable = toGetText(p.getLable());
		s1 = new SoftAssert();
		s1.assertEquals(textLable, "Please share some basic details", "Given Data Present");
		s1.assertAll();
		System.out.println("Expected Result : Please share some basic details , Actual Result : " + textLable);
		toCloseTab();
	}

	public static void toCloseTab() {
		driver.quit();
	}

	public static void toCloseBrowser() {
		driver.close();
	}
}
