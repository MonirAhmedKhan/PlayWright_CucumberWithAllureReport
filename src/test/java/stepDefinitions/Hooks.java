package stepDefinitions;

import java.nio.file.Paths;
import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;

public class Hooks extends Base {
	@Before
	public void startUp() {
		System.out.println("Before");

		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		// playwright declaration and creation
		Playwright playwright;
		playwright = Playwright.create();

		ArrayList<String> arguments = new ArrayList<>();
		arguments.add("--start-maximized");

		LaunchOptions launchOptions;
		launchOptions = new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments)
				.setExecutablePath(Paths.get(chromePath));

		Browser browser;
		browser = playwright.chromium().launch(launchOptions);

		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

		page = context.newPage();
	}

	@After
	public static void close(Scenario scenario) {

		try {
			String screenshotName = scenario.getName().replace("", "");
			if (scenario.isFailed()) {
				scenario.log("this testcase faile");
				byte[] screenshot = page.screenshot(new Page.ScreenshotOptions().setFullPage(true));
				scenario.attach(screenshot, "image/png", screenshotName);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		page.close();

	}
}
