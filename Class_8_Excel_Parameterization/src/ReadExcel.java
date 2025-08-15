import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("S:\\JANBASK\\Selenium Batch - 01st Aug 2025\\Class_8_Excel_Parameterization\\src\\TESTDATA\\TESTSUITE.xlsx");
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s1= wb.getSheet("GMAIL");
		int rows=s1.getLastRowNum(); // total number of rows
		 
		System.out.println("total rows -> "+rows);
		Row row=s1.getRow(2);
		int cols=row.getLastCellNum();
		System.out.println("total columns in the row "+ cols);
		System.out.println();
		Cell cell=row.getCell(1);
		System.out.println(cell);
		System.out.println("********************************");
		
		for(int i=0;i<=rows;i++) {
			
			Row r=s1.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++) {
				
				System.out.print(r.getCell(j)+" | ");
				
			}
			System.out.println();
		}

	}

}
