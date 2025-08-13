import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLHandling {

	public static void main(String[] args) {
		
		ChromeOptions option= new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});//diable automation notification
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
