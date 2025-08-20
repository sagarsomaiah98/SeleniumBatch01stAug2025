package GroupsEx;

import org.testng.annotations.Test;

public class GroupEx {
	
	@Test(groups= {"Smoke"})
	public void login() {
		System.out.println("login test");
	}
	
	@Test(groups= {"Sanity"})
	public void order() {
		System.out.println("order test");
	}

	
	@Test(groups= {"Regression"})
	public void filter() {
		System.out.println("filter test");
	}

	
	@Test(groups= {"Smoke"})
	public void logout() {
		System.out.println("logout test");
	}

	
	@Test(groups= {"Smoke"})
	public void cart() {
		System.out.println("cart test");
	}

	
	@Test(groups= {"Smoke","Regression"})
	public void checkout() {
		System.out.println("checkout test");
	}


}
