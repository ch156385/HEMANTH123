import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Isclickbule {
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://sunilpatro1985.blogspot.in/p/demo_7.html");
		
		//if element is disabled, then isEnabled() returns false
		WebElement btn_Submit = driver.findElement(By.id("next"));
		System.out.println("Clickable? " + btn_Submit.isEnabled());
		
		driver.findElement(By.id("transcheck1")).click();
		//After 4-5sec, submit button will be enabled
		
		if (isClickable(btn_Submit, driver))
		{
			System.out.println("Clickable? " + btn_Submit.isEnabled());
			btn_Submit.click();
		}
	}
	
	public static boolean isClickable(WebElement el, WebDriver driver) 
	{
		try{
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(el));
			return true;
		}
		catch (Exception e){
			return false;
		}
	}
}
