package com.gistgithub.test;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/features")
public class RunTests extends AbstractTestNGCucumberTests{
	
	@Test
	public void tests() {
		
	}
}
