package Hemanth1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class Login1 {
	public WebDriver driver;
	public Login1(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="http://automationpractice.com/index.php?controller=authentication&back=my-account")
	WebElement  Login ;
	@FindBy(how=How.XPATH,using ="//input[@id ='email']")
	WebElement id;
	@FindBy(how=How.XPATH,using ="//input[@id ='passwd']")
	WebElement pass;
	@FindBy(how=How.XPATH,using ="//button[@id ='SubmitLogin']")
	WebElement Clickon;
	public void login(){
		Login.click();
		id.sendKeys("reddyhemanth224@gmail.com");
		pass.sendKeys("8147359220");
		Clickon.click();
	}
}
