package AnnotatiosEx;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



public class AnnotationEg {
	
	


	@Test
	public void method1() {
		
		System.out.println("calling method 1");
	}
	
	@BeforeMethod
	public void init() {
		
		System.out.println("calling init*************************************");
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("calling teardowns***********************");
	}
	
	@Test
  public void method2() {
		
		System.out.println("calling method 2");
	}

	@Test
	  public void method3() {
			
			System.out.println("calling method 3");
		}
	
	@BeforeTest
	
	public void beforetest() {
		
		System.out.println("**********calling before test *****************");
	}

	
	@AfterTest
	
	public void aftertest() {
		
		System.out.println("**********calling after test *****************");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("_______________before Class____________________________");
	}
	

	@AfterClass
	public void afterClass() {
		System.out.println("_______________after Class____________________________");
	}
	
	
	
}
