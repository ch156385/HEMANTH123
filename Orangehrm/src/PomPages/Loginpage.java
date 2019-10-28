package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
public WebDriver driver;
public Loginpage (WebDriver driver){
	PageFactory.initElements(driver, this);
}
@FindBy(how=How.XPATH,using=".//input[@name='txtUsername']")
WebElement username;
@FindBy(how=How.XPATH,using=".//input[@name='txtPassword']")
WebElement passWord;
@FindBy(how=How.XPATH,using=".//input[@name='Submit']")
WebElement Login;
public void VerfyLogin(String Username, String Password){
	username.sendKeys(Username);
	passWord.sendKeys(Password);
	Login.click();
	
}
}
