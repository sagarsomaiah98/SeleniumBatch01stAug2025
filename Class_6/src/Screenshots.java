import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing.qaautomationlabs.com/web-table.php");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Src=ts.getScreenshotAs(OutputType.FILE);
		File Dest= new File("S:\\JANBASK\\Selenium Batch - 01st Aug 2025\\Class_6\\SCREENSHOTS\\"+" test.jpeg");
		FileUtils.copyFile(Src,Dest);
		
		WebElement menu=driver.findElement(By.xpath("//div[@class='sidebar']"));
		Src=menu.getScreenshotAs(OutputType.FILE);
		Dest= new File("S:\\JANBASK\\Selenium Batch - 01st Aug 2025\\Class_6\\SCREENSHOTS\\"+" menu..jpeg");
		FileUtils.copyFile(Src,Dest);
		
		driver.quit();
	}

}
