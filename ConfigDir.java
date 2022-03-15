package com.cristina.conexiones;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigDir {
	private Properties propiedades;
	private static ConfigDir conf;
        private String hola = "hola que ase!";
	
	public ConfigDir() throws IOException{
		propiedades= new Properties();
		InputStream is= getClass().getResourceAsStream("propiedades/prop.properties");
		propiedades.load(is);
	}
	
	public static ConfigDir getInstance() throws IOException{
		if (null==conf)
			conf=new ConfigDir();
		return conf;	
	}
	
	public String getProperty(String propiedad) {
		return propiedades.getProperty(propiedad);
	}	
	public boolean getBooleanProperty(String cadena) {
		boolean flag=false;
		String guardo= propiedades.getProperty(cadena);
		if(guardo.equalsIgnoreCase("true")||guardo.equalsIgnoreCase("si")||guardo.equalsIgnoreCase("yes")||guardo.equalsIgnoreCase("1"))
			flag=true;
		return flag;
	}
	//HOLA
	
}
