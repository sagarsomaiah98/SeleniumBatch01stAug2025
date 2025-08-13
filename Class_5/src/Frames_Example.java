import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing.qaautomationlabs.com/iframe.php");
		driver.switchTo().frame("iframe1");
		driver.findElement(By.xpath("//button[normalize-space()='CLick Me']")).click();
		System.out.println("done");

		

	}

}
