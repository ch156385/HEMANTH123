import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CossBrowser {
WebDriver driver;
@BeforeTest
@Parameters("browser")
public void setup(String browser) throws Exception{
	if(browser.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
	
		driver = new ChromeDriver();
	}
	else{
		throw new Exception("Browser is not correct");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test
public void testParameterWithXML() throws InterruptedException{
	driver.get("http://demo.guru99.com/V4/");
	WebElement userName = driver.findElement(By.name("uid"));
	userName.sendKeys("guru99");
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("guru99");

}
}
