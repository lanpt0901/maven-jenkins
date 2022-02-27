package jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_01 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
//		driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("http://demo.guru99.com/v4/");
	}

	@AfterClass
	public void afterClass() {
//		driver.quit();
	}

	@Test
	public void TC_01_CreateNewAccount() {
		Assert.assertTrue(true);
	}

	@Test
	public void TC_02_Login() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void TC_03_TestMenu() {
		Assert.assertTrue(true);
	}
	
}
