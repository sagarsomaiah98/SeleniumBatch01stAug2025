package util;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class Util extends Base {
	static Select select;
	
	public static void  selectByValue(WebElement selectElement, String value) {
		
		select = new Select(selectElement);
		select.selectByValue(value);
			
		
	}
	
public static void selectByIndex(WebElement selectElement, int index) {
		
		select = new Select(selectElement);
		select.selectByIndex(index);
		
			
	}

public static void selectByVisibleText(WebElement selectElement, String visibleText) {
	
	select = new Select(selectElement);
	select.selectByVisibleText(visibleText);
	
	
}


public static String DateTime() {
	LocalDateTime myDateObj = LocalDateTime.now();
	   
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
    
    return formattedDate;
    
}

public static void Screenshot() throws IOException  {
	
	String name = driver.getTitle()+"_"+DateTime();

	TakesScreenshot scrShot = ((TakesScreenshot) driver);

	File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
	
	System.out.println(System.getProperty("user.dir") +"\\SCREENSHOTS\\");

	File DestFile = new File(System.getProperty("user.dir") + "\\SCREENSHOTS\\" +  name+".jpeg");

	FileUtils.copyFile(SrcFile, DestFile);
}


}
