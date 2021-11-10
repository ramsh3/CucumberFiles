package com.adactin;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

public class TC02_LoginPage extends BaseClass {

	static WebDriver driver;

	
	public void signIn() throws IOException {
		driver = browserLaunch("chrome");
		implicitWait(10);
		get("https://adactinhotelapp.com/");
		LoginPage sign = new LoginPage(driver);
		sendKeys(sign.getUserName(), excelValue(0, 0, 1));
		sendKeys(sign.getPassword(), excelValue(0, 1, 1));
		click(sign.getLoginButton());
	}
}
