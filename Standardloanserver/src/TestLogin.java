import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
public WebDriver driver;
@Test(priority =1)
public void Setup(){
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://automationpractice.com/");
	}
@Test(priority =2)
public void login(){
	driver.findElement(By.partialLinkText("Sign")).click();
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("reddyhemanth224@gmail.com");
	driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("8147359220");
	driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
	String s1 =driver.getTitle();
	String s2 = "My account - My Store";
	Assert.assertEquals(s1, s2);
	System.out.println("yes");
}
}
