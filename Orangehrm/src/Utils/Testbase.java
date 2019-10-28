package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;


public class Testbase {
	@Test
public void ReadData() throws IOException{
	
	File f = new File("C:\\Users\\Hemanth\\Desktop\\Selenium\\Orangehrm\\Configfolder\\Configreader.properties");
    FileInputStream fs = new FileInputStream(f);
    Properties  p = new Properties ();
    p.load(fs);
  String x = p.getProperty("Url");
  System.out.println(x);
  String y = p.getProperty("Username");
  System.out.println(y);
  String z = p.getProperty("Password");
  System.out.println(z);
    
}

}
