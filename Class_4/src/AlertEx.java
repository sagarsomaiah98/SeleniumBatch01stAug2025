import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//button[@name='proceed']")).click();
		
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		String txt=al.getText();
		System.out.println(txt);
	//	al.accept(); // OK
		al.dismiss(); //cancel
		
		driver.quit();
		

	}

}
