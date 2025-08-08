import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFilling {
	
public static int randomID(){
		
		int ID=(int) (Math.random()*10000);
	
		return ID;

	}
	
	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Doe");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("24 beker street");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Sydney");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("NSW");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("2148");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("653698");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("John"+randomID());
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		

	}

}
