package com.gistgithub.test.glue;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.gistgithub.test.RunTests;
import com.gistgithub.test.config.AutomationFrameworkConfig;
import com.gistgithub.test.driver.DriverSingleton;
import com.gistgithub.test.pages.CreateGist;
import com.gistgithub.test.pages.Delete;
import com.gistgithub.test.pages.Edit;
import com.gistgithub.test.pages.List;
import com.gistgithub.test.pages.Login;
import com.gistgithub.test.utils.ConfigurationProperties;
import com.gistgithub.test.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition extends RunTests{
	private WebDriver driver;
	private Login lg;
	private CreateGist cg;
	private List li;
	private Delete de;
	private Edit ed;
	
	@Autowired
	ConfigurationProperties configProperties;
	
	@Before
	public void intializeObjects() {
		DriverSingleton.getInstance(configProperties.getBrowser());
		lg = new Login();
		cg = new CreateGist();
		li = new List();
		de = new Delete();
		ed = new Edit();
	}
	
	//============================== Login ========================
	@Given("^go to the website")
	public void go_to_the_website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}
	
	@When("^click sign in button")
	public void click_sign_in_button() {
		lg.gotoLoginPage();
	}
	
	@When("^input username and password")
	public void input_username_and_password() {
		lg.inputLogin(configProperties.getUsername(), configProperties.getPassword());
	}
	
	@Then("^click login button")
	public void click_login_button() {
		lg.clickBtnLogin();
	}
	
	//=========================== Create Gist ==========================
	@When("^click button add plus")
	public void click_button_add_plus() {
		cg.gotoInputCode();
	}
	
	@When("^input gist description")
	public void input_gist_description() {
		cg.inputGitDesc(configProperties.getDescription());
	}
	
	@When("^input filename")
	public void input_filename() {
		cg.inputFileName(configProperties.getFileName());
	}
	
	@When("^input code")
	public void input_code() {
		cg.inputCode(configProperties.getCode());
	}
	
	@Then("^click create secret gist")
	public void click_create_secret_gist() {
		cg.clickBtnCreate();
	}
	
	//============ List =====================
	@When("^click username")
	public void click_username(){
		li.clickUserName();
	}
	
	//=========== Delete ===================
	@When("^click the code")
	public void click_the_code() {
		de.clickCode();
	}
	
	@When("^click button delete")
	public void click_button_delete() {
		de.clickBtnDelete();
	}
	
	//================= edit =================
	@When("^click button add plus2")
	public void click_button_add_plus2() {
		ed.gotoInputCode2();
	}
	
	@When("^input description new")
	public void input_description_new() {
		ed.inputGitDesc2(configProperties.getDesc2());
	}
	
	@When("^input filename new")
	public void input_filename_new() {
		ed.inputFileName2(configProperties.getFileName2());
	}
	
	@When("^input code new")
	public void input_code_new() {
		ed.inputCode2(configProperties.getCode2());
	}
	
	@When("^click create secret gist2")
	public void click_create_secret_gist2() {
		ed.clickBtnCreate2();
	}
	
	@When("^click button edit")
	public void click_button_edit() {
		ed.clickBtnEdit();
	}
	
	@When("^edit description")
	public void edit_description() {
		ed.inputNewDesc(configProperties.getEdit());
	}
	
	@Then("^update secret gist")
	public void update_secret_gist() {
		ed.clickBtnUpdate();
	}
}
