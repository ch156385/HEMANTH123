import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testcase1 {
public WebDriver driver;
@Test
public void Testcase1() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.google.com/gmail/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("Reddyhemanth224@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("8147359220");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[text()='Next']")).click();
}
}
