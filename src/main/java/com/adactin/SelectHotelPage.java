package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {

	static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	@FindBy(id="continue")
	private WebElement submitButton;
	
	public SelectHotelPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	 
	
	
	
	
	
}
