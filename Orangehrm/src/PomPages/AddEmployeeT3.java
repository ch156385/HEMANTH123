package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeeT3 {
public WebDriver driver;
public AddEmployeeT3(WebDriver driver){
	PageFactory.initElements(driver,this);
}
@FindBy(how=How.XPATH,using = ".//a[@href='/index.php/pim/viewPimModule']")
WebElement PIM;
@FindBy(how=How.XPATH,using=".//*[@id='menu_pim_addEmployee']")
WebElement AddEmployee;
@FindBy(how=How.XPATH,using =".//*[@id='firstName']")
WebElement FirstName;
@FindBy(how=How.XPATH,using =".//*[@id='middleName']")
WebElement MiddleName;
@FindBy(how=How.XPATH,using =".//*[@name='lastName']")
WebElement LastName;
@FindBy(how=How.XPATH,using =".//input[@name='employeeId']")
WebElement ID;
@FindBy(how=How.XPATH,using =".//*[@value='Save']")
WebElement Save;
public void addemployee() throws InterruptedException{
	PIM.click();
	Thread.sleep(5000);
	AddEmployee.click();
	FirstName.sendKeys("Hemanth");
	MiddleName.sendKeys("reddy");
	LastName.sendKeys("chilari");
	ID.sendKeys("12345");
	
}
}
