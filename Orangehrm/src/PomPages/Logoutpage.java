package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	public WebDriver driver;
	public Logoutpage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using=".//*[@id='welcome']")
	WebElement Clicklogout;
	@FindBy(how=How.XPATH,using=".//a[@href='/index.php/auth/logout']")
	WebElement Click;
	public void verfy(){
		Clicklogout.click();
		 Click.click();
		
	}
}
