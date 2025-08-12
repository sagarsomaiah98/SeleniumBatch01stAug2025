import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		
		
	
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("(//button[normalize-space()='Right Click Me'])[1]"));
		
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.contextClick(button).build().perform();
	
		
	}

}
