package com.gistgithub.test.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	@Value("${browser}")
	private String browser;
	
	@Value("${myusernames}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	public String getBrowser() {
		return browser;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	@Value("${description}")
	private String description;
	
	@Value("${filename}")
	private String filename;
	
	@Value("${code}")
	private String code;
	
	public String getDescription() {
		return description;
	}
	
	public String getFileName() {
		return filename;
	}
	
	public String getCode() {
		return code;
	}
	
	
	@Value("${messageList}")
	private String messageList;
	
	public String getMessage() {
		return messageList;
	}
	
	@Value("${messageDelete}")
	private String messageDelete;
	
	public String getMessageDelete() {
		return messageDelete;
	}
	
	
	@Value("${description2}")
	private String description2;
	
	@Value("${filename2}")
	private String filename2;
	
	@Value("${code2}")
	private String code2;
	
	@Value("${edit}")
	private String edit;
	
	public String getDesc2() {
		return description2;
	}
	
	public String getFileName2() {
		return filename2;
	}
	
	public String getCode2() {
		return code2;
	}
	
	public String getEdit() {
		return edit;
	}
}
