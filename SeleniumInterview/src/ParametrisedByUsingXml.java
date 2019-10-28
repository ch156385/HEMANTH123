import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrisedByUsingXml {
public WebDriver driver;
@Test
@Parameters({"Url","UserName","pass"})
public void setup(String Url, String  UserName, String pass){
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get(Url);
	driver.findElement(By.partialLinkText("Sign")).click();
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys( UserName);
	driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys(pass);
	driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
}
}
