package manajaga.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configurations {
	
	
	
	public static String URL = getConfigData("URL");
	//public static String Browser = getConfigData("Browser");
	public static String ChromeDriverPath = getConfigData("chromeDriverPath");
	public static String FirefoxDriverPath = getConfigData("firefoxDriverPath");
	public static String exp = getConfigData("String[] exp");

	public static String getConfigData(String sKey) {

		Properties prop = new Properties();
		InputStream input = null;
		String data = null;
		try {
			String userDir = System.getProperty("user.dir");
			input = new FileInputStream(userDir + "//src//main//resources//configurations//configurations.properties");

			prop.load(input);

			// get the property value and print it out
			data = prop.getProperty(sKey);
			if (data != null)
				data = data.trim();
			return data;
		} catch (Exception ex) {
			ex.printStackTrace();
			return data;
		} finally {
			if (input != null)
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
