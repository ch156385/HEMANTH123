package cg_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Logout_Testcase2 {
	public WebDriver driver;
@Test(priority = 1)
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
public void logout(){
	driver.findElement(By.xpath("//span[text()='Global HR Manager']")).click();
	driver.findElement(By.xpath("//a[@href='/auth/logout']")).click();
	System.out.println(driver.getTitle());
}
}
