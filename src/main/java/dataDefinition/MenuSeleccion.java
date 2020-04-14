package dataDefinition;

import java.util.Properties;

import configuration.AppiumConfiguration;

public class MenuSeleccion extends AppiumConfiguration{
	Properties xpathProp=loadProperties(xpathPropertiesFolder+"/"+this.getClass().getSimpleName()+".properties");
	//Properties dataProp=loadProperties(dataPropertiesFolder+"/"+this.getClass().getSimpleName()+".properties");
	
	protected String mainMenu,longuitud,area,Volumen,Velocidad;
	
	public MenuSeleccion() {
		cargarPropiedades();
	}
	
	public void cargarPropiedades() {
		mainMenu=xpathProp.getProperty("mainMenu");
		longuitud=xpathProp.getProperty("longuitud");
		area=xpathProp.getProperty("area");
		Volumen=xpathProp.getProperty("Volumen");
		Velocidad=xpathProp.getProperty("Velocidad");
	}
}
