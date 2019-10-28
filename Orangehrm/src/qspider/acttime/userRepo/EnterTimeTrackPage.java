package qspider.acttime.userRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import qspider.acttime.genricLib.CommWebMethods;

public class EnterTimeTrackPage extends CommWebMethods{
	@FindBy(xpath="//div[text()='Users']")
	private WebElement UsersLink;

	public WebElement getUsersLink() {
		return UsersLink;
	}
	

}
