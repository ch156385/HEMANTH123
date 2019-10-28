
import org.openqa.selenium.By; 
import org.openqa.selenium.Point; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test; 
public class RemoteWebDriverSctolldown
{ 
	public static WebDriver driver;
   public static void main(String[] args)  
 { 
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
   
   RemoteWebDriver r= (RemoteWebDriver) driver; 
   
   String s="window.scrollTo(0,1000)"; 
   r.executeScript(s); 
 } 
} 
