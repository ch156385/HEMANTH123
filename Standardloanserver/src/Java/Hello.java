package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hello {
public WebDriver driver;
@Test
public void setup() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://accounts.google.com/");
	driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("reddyhemanth081@gmail.com");
	Actions a = new Actions(driver);
	a.sendKeys(Keys.RETURN).perform();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("h8147359220");
	a.sendKeys(Keys.RETURN).perform();

}
}
