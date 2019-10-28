import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Booking {
public WebDriver driver;
@Test(priority =1)
public void setup(){
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
}
@Test(priority =2)
public void Booking() throws InterruptedException{
	driver.findElement(By.xpath(".//*[@name='q']")).sendKeys("phone");
	driver.findElement(By.xpath(".//*[@type='submit']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[text()='Redmi Note 5 Pro (Gold, 64 GB)']")).click();
}
}
