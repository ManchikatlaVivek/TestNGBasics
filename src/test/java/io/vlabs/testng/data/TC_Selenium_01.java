package io.vlabs.testng.data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_Selenium_01 {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse Installation\\workspace-tomcat\\testng-basics\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");

	}
	
	@Test
	public void googleTitleTest() {
		String titleString = driver.getTitle();
		System.out.println("Title is "+ titleString);
	}
	
	@Test
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	}
//	<a class="gb_g" data-pid="23" href="https://mail.google.com/mail/?tab=wm&amp;ogbl">Gmail</a>
	
	@Test
	public void mailLinkTest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		
}
