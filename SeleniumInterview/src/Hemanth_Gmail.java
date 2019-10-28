import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hemanth_Gmail {
public WebDriver driver;
@BeforeClass
public void m1(){
	System.out.println("Testcase exegution starts");
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver() ;
}
@Test(dataProvider="hemanth" , dataProviderClass = hhh.class)
public void Test1 ( String username, String  Pass) throws InterruptedException{
	try{
	
	driver.get("https://www.google.com/gmail/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys(username);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys(Pass);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	}
	catch (Exception e) {
		System.out.println("hello test case failed ");
	}
}
@AfterClass
public void m2(){
	System.out.println("Testcase exegution completed");
}
/*@DataProvider(name = "hemanth")
public Object[][] value() {
	Object[][] values = null;
	values = new Object[][] { { "reddyhemanth224", "8147359220" }, { "reddyhemanth081", "8147359220" },
			{ "reddyhemanth228", "8147359220" } };
	return values;
}*/
}
