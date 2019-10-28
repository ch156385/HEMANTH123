package cg_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Change_password {
	// login hrm application and change the password
	WebDriver driver;
@Test(priority=1)
public void login(){
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new  FirefoxDriver();
 driver.navigate().to("https://dssdfs-trials646.orangehrmlive.com");
 System.out.println(driver.getTitle());
 driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
 driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("8147359220");
 driver.findElement(By.xpath("//input[@name='Submit']")).click();
 System.out.println(driver.getTitle());
}
@Test(priority=2)
	public void change_pass() throws InterruptedException{
	driver.findElement(By.xpath("//span[text()='Global HR Manager']")).click();
	driver.findElement(By.xpath("//a[text() ='Change Password']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@id='currentPassword']")).sendKeys("8147359220");
	driver.findElement(By.xpath("//*[@id ='newPassword']")).sendKeys("ch156385");
	driver.findElement(By.xpath("//*[@id='confirmNewPassword']")).sendKeys("ch156385");
	driver.findElement(By.xpath("//text()[.='Save']/ancestor::a[1]")).click();
	
	driver.findElement(By.xpath("//span[text()='Global HR Manager']")).click();
	driver.findElement(By.xpath("//a[@href='/auth/logout']")).click();
	System.out.println(driver.getTitle());
	 driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("ch156385");
	 driver.findElement(By.xpath("//input[@name='Submit']")).click();
	 driver.findElement(By.xpath("//button[text()='×']")).click();
	 driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("8147359220");
	 driver.findElement(By.xpath("//button[@name='Submit']")).click();
//String str =driver.findElement(By.xpath("//div[contains(text(),'Invalid Credentials')]")).getText();
//System.out.println(str);
	}

}

