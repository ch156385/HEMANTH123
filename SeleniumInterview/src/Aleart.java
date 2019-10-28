import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Aleart {
	public WebDriver driver;
@Test
public void  verfy(){
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name= 'cusid']")).sendKeys("548461");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	// Alert a = driver.switchTo().alert();
	Alert a = driver.switchTo().alert();
	
	 String x = driver.switchTo().alert().getText();
	 System.out.println(x);
	 a.accept();
}
}
