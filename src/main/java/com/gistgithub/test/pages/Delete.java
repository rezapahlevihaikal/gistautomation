package com.gistgithub.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gistgithub.test.driver.DriverSingleton;

public class Delete {
	private WebDriver driver;
	
	public Delete() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "file-e-L1")
	private WebElement clickCode;
	
	public void clickCode() {
		clickCode.click();
	}
	
	@FindBy(css = "#gist-pjax-container > div.gisthead.pagehead.pb-0.pt-3.mb-4 > div > div.mb-3.d-flex.px-3.px-md-3.px-lg-5 > ul > li:nth-child(2) > form > button")
	private WebElement btnDelete;
	
	public void clickBtnDelete() {
		btnDelete.click();
		driver.switchTo().alert().accept();
	}
	
	@FindBy(css = "#js-flash-container > div > div")
	private WebElement messageDelete;
	
	public String getMessageDelete() {
		return messageDelete.getText();
	}
}
