package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Browsers.BrowserFactory;
import PomPages.AddEmployeeT3;
import PomPages.Loginpage;
import PomPages.Logoutpage;
import Utils.ConfigReader;

public class Testcase3 {
	public WebDriver driver;
	@Test
	public void verfy() throws IOException, InterruptedException{
		ConfigReader a = new ConfigReader();
		WebDriver driver=BrowserFactory.StartBrowser("firefox");
		driver.get(a.getUrl());
		Loginpage l1 = new Loginpage(driver);
		l1.VerfyLogin(a.GetUsername(),a.GetPassword());
		AddEmployeeT3 l3 = new AddEmployeeT3(driver);
		l3.addemployee();
		Logoutpage  l2 = new Logoutpage(driver);
		l2.verfy();
		
}
}
