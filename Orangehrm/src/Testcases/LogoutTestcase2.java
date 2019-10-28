package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Browsers.BrowserFactory;
import PomPages.Loginpage;
import PomPages.Logoutpage;
import Utils.ConfigReader;

public class LogoutTestcase2 {
	@Test
	public void VerfyLogout() throws IOException{
		ConfigReader a = new ConfigReader();
		WebDriver driver=BrowserFactory.StartBrowser("firefox");
		driver.get(a.getUrl());
		Loginpage l1 = new Loginpage(driver);
		l1.VerfyLogin(a.GetUsername(),a.GetPassword());
		Logoutpage  l2 = new Logoutpage(driver);
		l2.verfy();
		
}
}