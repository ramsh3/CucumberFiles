package com.adactin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class TC01_CreateAccount extends BaseClass {

	static WebDriver driver;

	
	public void signUp() throws IOException, InterruptedException {

		driver = browserLaunch("chrome");
		implicitWait(10);
		get("https://adactinhotelapp.com/");
		CreateAccountPage create = new CreateAccountPage(driver);
		click(create.getRegister());
		sendKeys(create.getUserName(), excelValue(1, 0, 1));
		sendKeys(create.getPassword(), excelValue(1, 1, 1));
		sendKeys(create.getRePassword(), excelValue(1, 2, 1));
		sendKeys(create.getFirstName(), excelValue(1, 3, 1));
		sendKeys(create.getEmailID(), excelValue(1, 4, 1));
		Thread.sleep(10000);
		click(create.getAgreeClick());
		click(create.getSubmit());
	}

}
