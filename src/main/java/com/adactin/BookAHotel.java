package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {

	static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id="last_name")
	private WebElement last_name;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cardNumber;
	@FindBy(id="cc_type")
	private WebElement cardType;
	@FindBy(id="cc_exp_month")
	private WebElement cardMonth;
	@FindBy(id="cc_exp_year")
	private WebElement cardYear;
	@FindBy(id="cc_cvv")
	private WebElement cardCcv;
	@FindBy(id="book_now")
	private WebElement bookButton;
	
	public BookAHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLast_name() {
		return last_name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardNumber() {
		return cardNumber;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getCardMonth() {
		return cardMonth;
	}
	public WebElement getCardYear() {
		return cardYear;
	}
	public WebElement getCardCcv() {
		return cardCcv;
	}
	public WebElement getBookButton() {
		return bookButton;
	}
	
	
	
}
