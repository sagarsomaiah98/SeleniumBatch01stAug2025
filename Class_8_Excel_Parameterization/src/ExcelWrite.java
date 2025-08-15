import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
	Workbook wb = new XSSFWorkbook();
		
		Sheet s1 = wb.createSheet("SHEETA");
		Sheet s2 = wb.createSheet("SHEETB");
		Sheet s3 = wb.createSheet("SHEETC");
		
		for (int i=0;i<10;i++) {
			Row r = s1.createRow(i);
			for(int j=0;j<10;j++) {
				Cell c= r.createCell(j);
				c.setCellValue(i+" "+j);
				
			}
			
		}
		
		OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\Selenium Batch - 01st Aug 2025\\Class_8_Excel_Parameterization\\src\\TESTDATA\\Sample2.xlsx");
	    wb.write(fileOut);
       System.out.println("done");	

	}

}
