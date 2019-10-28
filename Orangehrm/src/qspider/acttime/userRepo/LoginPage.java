package qspider.acttime.userRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import qspider.acttime.genricLib.CommWebMethods;
import qspider.acttime.genricLib.Const;
import qspider.acttime.genricLib.Log;

public class LoginPage  extends CommWebMethods{
	@FindBy(id="username")
	private WebElement userNameTextField;
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}
	public void loginOperation(){
		Log.configur();
		expcitlyWait(userNameTextField);
		userNameTextField.sendKeys(Const.userName);
		Log.info("username send");
		
		passwordTextField.sendKeys(Const.passWord);
		Log.info("password send");
		expcitlyWait(loginButton);
		loginButton.click();
		Log.info("Login done");
	}
	

}
