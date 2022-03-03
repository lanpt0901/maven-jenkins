package jenkins;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register_02 {
	protected final Log log;
	WebDriver driver;

	protected Register_02() {
		log = LogFactory.getLog(getClass());
	}

	@BeforeClass
	public void beforeClass() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/v4/");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void TC_01_Register01() {
		log.info("=========TC_01_Register01");
		Assert.assertTrue(true);
	}

	@Test
	public void TC_02_Register02() {
		log.debug("==========TC_02_Register02");
		Assert.assertTrue(true);
	}
	
	@Test
	public void TC_03_Register03() {
		log.info("===========TC_03_Register03");
		Assert.assertTrue(true);
	}
	
}
