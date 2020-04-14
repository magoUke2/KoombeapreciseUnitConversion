package configuration;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebElement;


public abstract class Utils implements Objects {
	public static String date="";
	public static Logger logger = Logger.getLogger(logName1);  
	public static final String errorFolder="ERROR";
	
	public static void setDate(String date) {
		Utils.date=date;
	}
	
	public Properties loadProperties(String configFile) {
		Properties mainProperties = new Properties();

	    FileInputStream file;
	    try {
			file = new FileInputStream(configFile);
			mainProperties.load(new InputStreamReader(file, Charset.forName("UTF-8")));
		    file.close();
		} catch (Exception e1) {
			//couldnt load property file
			logger.log(Level.SEVERE,"No pude cargar archivo de propiedades "+e1.getMessage());
			System.err.println("No pude cargar archivo de propiedades "+e1.getMessage());
		}
	    return mainProperties;
	}
	
	private enum indicatore{
		contains, equals
	}
	public boolean verifyText(WebElement element, String data,String indicator) {
		boolean verify=false;
		indicatore indi=indicatore.valueOf(indicator);
		switch (indi) {
		case contains:
			if (element.getText().contains(data))
				verify=true;
			break;
		case equals:
			if (element.getText().equals(data))
				verify=true;
			break;
		default:
			break;
		}
		
		if (verify) 
			logger.log(Level.INFO, "Same text --- "+data);
		else
			logger.log(Level.SEVERE, "Different text --- "+element.getText()+" - "+data);
		return verify;
	}
	
	public static String randonUUID() {
	    final String uuid = UUID.randomUUID().toString();
	    return uuid;
	}
	
	public int randomNumber(int maximum,int minimum) {
		int number=0;
		try {
			if(maximum<=minimum)
				logger.severe("minimum number is bigger than maximum");
		Random r=new Random();
		number=r.nextInt(maximum-minimum)+minimum;
		}catch(Exception e) {
			logger.severe("Couldnt get random number "+e.getMessage());
		}
		return number;
	}
}
