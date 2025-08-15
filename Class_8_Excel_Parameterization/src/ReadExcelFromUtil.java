
public class ReadExcelFromUtil {

	public static void main(String[] args) {
		
		Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\Selenium Batch - 01st Aug 2025\\Class_8_Excel_Parameterization\\src\\TESTDATA\\TESTSUITE.xlsx");
		int rowCount=xls.getRowCount("GMAIL");
		System.out.println(rowCount);
		
		for(int i=1;i<=rowCount;i++) {
		String c1=xls.getCellData("GMAIL", "TCID", i);
		String c2=xls.getCellData("GMAIL", "TESTCASE", i);
		String c3=xls.getCellData("GMAIL", "STATUS", i);
		System.out.println(c1+" "+c2+" "+c3);

	}
		xls.addColumn("GMAIL", "comment");
	}
}
