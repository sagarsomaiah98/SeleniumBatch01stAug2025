package DependsOnEx;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DependsOnEx {
	
	@Test
	public void login() {
		
		assertEquals(true, false);
		
		System.out.println("login test");
	}
	
	@Test(dependsOnMethods="login")
	public void order() {
		
		System.out.println("order test");
	}
	@Test(dependsOnMethods="login")
	public void filter() {
		
		System.out.println("filter");
	}

}
