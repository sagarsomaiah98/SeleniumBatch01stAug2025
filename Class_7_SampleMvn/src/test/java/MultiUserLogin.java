

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiUserLogin {
	
	public void verifyLogin(String username, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		try {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println(username+ "Login Successfull");
		}
		catch(Exception e) {
			
			
			System.out.println(username+ "Login Failed");
			
			
		}
		Thread.sleep(2000);
		driver.quit();

	


	}

	public static void main(String[] args) throws InterruptedException {
		
		MultiUserLogin m= new MultiUserLogin();
		m.verifyLogin("standard_user","secret_sauce");
		m.verifyLogin("locked_out_user","secret_sauce");
		m.verifyLogin("problem_user","secret_sauce");
		m.verifyLogin("performance_glitch_user","secret_sauce");
		m.verifyLogin("error_user","secret_sauce");
		m.verifyLogin("visual_user","secret_sauce");
	}

}
