import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		
		//https://poi.apache.org/components/spreadsheet/quick-guide.html#NewWorkbook
		//https://archive.apache.org/dist/poi/release/bin/
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet s1 = wb.createSheet("SHEETA");
		Sheet s2 = wb.createSheet("SHEETB");
		Sheet s3 = wb.createSheet("SHEETC");
		
		Row r0 = s2.createRow(0);
		Row r1 = s2.createRow(1);
		Row r2 = s2.createRow(2);
		Row r3 = s2.createRow(3);
		
		Cell c1 = r3.createCell(5);
		Cell c2 = r3.createCell(6);
		Cell c3 = r3.createCell(7);
		c1.setCellValue(100);
		c2.setCellValue("testing");
		c3.setCellValue(24.54);
	
	OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\Selenium Batch - 01st Aug 2025\\Class_8_Excel_Parameterization\\src\\TESTDATA\\Sample1.xlsx");
		    wb.write(fileOut);
		
System.out.println("done");
	}

}
