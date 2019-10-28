/**
 * 
 */
package cg_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Hemanth
 *
 */
public class Login_Testcase_1 {
	public WebDriver driver;

	@Test(priority = 1)
	public void login() {
		System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://dssdfs-trials646.orangehrmlive.com");
		System.out.println(driver.getTitle());
	}

	@Test(dataProvider="hemanth")
	public void creadincal(String username, String pass) {
		try{
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		System.out.println(driver.getTitle());
		}
			catch (Exception e) {
			System.out.println("hello world");
		}
	}

	@DataProvider(name = "hemanth")
	public Object[][] value() {
		Object[][] values = null;
		values = new Object[][] { { "reddyhemanth224", "8147359220" }, { "reddyhemanth081", "8147359220" },
				{ "Admin", "8147359220" } };
		return values;
	}
}
