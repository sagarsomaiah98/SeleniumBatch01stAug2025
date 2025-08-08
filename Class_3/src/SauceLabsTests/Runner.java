package SauceLabsTests;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		
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
