import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testcase1 {
public WebDriver driver;
@Test(priority=1)
public void Setup(){
	System.setProperty("webdriver.Firefox.driver","c:\\firefoxdriver.exe");
	 driver = new FirefoxDriver();
	 driver.get("http://opensource.demo.orangehrmlive.com/");
	 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
}
@Test(priority=2)
public void test1() throws InterruptedException{
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
	driver.findElement(By.xpath("//a[@id='menu_core_viewDefinedPredefinedReports']")).click();
	driver.findElement(By.xpath("//a[@href='/index.php/core/displayPredefinedReport?reportId=5']")).click();
}
}
