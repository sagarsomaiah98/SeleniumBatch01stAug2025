package SauceLabsTests;

import org.testng.annotations.Test;

public class TestRunnerTest {
	
	@Test
	public void exe() throws InterruptedException {
		LoginTest login= new LoginTest();
		login.login();
		
		AddtoCart a = new AddtoCart();
		  	a.addtocart();
			
			LogOutTest  lo= new LogOutTest();
			lo.logout();
			
			MultiUserLogin mu= new MultiUserLogin();
		mu.verifyLogin("standard_user","secret_sauce");

		
	}

	

}
