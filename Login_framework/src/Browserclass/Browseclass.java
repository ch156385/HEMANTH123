package Browserclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browseclass {
static WebDriver driver;
public static WebDriver Browserobject(String browsername){
	if(browsername.equalsIgnoreCase("Firefox")){
		System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
		 driver = new FirefoxDriver();
		}
	else if(browsername.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	else if(browsername.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.ie.driver","c:\\chromedriver.exe");
		driver = new InternetExplorerDriver();
	}
	else {
		System.out.println("invalid browsername");
	}
	return driver;
	
}
}
