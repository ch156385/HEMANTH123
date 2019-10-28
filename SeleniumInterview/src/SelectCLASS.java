import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectCLASS {
	public WebDriver driver;
 @Test(priority =1)
public void Setup(){
 System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
 driver = new FirefoxDriver();
 driver.get("http://demo.guru99.com/test/newtours/register.php");
 driver.findElement(By.xpath("//a[@href ='register.php']")).click();
 driver.findElement(By.xpath("//input[@name= 'firstName']")).sendKeys("Hemanth");
 driver.findElement(By.xpath("//input[@name= 'lastName']")).sendKeys("reddy");
 driver.findElement(By.xpath("//input[@name= 'phone']")).sendKeys("8147359220");
 driver.findElement(By.xpath(".//input[@name='userName']")).sendKeys("reddyhemanth224@gmail.com");
 driver.findElement(By.xpath(".//input[@name='address1']")).sendKeys("hhfshgfgfgaj");
}
 @Test(priority =2)
 public void verfy(){
	 driver.findElement(By.xpath("//input[@name='city']")).sendKeys("jgfgdsgjdj");
	 driver.findElement(By.xpath("//input[@name='state']")).sendKeys("afggafgfj");
	 driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("487562");
	 }
 @Test(priority =2)
 public void Dropdown() throws InterruptedException{
	 Thread.sleep(5000);
	 WebElement ele = driver.findElement(By.xpath("//*[@name='country']"));
	 Thread.sleep(5000);
	 Select s1 = new Select(ele);
	 s1.selectByIndex(8);
	 WebElement ele1 =s1.getFirstSelectedOption();
	 System.out.println(ele1.getText());
	 s1.selectByVisibleText("INDIA");
	 WebElement ele2 =s1.getFirstSelectedOption();;
	 System.out.println(ele2.getText());
	 s1.selectByValue("INDIA");
	 WebElement ele3 =s1.getFirstSelectedOption();;
	 System.out.println(ele3.getText());
 }
}
