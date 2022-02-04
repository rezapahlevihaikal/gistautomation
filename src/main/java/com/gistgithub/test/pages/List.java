package com.gistgithub.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gistgithub.test.driver.DriverSingleton;

public class List {
	private WebDriver driver;
	
	public List() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#gist-pjax-container > div.gisthead.pagehead.pb-0.pt-3.mb-4 > div > div.mb-3.d-flex.px-3.px-md-3.px-lg-5 > div > div > div.d-flex.flex-column.width-full > div.d-flex.flex-row.width-full > h1 > span.author > a")
	private WebElement gotoList;
	
	public void clickUserName() {
		gotoList.click();
	}
	
	@FindBy(css = "#gist-pjax-container > div > div > div.col-9.col-md-9.col-12 > div.pagehead.py-0.border-0.mt-md-0.mt-6.mr-md-0.mr-n3.ml-md-0.ml-n3 > nav > div.UnderlineNav-body > a")
	private WebElement getMessageList;
	
	public String getList() {
		return getMessageList.getText();
	}
}
