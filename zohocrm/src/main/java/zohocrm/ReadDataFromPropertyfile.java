package zohocrm;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyfile {

	public  void readDataFromPropertyFile {
		/*read the data from properties file*/
		
		//step1: get the java representation object of the physical.file
		FileInputStream fis=new FileInputStream("./Data/CommonData.peoperties");
		//step2: create an object of the properties class and load the all keys:value pair
		Properties pobj=new Properties();
		pobj.load(fis);
		//step3:read the value using getproperty("key")
		String URL= pobj.getProperty("url");
		String BROWSER=pobj.getProperty("browser");
		String Us=pobj.getProperty("username");
		String PASSWORD=pobj.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(Us);
		System.out.println(PASSWORD);

		}

}
