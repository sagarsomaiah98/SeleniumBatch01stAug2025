package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Base;
import util.Util;

public class HomePage extends Base{
	 @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	 public WebElement addTocart;
	
	
	 @FindBy(xpath="//a[@class='shopping_cart_link']")
	 public WebElement cart;

	 @FindBy(xpath="//select[@class='product_sort_container']")
	public WebElement filter;
	 
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	public WebElement menu;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-fleece-jacket']")
	public WebElement remove;
	
	public void addItemToCart() {
		addTocart.click();
		cart.click();
	}
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	

}
