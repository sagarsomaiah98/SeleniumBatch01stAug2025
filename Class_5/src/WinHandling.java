import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandling {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
	 driver.findElement(By.linkText("Privacy")).click();
	
		Set<String> wins=driver.getWindowHandles();
		
		Iterator<String> it =wins.iterator();
		String parent=it.next();
		String child=it.next();
		
		System.out.println(wins.size());
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//span[normalize-space()='Learn more']")).click();
		Thread.sleep(2000);
		
		driver.quit();


	}

}
