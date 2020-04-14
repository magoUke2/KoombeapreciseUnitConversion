package configuration;



public interface Objects {
	//folders for properties
	String xpathPropertiesFolder="./properties/xpath";
	String dataPropertiesFolder="./properties/data";
	//Capabilities
	String capabilityName1="platformName";
	String capabilityName2="deviceName";
	String capabilityName3="platformVersion";
	String capabilityName4="app";
	
	String capabilityValue1="Android";
	String capabilityValue2="ivan";
	String capabilityValue3="8.1";
	String capabilityValue4="C:\\\\Users\\\\User\\\\Documents\\\\android\\\\PreciseUnitConversion.apk";
	
	//URL connection for the appium hub
	String urlAppiumServer="http://127.0.0.1:4723/wd/hub";
	
	String logName1="koombeaLog";
	
	//String screenshotFolder="logs/screenshots/";
	String logFolder="logs/";
	
	int standardWaitingTime=60;
	int standardWaitUntilGoneTime=5;
}
