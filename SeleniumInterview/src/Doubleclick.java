import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Doubleclick {
	public WebDriver driver;
@Test
public void  verfy() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	Actions a = new Actions(driver);
	WebElement ele=driver.findElement(By.xpath(".//*"));
	Thread.sleep(5000);
	a.contextClick(ele).perform();
	a.doubleClick(ele).perform();
}
}
