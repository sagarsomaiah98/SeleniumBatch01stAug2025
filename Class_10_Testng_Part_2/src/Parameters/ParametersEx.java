package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersEx {
	
	
	@Test
	@Parameters({"browser","url","username","password"})
	public void logintest(String browser,String url,String username,String password) {
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		
		
	}

}
