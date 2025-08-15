import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginExcelUsers {

	public static void main(String[] args) throws InterruptedException {
		Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\Selenium Batch - 01st Aug 2025\\Class_8_Excel_Parameterization\\src\\TESTDATA\\SAUCE_LOGIN.xlsx");
		int rowCount=xls.getRowCount("SAUCE");
		System.out.println(rowCount);
		
		for(int i=2;i<=rowCount;i++) {
		String user=xls.getCellData("SAUCE", "USERNAME", i);
		String pass=xls.getCellData("SAUCE", "PASSWORD", i);
		
		System.out.println(user+" "+pass);
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
		driver.quit();


	}
	}

}
