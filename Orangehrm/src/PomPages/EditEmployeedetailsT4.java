package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditEmployeedetailsT4 {
public WebDriver driver;
	public EditEmployeedetailsT4(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	@FindBy(how=How.XPATH,using = ".//a[@href='/index.php/pim/viewPimModule']")
	private WebElement PIM;
	@FindBy(how=How.XPATH,using = ".//*[@id='menu_pim_viewEmployeeList']")
	WebElement EmpList;
	@FindBy(how=How.XPATH,using = ".//input[@id='empsearch_employee_name_empName']")
	WebElement EmpName;
	@FindBy(how=How.XPATH,using = ".//*[@id='empsearch_id']")
	WebElement EmpID;
	@FindBy(how=How.XPATH,using = ".//*[@id='searchBtn']")
	WebElement Search;
	public void empsearch1() throws InterruptedException{
		PIM.click();
		Thread.sleep(5000);
		EmpList.click();
		EmpName.sendKeys("Ravi reddy");
		Search.click();
	}
	public void empsearch2() throws InterruptedException{
		PIM.click();
		Thread.sleep(5000);
		EmpList.click();
		EmpID.sendKeys("0141");
		Search.click();
		
	}
}
