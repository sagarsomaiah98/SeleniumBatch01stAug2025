package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	Properties prop;
	FileInputStream fis;
	public static WebDriver driver;
	
	public void initialize() throws IOException {
		 prop= new Properties();
		fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
		prop.load(fis);
		String browser=prop.getProperty("Browser").toLowerCase();
		String url=prop.getProperty("Url");
		int timeout=Integer.parseInt(prop.getProperty("Timeout"));
		System.out.println(browser);
		switch(browser)
		{
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("browser not supported - Invalid browser-- "+browser);
		
		
		}
		driver.manage().window().maximize();
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
		
	}

}
