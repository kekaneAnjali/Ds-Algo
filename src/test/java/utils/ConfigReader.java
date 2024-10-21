package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {
        try (InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config/config.properties")) {
            if (input == null) {
                throw new RuntimeException("config.properties file not found");
            }
            properties.load(input);
        } catch (IOException ex) {
            throw new RuntimeException("Error loading config.properties file", ex);
        }
    }  

    
    public static String getBrowser() {
    	return properties.getProperty("browser");
    }
    
    public static String getBaseUrl() {
    	return properties.getProperty("base.url");
    }
    
    public static String getPageLoadTimeout() {
    	return properties.getProperty("page.load.timeout");
    }
}


