

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoard_Functions {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		WebDriver driver= new ChromeDriver();

		 //Navigate to the demo site
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("john");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("john123@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("24 bakers street");
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(Keys.chord(Keys.TAB));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
        Thread.sleep(1000);
        
        
     
       


		

	}

}
