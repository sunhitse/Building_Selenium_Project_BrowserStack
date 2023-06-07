package browserStackSetup;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browserStackPages.BrowserStackGETDemo;
import browserStackPages.BrowserStackHomePage;
import browserStackPages.BrowserStackSignUpPage;

public class BrowserStackSetup {
	//String driverPath = "C:\\geckodriver.exe";
	WebDriver driver;
	BrowserStackHomePage objBrowserStackHomePage;
	BrowserStackSignUpPage objBrowserStackSignUpPage;
	BrowserStackGETDemo objBrowserStackGETDemo;

	@BeforeTest
	public void setup() {
//System.setProperty("webdriver.chrome.driver", "C:\\BrowserStack\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.browserstack.com/");
	}

	@Test(priority = 1)
	public void navigate_to_homepage_click_on_getstarted() {
		objBrowserStackHomePage = new BrowserStackHomePage(driver);
		objBrowserStackHomePage.veryHeader();
		objBrowserStackHomePage.clickOnGetStarted();
	}

	@Test(priority = 2)
	public void enter_userDetails() {
		objBrowserStackSignUpPage = new BrowserStackSignUpPage(driver);
		objBrowserStackSignUpPage.veryHeader();
		objBrowserStackSignUpPage.enterFullName("TestUser");
		objBrowserStackSignUpPage.enterBusinessEmail("TestUser@gmail.com");
		objBrowserStackSignUpPage.enterPasswrod("TestUserPassword");
	}

	@Test(priority = 0)
	public void getdemo() {
		objBrowserStackGETDemo = new BrowserStackGETDemo(driver);
		// objBrowserStackGETDemo.veryHeader();
		objBrowserStackGETDemo.getdemo();
		objBrowserStackGETDemo.name("TestUser");
		objBrowserStackGETDemo.enterBusinessEmail("TestUser@gmail.com");
		objBrowserStackGETDemo.entercompany("TestUserPassword");
		objBrowserStackGETDemo.selectcheckbox();
		objBrowserStackGETDemo.selectgetdemo1();
	}
}