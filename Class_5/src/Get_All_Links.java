import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_All_Links  {
	
	 public static void verifyLink(String url) {
		  try {
		  URL link = new URL(url);
		  HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		  httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		  httpURLConnection.connect();


		  if (httpURLConnection.getResponseCode() == 200) {
		  System.out.println(url + " - " + httpURLConnection.getResponseMessage());
		  } else {
		  System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		  }
		  } catch (Exception e) {
		  System.out.println(url + " - " + "is a broken link");
		  }
		  }
	
	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			
			System.out.println(links.get(i).getText());
			String url=links.get(i).getAttribute("href");
			System.out.println(url);
			verifyLink(url);
			System.out.println("____________________________________________________________________________");
		}
		driver.quit();
	  
	  }


	 

	
		
	}
		
		
	

