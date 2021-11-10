$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Checking the booking functionality of the adactin hotel application",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User checking the login page using valid username and password",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-login-page-using-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launch the application url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter the valid username in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter the valid password in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefintion.user_launch_the_application_url()"
});
formatter.result({
  "duration": 6553901100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_enter_the_valid_username_in_the_username_field()"
});
formatter.result({
  "duration": 1374527000,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_enter_the_valid_password_in_the_password_field()"
});
formatter.result({
  "duration": 273047300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 2057514000,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "In search hotel page user to fill as required field",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;in-search-hotel-page-user-to-fill-as-required-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User verify the current page title",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User select the location for corresponding location dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User select the hotel name for corresponding dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User select the room type for corresponding dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User select the no of rooms for corresponding dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enter the check in date for corresponding field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enter the check out date for corresponding field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User select the adults per room for corresponding dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User wish to select or not the children per room for coresponding dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User completed all input fields then click the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefintion.user_verify_the_current_page_title_Adactin_com_Search_Hotel()"
});
formatter.result({
  "duration": 15348100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_select_the_location_for_corresponding_location_dropdown()"
});
formatter.result({
  "duration": 347739300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_select_the_hotel_name_for_corresponding_dropdown()"
});
formatter.result({
  "duration": 256647700,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_select_the_room_type_for_corresponding_dropdown()"
});
formatter.result({
  "duration": 259379100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_select_the_no_of_rooms_for_corresponding_dropdown()"
});
formatter.result({
  "duration": 226682100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_enter_the_check_in_date_for_corresponding_field()"
});
formatter.result({
  "duration": 246870500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_enter_the_check_out_date_for_corresponding_field()"
});
formatter.result({
  "duration": 229290400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_select_the_adults_per_room_for_corresponding_dropdown()"
});
formatter.result({
  "duration": 211396900,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_wish_to_select_or_not_the_children_per_room_for_coresponding_dropdown()"
});
formatter.result({
  "duration": 32300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_completed_all_input_fields_then_click_the_search_button()"
});
formatter.result({
  "duration": 1284849700,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User checking the hotel details and select the hotel",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-checking-the-hotel-details-and-select-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "User verify the current select hotel page title",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User check the given input as correct then user select radio button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User clicks the continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefintion.user_verify_the_current_select_hotel_page_title()"
});
formatter.result({
  "duration": 17352500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_check_the_given_input_as_correct_then_user_select_radio_button()"
});
formatter.result({
  "duration": 128905200,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_clicks_the_continue_button()"
});
formatter.result({
  "duration": 1430434500,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "User fill the requried fields to complete book a hotel",
  "description": "",
  "id": "checking-the-booking-functionality-of-the-adactin-hotel-application;user-fill-the-requried-fields-to-complete-book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "User verify the current book hotel page title",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User enter the first name in first name field",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User enter the last name in last name field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User enter the address in billing address field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User enter the dummy card number in credit card number field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User select the card type in card type dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User select the month and year in expiry date dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User enter the ccv in ccv field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User click the book button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefintion.user_verify_the_current_book_hotel_page_title()"
});
formatter.result({
  "duration": 7048400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_enter_the_first_name_in_first_name_field()"
});
formatter.result({
  "duration": 176788100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_enter_the_last_name_in_last_name_field()"
});
formatter.result({
  "duration": 140987800,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_enter_the_address_in_billing_address_field()"
});
formatter.result({
  "duration": 165283400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_enter_the_dummy_card_number_in_credit_card_number_field()"
});
formatter.result({
  "duration": 170080400,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_select_the_card_type_in_card_type_dropdown()"
});
formatter.result({
  "duration": 247681100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_select_the_month_and_year_in_expiry_date_dropdown()"
});
formatter.result({
  "duration": 466426100,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_enter_the_ccv_in_ccv_field()"
});
formatter.result({
  "duration": 153947300,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_click_the_book_button()"
});
formatter.result({
  "duration": 20112421500,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefintion.user_quit_the_browser()"
});
formatter.result({
  "duration": 665703400,
  "status": "passed"
});
});