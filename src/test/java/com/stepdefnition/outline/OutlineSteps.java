package com.stepdefnition.outline;

import org.openqa.selenium.WebDriver;

import com.adactin.BaseClass;
import com.adactin.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OutlineSteps extends BaseClass {

	public static WebDriver driver;
	LoginPage sign ;

	@Given("^User launch the application url$")
	public void user_launch_the_application_url() throws Throwable {
		driver = browserLaunch("chrome");
		implicitWait(10);
		get("https://adactinhotelapp.com/");
	}

	@When("^User enter the valid \"([^\"]*)\" in the username field$")
	public void user_enter_the_valid_in_the_username_field(String username) throws Throwable {
		sign = new LoginPage(driver);
		sendKeys(sign.getUserName(), username);
	}

	@When("^User enter the valid \"([^\"]*)\" in the password field$")
	public void user_enter_the_valid_in_the_password_field(String password) throws Throwable {
		sign = new LoginPage(driver);
		sendKeys(sign.getPassword(), password);
		Thread.sleep(4000);
	}

	@Then("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		sign = new LoginPage(driver);
		click(sign.getLoginButton());
		
	}
	
	@Then("^User can view the search hotel page$")
	public void user_can_view_the_search_hotel_page() throws Throwable {
		sign = new LoginPage(driver);
		System.out.println(pageTitle());
		
		quit();
	}
}
