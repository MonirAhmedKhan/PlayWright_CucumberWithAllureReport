package base;

import java.nio.file.Paths;
import java.util.ArrayList;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
public class Base {
	public static Page page;
	public static String url="https://it.microtechlimited.com";

	public static String hasText(String locator, String key) {
		return page.locator(locator).getAttribute(key);
	}
	
	public static void assertion(String xpath, String text) {
		assertThat(page.locator(xpath)).hasText(text);
	}
	public static String innerText(String locator) {
		String s = page.locator(locator).innerText();
		return s;
	}
	public static void fill(String locator, String value) {
		page.locator(locator).fill(value);
	}
	
	public static void navigate(String url) {
		page.navigate(url);
	}
	
	public static void click(String locator) {
		page.locator(locator).click();
	}
	
	public static void p(String s) {
		System.out.println("MMMMMMMMMMMMMMMMMMMM");
	}
	
}
