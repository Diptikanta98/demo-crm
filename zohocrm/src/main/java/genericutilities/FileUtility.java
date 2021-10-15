package genericutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	/*
	 * author Dipti
	 */
/**
 * This method used to read data from properties and return the value based on key specified
 * @param key
 * @return
 * @throws Throwable 
 * @throws Throwable
 */
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream file=new FileInputStream(IpathConstant.PROPERTY_FILEPATH);
		Properties prop=new Properties();
		prop.load(file);
		return prop.getProperty(key);
		
		
	}
}
