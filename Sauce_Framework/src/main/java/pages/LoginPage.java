package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LoginPage extends Base{
	
	@FindBy(xpath="//input[@id='user-name']")
	public WebElement username ;
	
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	public WebElement loginButton;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String uname, String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
	}

}
