package io.vlabs.testng.testdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TC_Selenium_01 {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Eclipse Installation/workspace-tomcat/TestNGBasics/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");

	}

	@Test // This is Google Title Test
	@Ignore
	public void googleTitleTest() {
		String titleString = driver.getTitle();
		System.out.println("Title is " + titleString);
		Assert.assertEquals(titleString, "Google");
	}

	@Test // This is Google Logo Test
	@Ignore
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		Assert.assertTrue(b);
	}

	@Test
	public void gmailTest() {
		WebElement gmail_link = driver.findElement(By.linkText("Gmail"));
		new WebDriverWait(driver, 20).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(gmail_link));
		gmail_link.click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
