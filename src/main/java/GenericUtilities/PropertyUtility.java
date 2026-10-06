package GenericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility {
	
	FileInputStream fis;
	
	public String getData(String key) throws Exception {
		fis = new FileInputStream("./src/test/resources/configfile.properties");
		Properties p = new Properties();
		p.load(fis);
		
		return p.getProperty(key);
		
	}

}