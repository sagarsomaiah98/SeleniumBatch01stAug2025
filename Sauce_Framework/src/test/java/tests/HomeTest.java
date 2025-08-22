package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.HomePage;
import pages.LoginPage;
import util.Util;

public class HomeTest extends Base {
	
	@BeforeMethod
	public void init() throws IOException {
		initialize();
		LoginPage loginpage= new LoginPage();
		loginpage.login("standard_user", "secret_sauce");
	}
	
	
	@Test
	public void addToCart() throws InterruptedException {
		
		HomePage homepage = new HomePage();
		Thread.sleep(2000);
		homepage.addItemToCart();
		String actual=driver.findElement(By.xpath("//button[@id='continue-shopping']")).getText();
		System.out.println(actual);
		assertEquals(actual, "Continue Shopping");
		
	}
	
	@Test
	public void filterSelection() throws InterruptedException {
	
		HomePage homepage = new HomePage();
		Thread.sleep(2000);
		Util.selectByValue(homepage.filter, "lohi");
		
		
		
	}
	
	
	@AfterMethod
	public void teardown() throws IOException {
		Util.Screenshot();
		driver.quit();
	}

}
