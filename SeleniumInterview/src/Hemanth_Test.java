import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hemanth_Test {
public WebDriver driver;
@Test
public void m1() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
	Thread.sleep(5000);
	Actions a = new Actions(driver);
	a.sendKeys(Keys.RETURN);
List <WebElement> ele=  driver.findElements(By.tagName("a"));
System.out.println(ele.size());
for (WebElement e1 :ele)
System.out.println(e1.getAttribute("href"));
}
}