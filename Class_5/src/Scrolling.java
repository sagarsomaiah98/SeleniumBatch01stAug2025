
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Scrolling  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	   WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.trustpilot.com/review/janbasktraining.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");//top to bottom
		Thread.sleep(3000);
		
		
		// js.executeScript("window.scrollBy(0,100)"); Thread.sleep(3000);
		 //js.executeScript("window.scrollBy(100,1000)"); Thread.sleep(3000);
		 //js.executeScript("window.scrollBy(1000,2000)"); Thread.sleep(3000);
		 
		
		js.executeScript("window.scrollTo(10000,500)");//bottom to top
		
		

	}

}
