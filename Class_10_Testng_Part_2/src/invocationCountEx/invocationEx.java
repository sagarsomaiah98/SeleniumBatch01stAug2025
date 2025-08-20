package invocationCountEx;

import org.testng.annotations.Test;

public class invocationEx {
	
	@Test(invocationCount=10)
	public void method1() {
		
		System.out.println("calling method1");
	}

}
