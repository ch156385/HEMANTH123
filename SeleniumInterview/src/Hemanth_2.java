import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hemanth_2 {
public WebDriver driver;
@Test(priority =1)
public void m1() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://automationpractice.com/");
	driver.findElement(By.partialLinkText("Sign")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("reddyhemanth224@gmail.com");
	driver.findElement(By.xpath("//input[@id ='passwd']")).sendKeys("8147359220");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id ='SubmitLogin']")).click();
	//Actions a = new Actions(driver)	;	
//a.sendKeys(Keys.RETURN).click();
}
@Test(priority=2)
public void m2() throws InterruptedException{
	Thread.sleep(5000);
List <WebElement> ele=	driver.findElements(By.tagName("a"));
System.out.println(ele.size());
for(WebElement e1 : ele){
	System.out.println(e1.getAttribute("href"));
}
Thread.sleep(5000);
driver.findElement(By.xpath("//a[@title='Orders']")).click();
driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?controller=my-account'])[2]")).click();
driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category'])[3]")).click();
}
@Test(priority =3)
public void m3(){
	driver.findElement(By.partialLinkText("hemanth")).click();
	driver.findElement(By.partialLinkText("Sing")).click();
}
}
