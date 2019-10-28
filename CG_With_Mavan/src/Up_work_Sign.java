import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Up_work_Sign {
	public WebDriver driver;
@Test(priority=1)
public void m1() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.upwork.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//a[text()='Sign up'])[2]")).click();
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ravi");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Reddy");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("reddyhemanth228@gmail.com");
	driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
}
}
