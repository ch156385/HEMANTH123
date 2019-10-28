import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
	public WebDriver driver;
@Test(priority =1)
public void XXX(){
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	 driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
}
@Test(priority =2)
public void Setup() throws InterruptedException{
	//System.out.println("driver=" + driver); 
	driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("phone");
	driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
}
}