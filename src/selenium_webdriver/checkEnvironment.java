package selenium_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class checkEnvironment {
	
		WebDriver driver;
		String projectPath = System.getProperty("user.dir");

		@BeforeClass
		public void beforeClass() {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("");
		}

		@Test
		public void TC_01_() {

		}

		@Test
		public void TC_02_() {
			
		}

		@Test
		public void TC_03_() {
			
		}

		@AfterClass
		public void afterClass() {
			driver.quit();
		}
	}


