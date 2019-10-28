package qspider.acttime.userRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserList {
	@FindBy(xpath="//span[text()='User']")
	private WebElement UserButton;
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement FNameEditBox;
	@FindBy(id="userDataLightBox_lastNameField")
	private WebElement LNameEditBox;
	@FindBy(id="userDataLightBox_emailField")
	private WebElement EmailEditBox;
	@FindBy(id="userDataLightBox_usernameField")
	private WebElement UseNameEditBox;
	@FindBy(id="userDataLightBox_passwordField")
	private WebElement passwordEditBox;
	@FindBy(id="userDataLightBox_passwordCopyField")
	private WebElement ConformpassEditBox;
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement CreateUserButton;
	@FindBy(id="userDataLightBox_cancelBtn")
	private WebElement cancelButton;
	@FindBy(xpath="//span[@class='userNameSpan']")
	private List<WebElement> listOfUsers;
	public List<WebElement> getListOfUsers() {
		return listOfUsers;
	}
	public WebElement getUserButton() {
		return UserButton;
	}
	public WebElement getFNameEditBox() {
		return FNameEditBox;
	}
	public WebElement getLNameEditBox() {
		return LNameEditBox;
	}
	public WebElement getEmailEditBox() {
		return EmailEditBox;
	}
	public WebElement getUseNameEditBox() {
		return UseNameEditBox;
	}
	public WebElement getPasswordEditBox() {
		return passwordEditBox;
	}
	public WebElement getConformpassEditBox() {
		return ConformpassEditBox;
	}
	public WebElement getCreateUserButton() {
		return CreateUserButton;
	}
	public WebElement getCancelButton() {
		return cancelButton;
	}

}
