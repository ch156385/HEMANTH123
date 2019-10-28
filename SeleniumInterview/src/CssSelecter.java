import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CssSelecter {
	public WebDriver driver;
@Test
public void ByusingCssSelecter() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin");
	driver.findElement(By.cssSelector("//input[@name='Submit']")).click();
}
}
