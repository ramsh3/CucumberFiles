package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.BaseClass;
import com.adactin.POM;
import com.runnner.AdactinTestRun;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class AdactinStepDefintion extends BaseClass {

	public static WebDriver driver = AdactinTestRun.driver;
	POM object = new POM(driver);

	@Given("^User launch the application url$")
	public void user_launch_the_application_url() throws Throwable {
		get("https://adactinhotelapp.com/");
	}

	@When("^User enter the valid username in the username field$")
	public void user_enter_the_valid_username_in_the_username_field() throws Throwable {
		sendKeys(object.signIn().getUserName(), excelValue(0, 0, 1));

	}

	@When("^User enter the valid password in the password field$")
	public void user_enter_the_valid_password_in_the_password_field() throws Throwable {
		sendKeys(object.signIn().getPassword(), excelValue(0, 1, 1));
	}

	@Then("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		click(object.signIn().getLoginButton());
	}

	@Given("^User verify the current page title$")
	public void user_verify_the_current_page_title_Adactin_com_Search_Hotel() throws Throwable {
		String currentTitle = pageTitle();
		Assert.assertEquals("Adactin.com - Search Hotel", currentTitle);
	}

	@When("^User select the location for corresponding location dropdown$")
	public void user_select_the_location_for_corresponding_location_dropdown() throws Throwable {
		dropdown(object.search().getLocation(), "London");
	}

	@When("^User select the hotel name for corresponding dropdown$")
	public void user_select_the_hotel_name_for_corresponding_dropdown() throws Throwable {
		dropdown(object.search().getHotels(), "Hotel Hervey");
	}

	@When("^User select the room type for corresponding dropdown$")
	public void user_select_the_room_type_for_corresponding_dropdown() throws Throwable {
		dropdown(object.search().getRoomType(), "Super Deluxe");
	}

	@When("^User select the no of rooms for corresponding dropdown$")
	public void user_select_the_no_of_rooms_for_corresponding_dropdown() throws Throwable {
		dropdown(object.search().getNoOfRooms(), "1");
	}

	@When("^User enter the check in date for corresponding field$")
	public void user_enter_the_check_in_date_for_corresponding_field() throws Throwable {
		clear(object.search().getCheckIn());
		sendKeys(object.search().getCheckIn(), "21/03/2022");
	}

	@When("^User enter the check out date for corresponding field$")
	public void user_enter_the_check_out_date_for_corresponding_field() throws Throwable {
		clear(object.search().getCheckOut());
		sendKeys(object.search().getCheckOut(), "28/07/2022");
	}

	@When("^User select the adults per room for corresponding dropdown$")
	public void user_select_the_adults_per_room_for_corresponding_dropdown() throws Throwable {
		dropdown(object.search().getAdultPerRoom(), "2");
	}

	@When("^User wish to select or not the children per room for coresponding dropdown$")
	public void user_wish_to_select_or_not_the_children_per_room_for_coresponding_dropdown() throws Throwable {

	}

	@Then("^User completed all input fields then click the search button$")
	public void user_completed_all_input_fields_then_click_the_search_button() throws Throwable {
		click(object.search().getSubmitButton());
	}

	@Given("^User verify the current select hotel page title$")
	public void user_verify_the_current_select_hotel_page_title() throws Throwable {
		Assert.assertEquals(pageTitle(), "Adactin.com - Select Hotel");
	}

	@When("^User check the given input as correct then user select radio button$")
	public void user_check_the_given_input_as_correct_then_user_select_radio_button() throws Throwable {
		click(object.select().getRadioButton());
	}

	@Then("^User clicks the continue button$")
	public void user_clicks_the_continue_button() throws Throwable {
		click(object.select().getSubmitButton());
	}
	
	@Given("^User verify the current book hotel page title$")
	public void user_verify_the_current_book_hotel_page_title() throws Throwable {
		Assert.assertEquals(pageTitle(), "Adactin.com - Book A Hotel");
	}

	@When("^User enter the first name in first name field$")
	public void user_enter_the_first_name_in_first_name_field() throws Throwable {
		sendKeys(object.book().getFirstName(), "Ramesh");
	}

	@When("^User enter the last name in last name field$")
	public void user_enter_the_last_name_in_last_name_field() throws Throwable {
		sendKeys(object.book().getLast_name(), "Kumar");
	}

	@When("^User enter the address in billing address field$")
	public void user_enter_the_address_in_billing_address_field() throws Throwable {
		sendKeys(object.book().getAddress(), "Anna Nagar, Chennai");
	}

	@When("^User enter the dummy card number in credit card number field$")
	public void user_enter_the_dummy_card_number_in_credit_card_number_field() throws Throwable {
		sendKeys(object.book().getCardNumber(),"1234567891011123");
	}

	@When("^User select the card type in card type dropdown$")
	public void user_select_the_card_type_in_card_type_dropdown() throws Throwable {
		dropdown(object.book().getCardType(), "VISA");
	}

	@When("^User select the month and year in expiry date dropdown$")
	public void user_select_the_month_and_year_in_expiry_date_dropdown() throws Throwable {
		dropdown(object.book().getCardMonth(), "3");
		dropdown(object.book().getCardYear(), "2022");
	}

	@When("^User enter the ccv in ccv field$")
	public void user_enter_the_ccv_in_ccv_field() throws Throwable {
		sendKeys(object.book().getCardCcv(), "333");
	}

	@When("^User click the book button$")
	public void user_click_the_book_button() throws Throwable {
		click(object.book().getBookButton());
		Thread.sleep(20000);
	}
	
	@Then("^User quit the browser$")
	public void user_quit_the_browser() throws Throwable {
		quit();
	}

}
