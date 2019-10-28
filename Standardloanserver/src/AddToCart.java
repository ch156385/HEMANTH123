import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCart {
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
}
@Test(priority =3)
public void SelectingProduct() throws InterruptedException{
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//a[text()='Women']")).click();
	driver.findElement(By.partialLinkText("Faded Short Sleeve T-shirts")).click();
	String s1 = driver.getTitle();
	System.out.println(s1);
	String s2 = "Faded Short Sleeve T-shirts - My Store";
	Assert.assertEquals(s1, s2);
}
@Test(priority =3)
public void Addtocart() throws InterruptedException{
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@name='Submit']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//a[@title='Proceed to checkout']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@title='Proceed to checkout']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@name='processAddress']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//input [@value='1']")).click();
	driver.findElement(By.xpath(".//*[@name='processCarrier']")).click();
	String s1=driver.findElement(By.xpath(".//*[text()='Please choose your payment method']")).getText();
	System.out.println(s1);
}
}