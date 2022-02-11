package fr.eni.connexion.dal;

import java.io.IOException;
import java.util.Properties;

import fr.eni.connexion.dal.Settings;

public class Settings {
	
private static Properties properties;
	
	static {
		properties = new Properties();
		
		try {
			properties.load(Settings.class.getResourceAsStream("settings.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

}
