package Hemanth1;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login2 {
	public WebDriver driver;
By Sign = By.partialLinkText("Sign");
By Username = By.xpath("//input[@id ='email']");
By Pssword = By.xpath("//input[@id ='passwd']");
By Clickon = By.xpath("//button[@id ='SubmitLogin']");
public Login2(WebDriver driver){
	this.driver = driver;
}
public void sign(){
	driver.findElement(Sign).click();
}
public void username(){
	driver.findElement(Username).sendKeys("reddyhemanth224@gmail.com");
}
public void password(){
	driver.findElement(Pssword).sendKeys("8147359220");
}
public void clickon(){
driver.findElement(Clickon).click();
}
}
