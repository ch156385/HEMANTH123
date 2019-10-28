package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Browsers.BrowserFactory;
import PomPages.DeletingEmployee;
import PomPages.EditEmployeedetailsT4;
import PomPages.Loginpage;
import PomPages.Logoutpage;
import Utils.ConfigReader;

public class Testcase5 {
	public WebDriver driver;
	@Test
	public void verfy() throws IOException, InterruptedException{
		ConfigReader a = new ConfigReader();
		WebDriver driver=BrowserFactory.StartBrowser("firefox");
		driver.get(a.getUrl());
		Loginpage l1 = new Loginpage(driver);
		l1.VerfyLogin(a.GetUsername(),a.GetPassword());
		DeletingEmployee l3 = new DeletingEmployee(driver);
		l3.deletingemployee();
		Logoutpage  l2 = new Logoutpage(driver);
		l2.verfy();
		
}
}
