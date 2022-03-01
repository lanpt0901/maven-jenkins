package jenkins;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_01 {
	protected final Log log;
	WebDriver driver;

	protected Login_01() {
		log = LogFactory.getLog(getClass());
	}
	
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
		log.info("TC01");
		Assert.assertTrue(true);
	}

	@Test
	public void TC_02_Login() {
		log.info("TC02");
		Assert.assertTrue(true);
	}
	
	@Test
	public void TC_03_TestMenu() {
		log.info("TC03");
		Assert.assertTrue(true);
	}
	
}
