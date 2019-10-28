import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DrageAndDrop {
public WebDriver driver;
@Test
public void DrageAndDrop() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	Actions a = new Actions(driver);
	WebElement From = driver.findElement(By.xpath(".//*[@id='credit2']/a"));
	WebElement To = driver.findElement(By.xpath(".//*[@id='bank']/li"));
	Thread.sleep(5000);
	
	a.dragAndDrop(From, To).build().perform();
	a.clickAndHold(From).moveToElement(To).build().perform();
	Thread.sleep(5000);
	WebElement From1 = driver.findElement(By.xpath(".//*[@id='credit0']/a"));
	WebElement To1 = driver.findElement(By.xpath(".//*[@id='amt7']/li"));
	a.dragAndDrop(From1, To1).build().perform();
	Thread.sleep(5000);
	WebElement From2 = driver.findElement(By.xpath(".//*[@id='credit4']/a"));
	WebElement To2 = driver.findElement(By.xpath(".//*[@id='loan']/li"));
	a.dragAndDrop(From2, To2).build().perform();
	a.contextClick(From).perform();
}
}
