package com.adactin;

import org.openqa.selenium.WebDriver;

public class POM {

	public static WebDriver driver;
	
	LoginPage signInPage;
	SearchHotelPage searchPage;
	SelectHotelPage selectPage;
	BookAHotel bookPage;
	
	public POM(WebDriver driver2) {
		this.driver=driver2;
		}

	public LoginPage signIn() {
		signInPage = new LoginPage(driver);
		return signInPage;
	}
	
	public SearchHotelPage search() {
		searchPage = new SearchHotelPage(driver);
		return searchPage;
	}
	
	public SelectHotelPage select() {
		selectPage = new SelectHotelPage(driver);
		return selectPage;
	}
	
	public BookAHotel book() {
		bookPage = new BookAHotel(driver);
		return bookPage;
	}
	
	
}
