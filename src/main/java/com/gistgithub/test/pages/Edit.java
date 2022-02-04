package com.gistgithub.test.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gistgithub.test.driver.DriverSingleton;

public class Edit {
	private WebDriver driver;
	
	public Edit() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "body > div.position-relative.js-header-wrapper > div > div:nth-child(6) > a > svg.octicon.octicon-plus.d-none.d-md-inline-block")
	private WebElement btnPlus2;
	
	public void gotoInputCode2() {
		btnPlus2.click();
	}
	
	@FindBy(css = "#gists > input")
	private WebElement txtGistDesc2;
	
	public void inputGitDesc2(String gistDesc2) {
		txtGistDesc2.sendKeys(gistDesc2);
	}
	
	@FindBy(css = "#gists > div.js-gist-file > file-attachment > div > div.file-header.d-flex.flex-items-center.pr-0 > div.input-group.gist-filename-input > input.form-control.js-gist-filename.js-blob-filename")
	private WebElement txtFileName2;
	
	public void inputFileName2(String fileName2) {
		txtFileName2.sendKeys(fileName2);
	}
	
	@FindBy(css = "#code-editor > div > pre")
	private WebElement txtCode2;
	
	public void inputCode2(String code2) {
		txtCode2.sendKeys(code2);
	}
	
	@FindBy(css = "#new_gist > div > div.d-flex.flex-items-center.flex-justify-between > div > button")
	private WebElement btnCreate2;
	
	public void clickBtnCreate2() {
		btnCreate2.click();
	}
	
	@FindBy(css = "#gist-pjax-container > div.gisthead.pagehead.pb-0.pt-3.mb-4 > div > div.mb-3.d-flex.px-3.px-md-3.px-lg-5 > ul > li:nth-child(1) > a")
	private WebElement btnEdit;
	
	public void clickBtnEdit() {
		btnEdit.click();
	}
	
	public void inputNewDesc(String newDesc) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(txtGistDesc2));
		txtGistDesc2.sendKeys(Keys.CONTROL + "a");
		txtGistDesc2.sendKeys(newDesc);
	}
	
	@FindBy(css = "#edit_gist_114536702 > div > div.form-actions > button")
	private WebElement btnUpdate;
	
	public void clickBtnUpdate() {
		btnUpdate.click();
	}
}
