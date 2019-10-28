import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PageTitle {
public WebDriver driver;
@Test
public void verfy(){
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	 driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");

	String s1 = driver.getTitle();
	System.out.println(s1);
}
}
