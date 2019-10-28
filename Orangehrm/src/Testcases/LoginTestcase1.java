package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Browsers.BrowserFactory;
import PomPages.Loginpage;
import Utils.ConfigReader;

public class LoginTestcase1 {
public WebDriver driver;
@Test
public void verfylogin() throws IOException{
	ConfigReader a = new ConfigReader();
	WebDriver driver=BrowserFactory.StartBrowser("chrome");
	driver.get(a.getUrl());
	Loginpage l1 = new Loginpage(driver);
	
	l1.VerfyLogin(a.GetUsername(),a.GetPassword());
}
}
