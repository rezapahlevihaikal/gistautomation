package com.gistgithub.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gistgithub.test.driver.DriverSingleton;

public class CreateGist {
	private WebDriver driver;
	
	public CreateGist() {
		driver =  DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "body > div.position-relative.js-header-wrapper > div > div:nth-child(6) > a > svg.octicon.octicon-plus.d-none.d-md-inline-block")
	private WebElement btnPlus;
	
	public void gotoInputCode() {
		btnPlus.click();
	}
	
	@FindBy(css = "#gists > input")
	private WebElement txtGistDesc;
	
	public void inputGitDesc(String gistDesc) {
		txtGistDesc.sendKeys(gistDesc);
	}
	
	@FindBy(css = "#gists > div.js-gist-file > file-attachment > div > div.file-header.d-flex.flex-items-center.pr-0 > div.input-group.gist-filename-input > input.form-control.js-gist-filename.js-blob-filename")
	private WebElement txtFileName;
	
	public void inputFileName(String fileName) {
		txtFileName.sendKeys(fileName);
	}
	
	@FindBy(css = "#code-editor > div > pre")
	private WebElement txtCode;
	
	public void inputCode(String code) {
		txtCode.sendKeys(code);
	}
	
	@FindBy(css = "#new_gist > div > div.d-flex.flex-items-center.flex-justify-between > div > button")
	private WebElement btnCreate;
	
	public void clickBtnCreate() {
		btnCreate.click();
	}
}

