package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class DataProviderEg {
	
	
	
	
	@DataProvider(name="TestData")
	public Object[][] data() {
		
	
		return new Object[][] {{"U1","P1"},
		            	       {"U1","P2"},
		            	       {"U3","P3"}
		};
		
	}
	
	@DataProvider(name="TestData2")
	public Object[][] data2() {
		
	
		return new Object[][] {{"U1","P1","C3"},
		            	       {"U1","P2","C3"},
		            	       {"U3","P3","C3"}
		};
		
	}
	
	
	//@Test(dataProvider="TestData")
	public void method(String username, String password) {
		System.out.println(username+" | "+password);
		
		
	}
	
	
	@Test(dataProvider="TestData2")
	public void method1(String username, String password,String comment) {
		System.out.println(username+" | "+password+" | "+comment);
		
		
	}
	

	

}
