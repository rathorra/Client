package com.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.net.ssl.SSLSession;

public class BaseClass_Main 
{
	
	
public Properties prop;
	
	public BaseClass_Main () 
	
	{
		try {
			 prop = new Properties();
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/confrigration/config.properties");
		
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean verify(String arg0, SSLSession arg1) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
