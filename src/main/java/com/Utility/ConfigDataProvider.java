package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	public ConfigDataProvider() throws Exception {
		String path="C:\\Users\\Dell\\eclipse-workspace\\DSS_Batch_January\\Config\\Config.Properties";
		FileInputStream fis=new FileInputStream(path);
		pro=new Properties();
		pro.load(fis);
	}
	
	public String getStageUrl() {
		return pro.getProperty("StageUrl");
	}
	
	public String getLiveUrl() {
		return pro.getProperty("LiveUrl");
	}
	
}
