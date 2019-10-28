import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JavaScriptExeguter {
	public WebDriver driver;
@Test
public void setup() {
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
	myExecutor.executeScript("document.getElementsByName('q')[0].value='Kirtesh'");
	driver.quit();
}
}