package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;
import util.Util;

public class LoginTest extends Base{
	
	@BeforeMethod
	public void init() throws IOException {
		initialize();
	}
	
	
	@Test(priority=1)
	public void validLogin() throws IOException {
		
		LoginPage loginpage= new LoginPage();
		loginpage.login("standard_user", "secret_sauce");
	
		
	}
	
	@Test(priority=2)
	public void invalidLogin() throws IOException {
		
		LoginPage loginpage= new LoginPage();
		loginpage.login("standard_user", "secret_sauce1");
		String actualError=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		System.out.println(actualError);
		assertEquals(actualError, "Epic sadface: Username and password do not match any user in this service");
	   
		
	}
	
	@AfterMethod
	public void teardown() throws IOException {
		Util.Screenshot();
		driver.quit();
	}

}
