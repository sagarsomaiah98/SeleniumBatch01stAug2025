import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class HandleNotificationsExample {
    public static void main(String[] args) throws InterruptedException {


  
    	        
    	        WebDriver driver = new ChromeDriver();
    	        driver.manage().window().maximize();
    	        driver.get("https://testing.qaautomationlabs.com/notifications.php");

    	      
    	        driver.quit();
    	    }
    	}

