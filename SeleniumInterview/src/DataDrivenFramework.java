import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFramework {
public WebDriver driver;
@Test(dataProvider = "Emaildata")
public void Login(String username, String  Pass) throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.google.com/gmail/");
	driver.findElement(By.xpath(".//*[@autocomplete='username']")).sendKeys(username);
	Actions a = new Actions(driver);
	a.sendKeys(Keys.RETURN).perform();;
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//input[@autocomplete='current-password']")).sendKeys(Pass);
	a.sendKeys(Keys.RETURN).perform();
	Thread.sleep(5000);
	Assert.assertTrue(driver.getTitle().contains("Gmail")," it is not their please enter other one");
	System.out.println( "page title  is pass  sussly");
}
@AfterMethod
public void teardown(){
	driver.quit();
}
@DataProvider(name = "Emaildata")
public Object[][] passData(){
	ExcelConfigReader config = new ExcelConfigReader("C:\\Users\\Hemanth\\Desktop\\Selenium\\SeleniumInterview\\Excel\\Hemanth.xlsx");
	int rows =config.getRowCount(0);
	Object[][] data = new Object[rows][2];
	for (int i =0; i<rows ;i++){
		data[i][0] = config.getdata(0, i, 0);
		data[i][1] = config.getdata(0, i, 1);
		
		
	}
	return data;
}
}
