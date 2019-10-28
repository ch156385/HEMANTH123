package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory{
static WebDriver driver;
public static WebDriver StartBrowser(String browsername){
	if(browsername.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	else if(browsername.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else
	{
		System.out.println("invalid browsername");
	}
	//driver.manage().window().maximize();
	//driver.get("http://opensource.demo.orangehrmlive.com/");
	return driver;
}
}
