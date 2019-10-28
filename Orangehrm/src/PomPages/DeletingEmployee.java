package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeletingEmployee {
public WebDriver driver;
public DeletingEmployee(WebDriver driver){
	PageFactory.initElements(driver,this);
}
@FindBy(how=How.XPATH,using = ".//a[@href='/index.php/pim/viewPimModule']")
WebElement PIM;
@FindBy(how=How.XPATH,using = ".//*[@id='menu_pim_viewEmployeeList']")
WebElement EmpList;
@FindBy(how=How.XPATH,using = ".//input[@id='empsearch_employee_name_empName']")
WebElement EmpName;
@FindBy(how=How.XPATH,using = ".//*[@id='searchBtn']")
WebElement Search;
@FindBy(how=How.XPATH,using = ".//*[@id='ohrmList_chkSelectRecord_67']")
WebElement Selecting;
@FindBy(how=How.XPATH,using=".//input[@id='btnDelete']")
WebElement ClickDelete;
public void deletingemployee() throws InterruptedException{
	PIM.click();
	Thread.sleep(5000);
	EmpList.click();
	EmpName.sendKeys("Ravi reddy");
	Search.click();
	Selecting.click();
	Thread.sleep(5000);
	ClickDelete.click();
	
}
}
