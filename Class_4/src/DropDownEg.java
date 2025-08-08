import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg {
	
	
	public static void dropDownSelection(WebElement dropdowns,String dropdownValue,String selectionType) {
		
		Select sel=new Select(dropdowns);
		if(selectionType.equals("indexValue"))
		     
			sel.selectByIndex(Integer.parseInt(dropdownValue));
			if(selectionType.equals("value"))
				sel.selectByValue("value");
		
		if(selectionType.equals("visibleText"))
			sel.selectByVisibleText(dropdownValue);
		else
			System.out.println("selection not in the group");
		
			
		
	}
	
	
	
	public static void dropDownByVisibleText(WebElement select,String dropdownValue) {
		Select sel=new Select(select);
		sel.selectByVisibleText(dropdownValue);
		
	}
	
	public static void dropDownByIndex(WebElement select,int index) {
		Select sel=new Select(select);
		sel.selectByIndex(index);
		
	}

	public static void dropDownByValue(WebElement select,String value) {
		Select sel=new Select(select);
		sel.selectByValue(value);
		
	}
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		
		WebElement dropdowns=driver.findElement(By.xpath("//select[@name='dropdown']"));
		
		Select sel=new Select(dropdowns);
	
		sel.selectByIndex(3);
	
		sel.selectByValue("ddperformance");
	
		sel.selectByVisibleText("Automation Testing");
		
		List<WebElement> drops=sel.getOptions();
		System.out.println(drops.size());
		
		for(int i =0;i<drops.size();i++) {
			System.out.println(drops.get(i).getText());
		}
		
		dropDownByVisibleText(dropdowns,"Automation Testing");
		dropDownByIndex(dropdowns,1);
		dropDownByValue(dropdowns, "ddperformance");
		
		dropDownSelection(dropdowns,"Automation Testing","visibleText");
		
		driver.quit();
		

	}

}
