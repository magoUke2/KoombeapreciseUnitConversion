package dataDefinition;

import java.util.Properties;

import configuration.AppiumConfiguration;

public class General extends AppiumConfiguration{
	Properties xpathProp=loadProperties(xpathPropertiesFolder+"/"+this.getClass().getSimpleName()+".properties");
	Properties dataProp=loadProperties(dataPropertiesFolder+"/"+this.getClass().getSimpleName()+".properties");
	
	protected String button7,from,to;
	
	public General() {
		cargarPropiedades();
	}
	
	public void cargarPropiedades() {
		button7=xpathProp.getProperty("button7");
		from=xpathProp.getProperty("from");
		to=xpathProp.getProperty("to");
	}
	
	
}
