import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HowworkWithSingleselectDropdown {
public WebDriver driver;
@Test(priority =1)
public void Setup(){
	System.setProperty("WebDriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/newtours/register.php");
}
@Test(priority =2)
public void Dropdown(){
	Select s = new Select(driver.findElement(By.name("country")));
	s.selectByIndex(23);
	WebElement e1 = driver.findElement(By.name("country"));
	System.out.println(e1.getText());
}
}
