import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Scrolledown {
	public WebDriver driver;
@Test(priority=1)
public void scrolldown() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
}
@Test(priority =2)
public void scrollup() throws InterruptedException{
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,-1000)");
}
}
