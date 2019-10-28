package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Browsers.BrowserFactory;
import PomPages.AddEmployeeT3;
import PomPages.EditEmployeedetailsT4;
import PomPages.Loginpage;
import PomPages.Logoutpage;
import Utils.ConfigReader;

public class Testcase4 {

	public WebDriver driver;
	@Test
	public void verfy() throws IOException, InterruptedException{
		ConfigReader a = new ConfigReader();
		WebDriver driver=BrowserFactory.StartBrowser("firefox");
		driver.get(a.getUrl());
		Loginpage l1 = new Loginpage(driver);
		l1.VerfyLogin(a.GetUsername(),a.GetPassword());
		 EditEmployeedetailsT4 l3 = new  EditEmployeedetailsT4(driver);
		l3.empsearch1();
		l3.empsearch2();
		Logoutpage  l2 = new Logoutpage(driver);
		l2.verfy();
		
}
}
