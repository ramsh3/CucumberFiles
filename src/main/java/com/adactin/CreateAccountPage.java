package com.adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

	static WebDriver driver;
	static Workbook excel;
	static File acatin;
	static FileInputStream input;
	
	@FindBy(className = "login_register")
	private WebElement register;
	@FindBy(id = "username")
	private WebElement userName;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "re_password")
	private WebElement rePassword;
	@FindBy(id = "full_name")
	private WebElement firstName;
	@FindBy(id = "email_add")
	private WebElement emailID;
	@FindBy(id = "captcha-form")
	private WebElement captcha;
	@FindBy(id = "tnc_box")
	private WebElement agreeClick;
	@FindBy(id = "Submit")
	private WebElement submit;

	public CreateAccountPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRePassword() {
		return rePassword;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getEmailID() {
		return emailID;
	}

	public WebElement getCaptcha() {
		return captcha;
	}

	public WebElement getAgreeClick() {
		return agreeClick;
	}

	public WebElement getSubmit() {
		return submit;
	}


}
