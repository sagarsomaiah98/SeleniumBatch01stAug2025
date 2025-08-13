import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement table=driver.findElement(By.xpath("//table[@id='table1']"));
		
		//total number of rows in the table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		///total number of columns in the first row - column headings
		List<WebElement> headers=rows.get(0).findElements(By.tagName("th"));
		
		for (int i=0;i<headers.size();i++) {
		 String c1= headers.get(i).getText();
		 System.out.print(c1+ "| ");
		}
		
		System.out.println();
		//columns in the second row
		
		//to print all the contents from the table
		
	    for(int i=1;i<rows.size();i++) {
	    	
		List<WebElement> row1=rows.get(i).findElements(By.tagName("td"));
		String r1= row1.get(0).getText();//column1
		String r2= row1.get(1).getText();//column2
		String r3= row1.get(2).getText();//column3
	
		System.out.println(r1+"| "+r2+" | "+r3);
	    }
	
	//	System.out.println(headers.size());
		
		driver.quit();
	}

}
