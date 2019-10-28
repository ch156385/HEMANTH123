package Hemanth2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	Properties  p;
public ConfigReader() throws IOException{
	try{
	File src = new File("C:\\Users\\Hemanth\\Desktop\\Selenium\\Orangehrm\\Configfolder\\Configreader.properties");
	FileInputStream fs = new FileInputStream(src);
	p = new Properties();
	p.load(fs);
	}
	catch(Exception e){
		System.out.println("Exception is == "+e.getMessage());
	}
}
public String getUrl(){
	String Url = p.getProperty("Url");
	return Url;
}

}
