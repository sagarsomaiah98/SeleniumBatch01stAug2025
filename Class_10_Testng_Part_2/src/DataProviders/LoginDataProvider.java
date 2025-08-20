package DataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider {
	
	@Test(dataProvider="logindata")
	public void login(String username, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	     driver.quit();

	}
	
	@DataProvider(name="logindata")
	public String[][] testData() {
		
		String[][] login= new String[3][2];
		login[0][0]="standard_user";
		login[0][1]="secret_sauce";

		login[1][0]="problem_user";
		login[1][1]="secret_sauce";
		
		login[2][0]="error_user";
		login[2][1]="secret_sauce";
		
		return login;
	}

}
