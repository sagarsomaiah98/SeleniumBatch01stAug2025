package AnnotatiosEx;

import org.testng.annotations.Test;

public class Prioirty {
	
	
	@Test(priority=5)
	public void login() {
		System.out.println("calling login");
	}
	
	@Test(priority=2)
	public void order() {
		System.out.println("calling order");
	}
	
	@Test(priority=-2)
	public void filter() {
		System.out.println("calling filter");
	}
	
	@Test(priority=1)
	public void cart() {
		System.out.println("calling cart");
	}
	@Test(priority=0)
	public void logout() {
		System.out.println("calling logout");
	}

}
