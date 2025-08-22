package temp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import base.Base;

public class temporary {

	public static void main(String[] args) throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
		prop.load(fis);
		//System.out.println(prop.getProperty("Browser"));
		//System.out.println(System.getProperty("user.dir"));
		
		Base base = new Base();
		base.initialize();
	}

}
