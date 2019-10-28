import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Salesforce {
public WebDriver driver;

@Test
public void m1() throws InterruptedException{
System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
driver = new FirefoxDriver();
driver.get("https://www.salesforce.com/in/");
driver.findElement(By.xpath("//*[@class='lazy   img-responsive         ']")).click();
driver.findElement(By.xpath("//*[text()='Try for Free']")).click();
driver.findElement(By.xpath("//input[@id='UserFirstName']")).sendKeys("ch156385@");
driver.findElement(By.xpath("//input[@id='UserLastName']")).sendKeys("9606802307");
Select A = new Select(driver.findElement(By.xpath("(//*[@class='selectBox-label'])[1]")));
A.selectByIndex(4);
driver.findElement(By.xpath("//input[@id='UserEmail']")).sendKeys("reddyhemant081@gmail.com");
driver.findElement(By.xpath("//input[@id='UserPhone']")).sendKeys("9606802307");
driver.findElement(By.xpath("//input[@id='CompanyName']")).sendKeys("fidzeal");
Select A1 = new Select(driver.findElement(By.xpath("(//*[@class='selectBox-label'])[2]")));
A1.selectByIndex(2);
Select A2 = new Select(driver.findElement(By.xpath("(//*[@class='selectBox-label'])[3]")));
A2.selectByIndex(2);
Select A3 = new Select(driver.findElement(By.xpath("(//*[@class='selectBox-label'])[4]")));
A3.selectByIndex(2);
driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//*[@class='submit aloha-submit-mid-blue radius-flat-all btn bg-gradient-darkblue placeholder-style']")).click();
}
}

