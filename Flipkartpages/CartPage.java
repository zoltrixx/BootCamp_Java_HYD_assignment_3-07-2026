package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
		
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By addToCart = By.xpath("//span[normalize-space()='Cart']");
	
	public void addItemToCart() {
		
		driver.findElement(addToCart).click();
	}
}
