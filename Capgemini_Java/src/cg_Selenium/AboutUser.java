/**
 * 
 */
package cg_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author Hemanth
 * login to hrm application and click on about me
 */
public class AboutUser {
	public WebDriver driver;
	@Test(priority =1)
	public void login(){
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new  FirefoxDriver();
 driver.navigate().to("https://dssdfs-trials646.orangehrmlive.com");
 System.out.println(driver.getTitle());
 driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
 driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("8147359220");
 driver.findElement(By.xpath("//input[@name='Submit']")).click();
}
	@Test(priority =2)
	public void about_me(){
		driver.findElement(By.xpath("//span[text()='Jacqueline White']")).click();
		driver.findElement(By.xpath("//a[@id='aboutDisplayLink']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("heartbeatSubmitBtn")).click();
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//span[text()='Global HR Manager']")).click();
	driver.findElement(By.xpath("//a[@href='/auth/logout']")).click();
	System.out.println(driver.getTitle());	
	}
}
