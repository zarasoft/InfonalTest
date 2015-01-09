package Infonal;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageTest extends TestCase {

	public static class LoginTest {

		private final static WebDriver driver = new FirefoxDriver();


		 @AfterClass 
		 public static void afterAllIsSaidAndDone() {
			 driver.quit();
		 }

		@After
		public void after() {
			driver.manage().deleteAllCookies();
		}

		@Before
		public void before() {
             
		}

		@Test
		public void testLogin() throws Exception {

			LoginPage loginPage = new LoginPage(driver);

		}

		@Test
		public void testFailedLogin() throws Exception {

			LoginPage loginPage = new LoginPage(driver);
		}

	}
}
