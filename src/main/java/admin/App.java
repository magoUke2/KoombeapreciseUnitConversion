package admin;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;


import configuration.AppiumConfiguration;
import configuration.Utils;

public class App extends Utils{
	 
		String standardDate;
		App application;
	    FileHandler fh;
	public App() {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmm");
		Date date = new Date();
		standardDate = dateFormat.format(date);
		new File(System.getProperty("user.dir")+"/logs/" + standardDate + "").mkdirs();;
		System.setProperty("java.util.logging.SimpleFormatter.format", 
	         "%4$s: %5$s [%1$tc]%n");
		AppiumConfiguration.setDate(standardDate);
		try {
	        fh = new FileHandler(System.getProperty("user.dir")+"/logs/" + standardDate + "/log.log");  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        
	        fh.setFormatter(formatter);  
	        logger.log(Level.INFO, "Starting test...");
	    } catch (SecurityException e) {  
	        e.printStackTrace();  
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }  
	}
	
	 public StepsCreation loadSteps() {
	    	StepsCreation sps =new StepsCreation();
	    	return sps;
    }
	 
	 public void dateFolder() {
		 
	 }
	
	
}

