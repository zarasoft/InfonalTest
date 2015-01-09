package Infonal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private final WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		
	}

	public void failLoginAs(String username, String password) {
		executeLogin(username, password);
	}

	private void executeLogin(String username, String password) {

		driver.findElement(By.name("j_username")).sendKeys(username);
		driver.findElement(By.name("j_password")).sendKeys(password);
		driver.findElement(By.name("submit")).submit();
	}


}

