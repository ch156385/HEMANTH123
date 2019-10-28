import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testcase4 {
public WebDriver driver;
@Test(priority =1)
public  void  Setup(){
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.partialLinkText("Sign")).click();
	driver.findElement(By.xpath(".//input[@name='email']")).sendKeys("reddyhemanth224@gmail.com");
	driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("8147359220");
	driver.findElement(By.xpath(".//*[@name='SubmitLogin']")).click();
}
@Test(priority = 2)
public void Selectingdata(){
	driver.findElement(By.xpath(".//*[@id='search_query_top']")).sendKeys("hello");
	Actions a = new Actions(driver);
	a.sendKeys(Keys.RETURN).perform();
	WebElement ele1=driver.findElement(By.xpath(".//*[@id='center_column']/p"));
	
	System.out.println(ele1.getText());
	driver.findElement(By.xpath(".//*[@id='search_query_top']")).sendKeys("Printed Chiffon Dress ");

	a.sendKeys(Keys.RETURN).perform();
	
}
}
