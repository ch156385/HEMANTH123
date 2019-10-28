package qspider.acttime.genricLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverClass {
	public static WebDriver driver;
	public static WebDriver getBrowser(){
		if(Const.browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "E:\\New folder\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}else if(Const.browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(Const.browser.equals("sa")){
			driver=new SafariDriver();
		}else{
			driver=new FirefoxDriver();
		}
		return driver;
		
	}

}
