package AnnotatiosEx;

import org.testng.annotations.Test;

public class ignoreTests {

	     @Test
	  public void method2() {
			
			System.out.println("calling method 2");
		}

		@Test(enabled=false)
		  public void method3() {
				
				System.out.println("calling method 3");
			}
		

}
