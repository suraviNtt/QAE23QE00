package dataReaders;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author User
 *
 */
public class PropertiesReader {
	Properties properties;

	/**
	 * 
	 */
	public PropertiesReader() {
		//get project file location
		String currentFolderLocation = System.getProperty("user.dir");
		//get config file location inside project
		String configFileLoaction = "/src/main/resources/configuration.properties";
		
		System.out.println(currentFolderLocation + configFileLoaction);

		try {
			FileInputStream file = new FileInputStream(currentFolderLocation + configFileLoaction);
			properties = new Properties();
			properties.load(file); //loading file in properties class
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public String getBrowserType() {

		return (String) properties.get("browser");

	}
	
	/**
	 * 
	 * @return
	 */
	public String getURL() {

		return (String) properties.get("url");

	}

}
