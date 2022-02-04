package com.gistgithub.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gistgithub.test.driver.DriverSingleton;

public class Login {
	WebDriver driver;
	
	public Login() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "body > div.position-relative.js-header-wrapper > div > div.Header-item.f4.mr-0 > a.HeaderMenu-link.no-underline.mr-3")
	private WebElement btnSignin;
	
	public void gotoLoginPage() {
		btnSignin.click();
	}
	
	@FindBy(id = "login_field")
	private WebElement txtUsername;
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(css = "#login > div.auth-form-body.mt-3 > form > div > input.btn.btn-primary.btn-block.js-sign-in-button")
	private WebElement btnLogin;
	
	public void inputLogin(String username, String password) {
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
}
