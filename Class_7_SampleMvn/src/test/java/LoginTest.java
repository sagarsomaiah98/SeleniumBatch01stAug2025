

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		try {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println("Login Successfull");
		}
		catch(Exception e) {
			
			String error=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
			System.out.println("Login Failed");
			System.out.println(error);
			
		}
		Thread.sleep(2000);
		driver.quit();

	
	
		
	}

	public static void main(String[] args) throws InterruptedException {

	}

}
